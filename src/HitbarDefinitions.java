public class HitbarDefinitions {

	Class290 aClass290_2437;
	public static int CAMERA_ZOOM = 600;
	public int anInt2446 = 255;
	public int anInt2440 = 255;
	public int anInt2439 = -1;
	public int anInt2443 = 70;
	int anInt2444 = -1;
	int anInt2445 = -1;
	int anInt2441 = -1;
	int anInt2447 = -1;
	public int anInt2442 = 1;

	void method3206(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 1) {
			rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 2) {
			this.anInt2446 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 3) {
			this.anInt2440 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 4) {
			this.anInt2439 = 0;
		} else if (i_2 == 5) {
			this.anInt2443 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 6) {
			rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 7) {
			this.anInt2444 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 8) {
			this.anInt2445 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 9) {
			this.anInt2441 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 10) {
			this.anInt2447 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 11) {
			this.anInt2439 = rsbytebuffer_1.readUnsignedShort();
		}

	}

	public NativeSprite method3207(GraphicalRenderer graphicalrenderer_1, int i_2) {
		if (this.anInt2444 < 0) {
			return null;
		} else {
			NativeSprite nativesprite_3 = (NativeSprite) this.aClass290_2437.aClass229_3447.get((long) this.anInt2444);
			if (nativesprite_3 == null) {
				this.method3211(graphicalrenderer_1, (byte) 74);
				nativesprite_3 = (NativeSprite) this.aClass290_2437.aClass229_3447.get((long) this.anInt2444);
			}

			return nativesprite_3;
		}
	}

	public NativeSprite method3208(GraphicalRenderer graphicalrenderer_1, int i_2) {
		if (this.anInt2445 < 0) {
			return null;
		} else {
			NativeSprite nativesprite_3 = (NativeSprite) this.aClass290_2437.aClass229_3447.get((long) this.anInt2445);
			if (nativesprite_3 == null) {
				this.method3211(graphicalrenderer_1, (byte) 2);
				nativesprite_3 = (NativeSprite) this.aClass290_2437.aClass229_3447.get((long) this.anInt2445);
			}

			return nativesprite_3;
		}
	}

	void method3210(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method3206(rsbytebuffer_1, i_3, -1413100161);
		}
	}

	void method3211(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		Index index_3 = this.aClass290_2437.aClass317_3448;
		Class91 class91_4;
		if (this.anInt2444 >= 0 && this.aClass290_2437.aClass229_3447.get((long) this.anInt2444) == null && index_3.method5661(this.anInt2444, -1437687942)) {
			class91_4 = Class91.method1515(index_3, this.anInt2444);
			this.aClass290_2437.aClass229_3447.put(graphicalrenderer_1.method8444(class91_4, true), (long) this.anInt2444);
		}

		if (this.anInt2445 >= 0 && this.aClass290_2437.aClass229_3447.get((long) this.anInt2445) == null && index_3.method5661(this.anInt2445, 2010871682)) {
			class91_4 = Class91.method1515(index_3, this.anInt2445);
			this.aClass290_2437.aClass229_3447.put(graphicalrenderer_1.method8444(class91_4, true), (long) this.anInt2445);
		}

		if (this.anInt2441 >= 0 && this.aClass290_2437.aClass229_3447.get((long) this.anInt2441) == null && index_3.method5661(this.anInt2441, 121971957)) {
			class91_4 = Class91.method1515(index_3, this.anInt2441);
			this.aClass290_2437.aClass229_3447.put(graphicalrenderer_1.method8444(class91_4, true), (long) this.anInt2441);
		}

		if (this.anInt2447 >= 0 && this.aClass290_2437.aClass229_3447.get((long) this.anInt2447) == null && index_3.method5661(this.anInt2447, -11371692)) {
			class91_4 = Class91.method1515(index_3, this.anInt2447);
			this.aClass290_2437.aClass229_3447.put(graphicalrenderer_1.method8444(class91_4, true), (long) this.anInt2447);
		}

	}

	public NativeSprite method3222(GraphicalRenderer graphicalrenderer_1, int i_2) {
		if (this.anInt2441 < 0) {
			return this.method3207(graphicalrenderer_1, -1561879417);
		} else {
			NativeSprite nativesprite_3 = (NativeSprite) this.aClass290_2437.aClass229_3447.get((long) this.anInt2441);
			if (nativesprite_3 == null) {
				this.method3211(graphicalrenderer_1, (byte) 15);
				nativesprite_3 = (NativeSprite) this.aClass290_2437.aClass229_3447.get((long) this.anInt2441);
			}

			return nativesprite_3;
		}
	}

	public NativeSprite method3224(GraphicalRenderer graphicalrenderer_1, int i_2) {
		if (this.anInt2447 < 0) {
			return this.method3208(graphicalrenderer_1, 549654584);
		} else {
			NativeSprite nativesprite_3 = (NativeSprite) this.aClass290_2437.aClass229_3447.get((long) this.anInt2447);
			if (nativesprite_3 == null) {
				this.method3211(graphicalrenderer_1, (byte) -2);
				nativesprite_3 = (NativeSprite) this.aClass290_2437.aClass229_3447.get((long) this.anInt2447);
			}

			return nativesprite_3;
		}
	}

	static final void method3228(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class252.method4327(i_2, i_3, false, false, (byte) -108);
	}

	static final void method3229(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 1626966641).anInt5050;
	}

	static void method3230(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte b_7) {
		int i_8 = i_2 + i_6;
		int i_9 = i_3 - i_6;

		int i_10;
		for (i_10 = i_2; i_10 < i_8; i_10++) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_10], i_0, i_1, i_5, (byte) 42);
		}

		for (i_10 = i_3; i_10 > i_9; --i_10) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_10], i_0, i_1, i_5, (byte) 20);
		}

		i_10 = i_0 + i_6;
		int i_11 = i_1 - i_6;

		for (int i_12 = i_8; i_12 <= i_9; i_12++) {
			int[] ints_13 = Class532_Sub1.anIntArrayArray7072[i_12];
			Class232.method3922(ints_13, i_0, i_10, i_5, (byte) -24);
			Class232.method3922(ints_13, i_10, i_11, i_4, (byte) -35);
			Class232.method3922(ints_13, i_11, i_1, i_5, (byte) -33);
		}

	}

	static final void method3231(int i_0, int i_1, int i_2, int i_3, boolean bool_4, int i_5) {
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-2133910723) == null) {
			Renderers.SOFTWARE_RENDERER.method8425(i_0, i_1, i_2, i_3, -16777216, (byte) -114);
		} else {
			Vector3 vector3_6 = Class84.myPlayer.method11166().aClass385_3595;
			boolean bool_7 = false;
			if (client.anInt7341 != 1) {
				if (!client.aBool7321) {
					bool_7 = true;
				}
			} else if ((int) vector3_6.x < 0 || (int) vector3_6.x >= IndexLoaders.MAP_REGION_DECODER.getSizeX(56329418) * 512 || (int) vector3_6.z < 0 || (int) vector3_6.z >= IndexLoaders.MAP_REGION_DECODER.getSizeY(-639715489) * 512) {
				bool_7 = true;
			}

			if (bool_7) {
				Renderers.SOFTWARE_RENDERER.method8425(i_0, i_1, i_2, i_3, -16777216, (byte) -104);
			} else {
				++client.anInt7286;
				if (Class84.myPlayer != null && (int) vector3_6.x - (Class84.myPlayer.getSize(828768449) - 1) * 256 >> 9 == Class187.anInt2361 && (int) vector3_6.z - (Class84.myPlayer.getSize(828768449) - 1) * 256 >> 9 == Class187.anInt2359) {
					Class187.anInt2361 = -1;
					Class187.anInt2359 = -1;
					Class282_Sub20_Sub9.method15255((short) -25188);
				}

				Class52_Sub3.method14519((short) -3339);
				if (!bool_4) {
					Class113.method1883(-782258901);
				}

				Class258.method4569(2030083664);
				Class492.method8265(i_0, i_1, i_2, i_3, true, (byte) 63);
				i_0 = client.anInt7444;
				i_1 = client.anInt7445;
				i_2 = client.anInt7188;
				i_3 = client.anInt7440;
				Class380.method6451(i_0, i_1, -1689058679);
				int i_8;
				int i_9;
				if (NativeLibraryLoader.anInt3240 == 2) {
					i_8 = (int) client.aFloat7146;
					if (client.anInt7273 >> 8 > i_8) {
						i_8 = client.anInt7273 >> 8;
					}

					if (client.aBoolArray7431[4] && client.anIntArray7433[4] + 128 > i_8) {
						i_8 = client.anIntArray7433[4] + 128;
					}

					i_9 = (int) client.aFloat7365 + client.anInt7343 & 0x3fff;
					LoadingStage.method6683(Class11.anInt122, Class504.method8389((int) vector3_6.x, (int) vector3_6.z, Class4.anInt35, (byte) 13) - 200, Class266.anInt3289, i_8, i_9, (i_8 >> 3) * 3 + CAMERA_ZOOM << 2, i_3, 1262873702);
				} else if (NativeLibraryLoader.anInt3240 == 4) {
					i_8 = (int) client.aFloat7146;
					if (client.anInt7273 >> 8 > i_8) {
						i_8 = client.anInt7273 >> 8;
					}

					if (client.aBoolArray7431[4] && client.anIntArray7433[4] + 128 > i_8) {
						i_8 = client.anIntArray7433[4] + 128;
					}

					i_9 = (int) client.aFloat7365 & 0x3fff;
					LoadingStage.method6683(Class11.anInt122, Class504.method8389(client.anInt7262, client.anInt7376, Class4.anInt35, (byte) 101) - 200, Class266.anInt3289, i_8, i_9, (i_8 >> 3) * 3 + CAMERA_ZOOM << 2, i_3, 1318646026);
				} else if (NativeLibraryLoader.anInt3240 == 1) {
					Class232.method3920(i_3, -491570614);
				}

				i_8 = Class31.anInt361;
				i_9 = Class109_Sub1.anInt9384;
				int i_10 = Class246.anInt3029;
				int i_11 = Class293.anInt3512;
				int i_12 = AnimationDefinitions.anInt5930;

				int i_14;
				for (int i_13 = 0; i_13 < 5; i_13++) {
					if (client.aBoolArray7431[i_13]) {
						i_14 = (int) (Math.random() * (double) (client.anIntArray7268[i_13] * 2 + 1) - (double) client.anIntArray7268[i_13] + Math.sin((double) client.anIntArray7435[i_13] * ((double) client.anIntArray7462[i_13] / 100.0D)) * (double) client.anIntArray7433[i_13]);
						if (i_13 == 0) {
							Class31.anInt361 += i_14 << 2;
						}

						if (i_13 == 1) {
							Class109_Sub1.anInt9384 += i_14 << 2;
						}

						if (i_13 == 2) {
							Class246.anInt3029 += i_14 << 2;
						}

						if (i_13 == 3) {
							AnimationDefinitions.anInt5930 = i_14 + AnimationDefinitions.anInt5930 & 0x3fff;
						}

						if (i_13 == 4) {
							Class293.anInt3512 += i_14;
							if (Class293.anInt3512 < 1024) {
								Class293.anInt3512 = 1024;
							} else if (Class293.anInt3512 > 3072) {
								Class293.anInt3512 = 3072;
							}
						}
					}
				}

				if (Class31.anInt361 < 0) {
					Class31.anInt361 = 0;
				}

				if (Class31.anInt361 > (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-2044226179).anInt2617 << 9) - 1) {
					Class31.anInt361 = (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1540309436).anInt2617 << 9) - 1;
				}

				if (Class246.anInt3029 < 0) {
					Class246.anInt3029 = 0;
				}

				if (Class246.anInt3029 > (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1972336821).anInt2603 << 9) - 1) {
					Class246.anInt3029 = (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1780427901).anInt2603 << 9) - 1;
				}

				QuickchatDefinitionsLoader.method7215((byte) 2);
				Renderers.SOFTWARE_RENDERER.method8617(i_0, i_1, i_2, i_3);
				Renderers.SOFTWARE_RENDERER.r(i_0, i_1, i_0 + i_2, i_3 + i_1);
				Class535 class535_16 = IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4038((short) 4699);
				i_14 = class535_16.method11450(522743760);
				client.aClass294_7457.method5223((float) (-Class31.anInt361), (float) (-Class109_Sub1.anInt9384), (float) (-Class246.anInt3029));
				client.aClass294_7457.method5220(0.0F, -1.0F, 0.0F, Class382.method6508(-AnimationDefinitions.anInt5930 & 0x3fff));
				client.aClass294_7457.method5220(-1.0F, 0.0F, 0.0F, Class382.method6508(-Class293.anInt3512 & 0x3fff));
				client.aClass294_7457.method5220(0.0F, 0.0F, -1.0F, Class382.method6508(-Class121.anInt1525 & 0x3fff));
				Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
				HitsplatDefinitions.method3850(client.aClass384_7167, true, (float) (i_2 / 2), (float) (i_3 / 2), (float) (client.anInt7451 << 1), (float) (client.anInt7451 << 1), i_2, i_3, (byte) 116);
				Renderers.SOFTWARE_RENDERER.method8424(client.aClass384_7167);
				if (class535_16.method11451(1476624725) != null) {
					Renderers.SOFTWARE_RENDERER.IA(1.0F);
					Renderers.SOFTWARE_RENDERER.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					class535_16.method11451(1476624725).method4215(Renderers.SOFTWARE_RENDERER, Class388.anInt4723 << 3, i_0, i_1, i_2, i_3, Class293.anInt3512, AnimationDefinitions.anInt5930, Class121.anInt1525, i_14, true, false, (byte) 14);
				} else {
					Renderers.SOFTWARE_RENDERER.ba(3, i_14);
				}

				Class412.method6934(client.aClass294_7457, client.aClass384_7167, i_2, i_3, (byte) -77);
				IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4037(IndexLoaders.MAP_REGION_DECODER, (byte) 57);
				byte b_15 = Class393.aClass282_Sub54_4783.aClass468_Sub27_8209.method12952((byte) 83) == 2 ? (byte) client.anInt7286 : 1;
				IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1029746106).method3447(client.cycles, Class31.anInt361, Class109_Sub1.anInt9384, Class246.anInt3029, IndexLoaders.MAP_REGION_DECODER.method4532(1227540505), client.anIntArray7198, client.anIntArray7303, client.anIntArray7194, client.anIntArray7305, client.anIntArray7306, Class84.myPlayer.plane + 1, b_15, (int) vector3_6.x >> 9, (int) vector3_6.z >> 9, Class393.aClass282_Sub54_4783.aClass468_Sub26_8224.method12943(619789577) == 0, true, 0, true);
				++client.anInt7396;
				Class282_Sub20_Sub24.method15391(-1221353280);
				if (client.anInt7166 == 13) {
					Class423.method7066(i_0, i_1, i_2, i_3, 256, 256, (byte) -11);
					Class250.method4298(i_0, i_1, i_2, i_3, 256, 256, (byte) -90);
					Class96_Sub12.method14612(i_0, i_1, i_2, i_3, 256, 256, -927883680);
					Class163.method2844(i_0, i_1, i_2, i_3, -869018249);
				}

				IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1467332289).method3399((byte) 19);
				Class31.anInt361 = i_8;
				Class109_Sub1.anInt9384 = i_9;
				Class246.anInt3029 = i_10;
				Class293.anInt3512 = i_11;
				AnimationDefinitions.anInt5930 = i_12;
				if (client.aBool7172 && Class119.JS5_STANDARD_REQUESTER.method5553((short) 26280) == 0) {
					client.aBool7172 = false;
				}

				if (client.aBool7172) {
					Renderers.SOFTWARE_RENDERER.method8425(i_0, i_1, i_2, i_3, -16777216, (byte) -43);
					Class446.method7447(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -1334063717), false, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -94);
				}

				HitsplatDefinitions.method3850(client.aClass384_7167, false, (float) (i_0 + i_2 / 2), (float) (i_3 / 2 + i_1), (float) (client.anInt7451 << 1), (float) (client.anInt7451 << 1), i_2, i_3, (byte) 55);
				Renderers.SOFTWARE_RENDERER.method8424(client.aClass384_7167);
				Class282_Sub39.method13296(client.aClass384_7167, 1454907005);
			}
		}

	}

	static final void method3232(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 92);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class282_Sub41_Sub1.method14700(icomponentdefinitions_3, interface_4, cs2executor_0, -442383470);
	}

	static final void method3233(CS2Executor cs2executor_0, int i_1) {
		Defaults6Loader.method11248(2004309168);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -90);
		Class190.method3148((byte) 38);
		client.aBool7175 = false;
	}

}