package com.jagex;
public class Class239 {

	static int anInt2935 = 16777215;
	static int anInt2932 = 13156520;
	static int anInt2942 = 5145;
	long aLong2936 = 0L;
	int anInt2946 = 0;
	int anInt2945 = -1;
	boolean aBool2947 = false;
	Vector3 aClass385_2952 = new Vector3(-50.0F, -60.0F, -50.0F);
	SoftCache aClass229_2953 = new SoftCache(9);
	SoftCache aClass229_2954 = new SoftCache(9);
	GraphicalRenderer aGraphicalRenderer_2944;
	Class535[][] aClass535ArrayArray2943;
	static Class247 aClass247_2940;
	Class535 aClass535_2948;
	Class535 aClass535_2951;
	Class535 aClass535_2937;
	Class535 aClass535_2931;

	public void method4037(MapRegion mapregion_1, byte b_2) {
		if (!Class97.loggedOutState(client.gameState) && !Node_Sub17.inLobby(client.gameState)) {
			int i_3 = -1;
			int i_4 = -1;
			if (VertexNormal.MY_PLAYER != null) {
				i_3 = VertexNormal.MY_PLAYER.regionBaseX[0] >> 3;
				i_4 = VertexNormal.MY_PLAYER.regionBaseY[0] >> 3;
			}
			if (i_3 >= 0 && i_3 < mapregion_1.getSizeX() >> 3 && i_4 >= 0 && i_4 < mapregion_1.getSizeY() >> 3) {
				this.method4072(i_3, i_4, anInt2942, -1945601333);
			} else {
				this.method4072(mapregion_1.getSizeX() >> 4, mapregion_1.getSizeY() >> 4, 0, -1860642378);
			}
		} else {
			this.method4072(IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX >> 12, Class246.CAM_MOVE_ABSOLUTEY >> 12, anInt2942, -1959454932);
		}
		this.method4065();
		this.method4049((byte) 97);
		this.method4051();
		this.method4075(-2065291582);
	}

	public Class535 method4038(short s_1) {
		return this.aClass535_2951;
	}

	public void method4039(Class239 class239_1) {
		this.aClass535_2951.method11444(class239_1.aClass535_2951);
		this.aClass535_2937.method11444(class239_1.aClass535_2937);
		this.aClass535_2931.method11444(class239_1.aClass535_2931);
		this.aLong2936 = class239_1.aLong2936;
		this.anInt2946 = class239_1.anInt2946;
		this.anInt2945 = class239_1.anInt2945;
	}

	public void method4040() {
		this.aClass229_2953.method3859();
		this.aClass229_2954.method3859();
	}

	public void method4044() {
		for (int i_2 = 0; i_2 < this.aClass535ArrayArray2943.length; i_2++) {
			for (int i_3 = 0; i_3 < this.aClass535ArrayArray2943[i_2].length; i_3++) {
				this.aClass535ArrayArray2943[i_2][i_3] = this.aClass535_2948;
			}
		}
	}

	public void method4045(int i_1, int i_2) {
		Class535 class535_4 = this.aClass535ArrayArray2943[i_1][i_2];
		if (class535_4 != null) {
			this.aClass385_2952.copy(class535_4.aClass385_7084);
		}
		this.method4049((byte) 70);
	}

	public void method4048() {
		this.aBool2947 = true;
	}

	void method4049(byte b_1) {
		this.aGraphicalRenderer_2944.IA((0.7F + (float) Class393.preferences.brightness.method12865() * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(-1566103967)) * this.aClass535_2951.aFloat7081);
		this.aGraphicalRenderer_2944.m(this.aClass535_2951.anInt7083, this.aClass535_2951.aFloat7082, this.aClass535_2951.aFloat7090, (float) ((int) this.aClass385_2952.x << 2), (float) ((int) this.aClass385_2952.y << 2), (float) ((int) this.aClass385_2952.z << 2));
		this.aGraphicalRenderer_2944.method8477(this.aClass535_2951.aClass152_7087);
	}

	Class247 method4050(int i_1, int i_2, int i_3, int i_4) {
		long long_6 = ((long) i_2 & 0xffffL) << 48 | ((long) i_3 & 0xffffL) << 32 | ((long) i_4 & 0xffffL) << 16 | (long) i_1 & 0xffffL;
		Class247 class247_8 = (Class247) this.aClass229_2954.get(long_6);
		if (class247_8 == null) {
			class247_8 = IndexLoaders.SKYBOX_LOADER.method5077(i_1, i_2, i_3, i_4, IndexLoaders.SUN_LOADER, 1868752196);
			this.aClass229_2954.put(class247_8, long_6);
		}
		return class247_8;
	}

	void method4051() {
		this.aGraphicalRenderer_2944.method8472(this.aClass535_2951.aFloat7080, this.aClass535_2951.aFloat7088, this.aClass535_2951.aFloat7089);
	}

	public void method4052() {
		this.aGraphicalRenderer_2944.IA((0.7F + (float) Class393.preferences.brightness.method12865() * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(-1614008770)) * 1.1523438F);
		this.aGraphicalRenderer_2944.m(anInt2935, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aGraphicalRenderer_2944.c(anInt2932, -1, 0);
		this.aGraphicalRenderer_2944.method8477(Class81.aClass152_802);
	}

	public void method4056(int i_1, int i_2, Class535 class535_3, byte b_4) {
		this.aClass535ArrayArray2943[i_1][i_2] = class535_3;
	}

	Class152 method4064(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		long long_8 = 67481L * (long) i_1 ^ 97549L * (long) i_2 ^ 475427L * (long) i_3 ^ 986053L * (long) i_4 ^ (long) i_5 * 32147369L ^ 76724863L * (long) i_6;
		Class152 class152_10 = (Class152) this.aClass229_2953.get(long_8);
		if (class152_10 != null) {
			return class152_10;
		} else {
			class152_10 = this.aGraphicalRenderer_2944.method8466(i_1, i_2, i_3, i_4, i_5, i_6);
			this.aClass229_2953.put(class152_10, long_8);
			return class152_10;
		}
	}

	void method4065() {
		if (this.anInt2945 >= 0) {
			long long_2 = Utils.time();
			this.anInt2945 = (int) ((long) (this.anInt2945) - (long_2 - this.aLong2936));
			if (this.anInt2945 > 0) {
				this.aClass535_2951.method11445(this.aGraphicalRenderer_2944, this.aClass535_2937, this.aClass535_2931, (float) (this.anInt2946 - this.anInt2945) / (float) this.anInt2946);
			} else {
				this.aClass535_2951.method11444(this.aClass535_2931);
				if (this.aClass535_2951.aClass247_7091 != null) {
					this.aClass535_2951.aClass247_7091.method4209();
				}
				this.anInt2945 = -1;
			}
			this.aLong2936 = long_2;
		}
	}

	void method4072(int i_1, int i_2, int i_3, int i_4) {
		Class535 class535_5 = this.aClass535ArrayArray2943[i_1][i_2];
		if (class535_5 == null) {
			class535_5 = this.aClass535_2948;
		}
		if (this.aBool2947) {
			this.aBool2947 = false;
			i_3 = 0;
		}
		if (!this.aClass535_2931.method11449(class535_5)) {
			this.aClass535_2931.method11444(class535_5);
			this.aLong2936 = Utils.time();
			this.anInt2946 = this.anInt2945 = i_3;
			if (this.anInt2946 != 0) {
				this.aClass535_2937.method11444(this.aClass535_2951);
				if (this.aClass535_2951.aClass247_7091 != null) {
					if (this.aClass535_2951.aClass247_7091.method4210()) {
						this.aClass535_2951.aClass247_7091 = this.aClass535_2937.aClass247_7091 = this.aClass535_2951.aClass247_7091.method4211();
					}
					if (this.aClass535_2951.aClass247_7091 != null && this.aClass535_2951.aClass247_7091 != this.aClass535_2931.aClass247_7091) {
						this.aClass535_2951.aClass247_7091.method4208(this.aClass535_2931.aClass247_7091);
					}
				}
			}
		}
	}

	public void method4075(int i_1) {
		byte b_2 = 0;
		int i_3 = (this.aClass535_2951.anInt7086 + 256 << 2) + b_2;
		this.aGraphicalRenderer_2944.c(this.aClass535_2951.anInt7085, Class393.preferences.fog.method13417(-2079793648) == 1 ? i_3 : -1, 0);
	}

	public Class239(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		this.aGraphicalRenderer_2944 = graphicalrenderer_1;
		this.aClass535ArrayArray2943 = new Class535[i_2][i_3];
		if (HitsplatIndexLoader.anIntArray2668 != null) {
			Class81.aClass152_802 = this.method4064(HitsplatIndexLoader.anIntArray2668[0], HitsplatIndexLoader.anIntArray2668[1], HitsplatIndexLoader.anIntArray2668[2], HitsplatIndexLoader.anIntArray2668[3], HitsplatIndexLoader.anIntArray2668[4], HitsplatIndexLoader.anIntArray2668[5], 106789318);
		}
		aClass247_2940 = null;
		this.aClass535_2948 = new Class535();
		this.aClass535_2951 = new Class535();
		this.aClass535_2937 = new Class535();
		this.aClass535_2931 = new Class535();
		this.method4048();
	}

	public static void method4090(int[] ints_0, int[] ints_1, int i_2) {
		if (ints_0 != null && ints_1 != null) {
			CircularBuffer.anIntArray5773 = ints_0;
			Class412.anIntArray4962 = new int[ints_0.length];
			IcmpService_Sub1.aByteArrayArrayArray7963 = new byte[ints_0.length][][];
			for (int i_3 = 0; i_3 < CircularBuffer.anIntArray5773.length; i_3++) {
				IcmpService_Sub1.aByteArrayArrayArray7963[i_3] = new byte[ints_1[i_3]][];
			}
		} else {
			CircularBuffer.anIntArray5773 = null;
			Class412.anIntArray4962 = null;
			IcmpService_Sub1.aByteArrayArrayArray7963 = null;
		}
	}
}