import java.awt.Font;

public class SpotAnimIndexLoader {

	static Font aFont5893;
	SoftCache aClass229_5891 = new SoftCache(64);
	SoftCache aClass229_5890 = new SoftCache(60);
	Index aClass317_5888;
	Index aClass317_5889;
	int anInt5892;

	public SpotAnimIndexLoader(Game game_1, Language xlanguage_2, Index index_3, Index index_4) {
		this.aClass317_5888 = index_3;
		this.aClass317_5889 = index_4;
		int i_5 = this.aClass317_5888.containersCount() - 1;
		SharedConfigsType.SPOT_ANIMS.filesPerContainer(-397238873);
		this.aClass317_5888.filesCount(i_5);
	}

	public SpotAnimDefinitions getSpotAnimDefs(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_5891;
		SpotAnimDefinitions spotanimdefinitions_3;
		synchronized (this.aClass229_5891) {
			spotanimdefinitions_3 = (SpotAnimDefinitions) this.aClass229_5891.get((long) i_1);
		}

		if (spotanimdefinitions_3 != null) {
			return spotanimdefinitions_3;
		} else {
			Index index_5 = this.aClass317_5888;
			byte[] bytes_10;
			synchronized (this.aClass317_5888) {
				bytes_10 = this.aClass317_5888.getFile(SharedConfigsType.SPOT_ANIMS.containerId(i_1), SharedConfigsType.SPOT_ANIMS.fileId(i_1));
			}

			spotanimdefinitions_3 = new SpotAnimDefinitions();
			spotanimdefinitions_3.aClass515_6973 = this;
			spotanimdefinitions_3.anInt6969 = i_1;
			if (bytes_10 != null) {
				spotanimdefinitions_3.method11226(new RsByteBuffer(bytes_10), 91916290);
			}

			SoftCache softcache_9 = this.aClass229_5891;
			synchronized (this.aClass229_5891) {
				this.aClass229_5891.put(spotanimdefinitions_3, (long) i_1);
				return spotanimdefinitions_3;
			}
		}
	}

	public void method8846(int i_1, byte b_2) {
		this.anInt5892 = i_1;
		SoftCache softcache_3 = this.aClass229_5890;
		synchronized (this.aClass229_5890) {
			this.aClass229_5890.method3859(1433473768);
		}
	}

	public void method8847(int i_1, int i_2) {
		SoftCache softcache_3 = this.aClass229_5891;
		synchronized (this.aClass229_5891) {
			this.aClass229_5891.method3858(i_1, (byte) 28);
		}

		softcache_3 = this.aClass229_5890;
		synchronized (this.aClass229_5890) {
			this.aClass229_5890.method3858(i_1, (byte) 23);
		}
	}

	public void method8848(int i_1) {
		SoftCache softcache_2 = this.aClass229_5891;
		synchronized (this.aClass229_5891) {
			this.aClass229_5891.method3859(128096981);
		}

		softcache_2 = this.aClass229_5890;
		synchronized (this.aClass229_5890) {
			this.aClass229_5890.method3859(-1366287850);
		}
	}

	public void method8849(short s_1) {
		SoftCache softcache_2 = this.aClass229_5891;
		synchronized (this.aClass229_5891) {
			this.aClass229_5891.method3863(1832676736);
		}

		softcache_2 = this.aClass229_5890;
		synchronized (this.aClass229_5890) {
			this.aClass229_5890.method3863(1443039032);
		}
	}

	public static NativeSprite method8858(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2) {
		Class282_Sub37 class282_sub37_3 = (Class282_Sub37) Class492.aClass465_5774.method7754((long) i_1);
		if (class282_sub37_3 != null) {
			Class282_Sub41_Sub3 class282_sub41_sub3_4 = class282_sub37_3.aClass278_Sub1_8001.method4918(1179079332);
			class282_sub37_3.aBool7996 = true;
			if (class282_sub41_sub3_4 != null) {
				Class492.aClass502_5776.aClass505_5829 = graphicalrenderer_0;
				return (NativeSprite) class282_sub41_sub3_4.method14795(Class492.aClass502_5776, -1234291023);
			}
		}

		return null;
	}

	static final void method8859(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Class235.method3965(icomponentdefinitions_4, cs2executor_0, -757819357);
	}

	public static final void method8860(byte b_0) {
		if (client.anInt7277 != -1 && client.anInt7448 != -1) {
			int i_1 = ((client.anInt7182 - client.anInt7327) * client.anInt7256 >> 16) + client.anInt7327;
			client.anInt7256 += i_1;
			if (client.anInt7256 >= 65535) {
				client.anInt7256 = 65535;
				if (!client.aBool7285) {
					client.aBool7355 = true;
				} else {
					client.aBool7355 = false;
				}

				client.aBool7285 = true;
			} else {
				client.aBool7355 = false;
				client.aBool7285 = false;
			}

			float f_2 = (float) client.anInt7256 / 65535.0F;
			float[] floats_3 = new float[3];
			int i_4 = client.anInt7279 * 2;

			int i_7;
			int i_8;
			int i_9;
			int i_10;
			int i_12;
			int i_18;
			for (int i_5 = 0; i_5 < 3; i_5++) {
				int i_17 = client.anIntArrayArrayArray7302[client.anInt7277][i_4][i_5] * 3;
				i_7 = client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 1][i_5] * 3;
				i_8 = (client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 2][i_5] - (client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 3][i_5] - client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 2][i_5])) * 3;
				i_9 = client.anIntArrayArrayArray7302[client.anInt7277][i_4][i_5];
				i_10 = i_7 - i_17;
				i_18 = i_17 - i_7 * 2 + i_8;
				i_12 = client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 2][i_5] - i_9 + i_7 - i_8;
				floats_3[i_5] = (float) i_9 + (((float) i_12 * f_2 + (float) i_18) * f_2 + (float) i_10) * f_2;
			}

			CoordGrid coordgrid_16 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1394522751);
			Class31.anInt361 = (int) floats_3[0] - coordgrid_16.x * 512;
			Class109_Sub1.anInt9384 = (int) floats_3[1] * -1;
			Class246.anInt3029 = (int) floats_3[2] - coordgrid_16.y * 512;
			float[] floats_6 = new float[3];
			i_7 = client.anInt7280 * 2;

			for (i_8 = 0; i_8 < 3; i_8++) {
				i_9 = client.anIntArrayArrayArray7302[client.anInt7448][i_7][i_8] * 3;
				i_10 = client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 1][i_8] * 3;
				i_18 = (client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 2][i_8] - (client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 3][i_8] - client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 2][i_8])) * 3;
				i_12 = client.anIntArrayArrayArray7302[client.anInt7448][i_7][i_8];
				int i_13 = i_10 - i_9;
				int i_14 = i_9 - i_10 * 2 + i_18;
				int i_15 = i_10 + (client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 2][i_8] - i_12) - i_18;
				floats_6[i_8] = f_2 * (((float) i_14 + f_2 * (float) i_15) * f_2 + (float) i_13) + (float) i_12;
			}

			float f_19 = floats_6[0] - floats_3[0];
			float f_20 = -1.0F * (floats_6[1] - floats_3[1]);
			float f_21 = floats_6[2] - floats_3[2];
			double d_11 = Math.sqrt((double) (f_21 * f_21 + f_19 * f_19));
			Class293.anInt3512 = (int) (Math.atan2((double) f_20, d_11) * 2607.5945876176133D) & 0x3fff;
			AnimationDefinitions.anInt5930 = (int) (-Math.atan2((double) f_19, (double) f_21) * 2607.5945876176133D) & 0x3fff;
			Class121.anInt1525 = ((client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 2][3] - client.anIntArrayArrayArray7302[client.anInt7277][i_4][3]) * client.anInt7256 >> 16) + client.anIntArrayArrayArray7302[client.anInt7277][i_4][3];
		}

	}

	public static int method8861(int i_0, int i_1, boolean bool_2, int i_3) {
		Class282_Sub30 class282_sub30_4 = CS2Runner.method11127(i_0, bool_2, 1815831231);
		return class282_sub30_4 == null ? -1 : (i_1 >= 0 && i_1 < class282_sub30_4.anIntArray7710.length ? class282_sub30_4.anIntArray7710[i_1] : -1);
	}

	public static void method8862(int i_0, int i_1, int i_2, boolean bool_3, int i_4) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1767720477) != 0) {
			Class291_Sub1.anInt8021 = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-124335836);
			Class538.method11500(0, true, (byte) 24);
		} else {
			Class122.method2111(false, 662490589);
		}

		Class291_Sub1.anInt8019 = i_1;
		Class291_Sub1.anInt8020 = i_2;
		Class291_Sub1.aBool8028 = bool_3;
		Class291_Sub1.method5128(i_0);
	}

	static final void method8863(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1299;
	}

}