public class QuickchatMessageLoader {

	public int anInt5130 = 0;
	public int anInt5133 = 0;
	SoftCache aClass229_5131 = new SoftCache(64);
	Interface19 anInterface19_5134 = null;
	Index messagesIndex;
	Index menusIndex;

	public QuickchatMessageLoader(Language xlanguage_1, Index index_2, Index index_3, Interface19 interface19_4) {
		this.messagesIndex = index_2;
		this.menusIndex = index_3;
		this.anInterface19_5134 = interface19_4;
		if (this.messagesIndex != null) {
			this.anInt5130 = this.messagesIndex.filesCount(1);
		}

		if (this.menusIndex != null) {
			this.anInt5133 = this.menusIndex.filesCount(1);
		}

	}

	String method7212(QuickChatValueType value, int[] configs, long data) {
		if (this.anInterface19_5134 != null) {
			String string_5 = this.anInterface19_5134.method135(value, configs, data);
			if (string_5 != null) {
				return string_5;
			}
		}

		return Long.toString(data);
	}

	public QuickchatMessageDefinitions getMessageDefinitions(int id) {
		QuickchatMessageDefinitions quickchatdefinitions_3 = (QuickchatMessageDefinitions) this.aClass229_5131.get((long) id);
		if (quickchatdefinitions_3 != null) {
			return quickchatdefinitions_3;
		} else {
			byte[] bytes_4;
			if (id >= 32768) {
				bytes_4 = this.menusIndex.getFile(1, id & 0x7fff);
			} else {
				bytes_4 = this.messagesIndex.getFile(1, id);
			}

			quickchatdefinitions_3 = new QuickchatMessageDefinitions();
			quickchatdefinitions_3.aClass429_9623 = this;
			if (bytes_4 != null) {
				quickchatdefinitions_3.method14913(new RsByteBuffer(bytes_4));
			}

			if (id >= 32768) {
				quickchatdefinitions_3.method14912();
			}

			this.aClass229_5131.put(quickchatdefinitions_3, (long) id);
			return quickchatdefinitions_3;
		}
	}

	static final void method7215() {
		if (Class393.preferences.aPreference_Sub27_8209.method12952((byte) 89) == 2) {
			byte[][][] bytes_1 = IndexLoaders.MAP_REGION_DECODER.method4532();
			byte b_2 = (byte) (client.anInt7286 - 4 & 0xff);
			int i_3 = client.anInt7286 % IndexLoaders.MAP_REGION_DECODER.getSizeX();

			int i_4;
			int i_5;
			for (i_4 = 0; i_4 < 4; i_4++) {
				for (i_5 = 0; i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(); i_5++) {
					bytes_1[i_4][i_3][i_5] = b_2;
				}
			}

			if (Class4.anInt35 != 3) {
				for (i_4 = 0; i_4 < 2; i_4++) {
					client.anIntArray7198[i_4] = -1000000;
					client.anIntArray7303[i_4] = 1000000;
					client.anIntArray7194[i_4] = 0;
					client.anIntArray7306[i_4] = 1000000;
					client.anIntArray7305[i_4] = 0;
				}

				Vector3 vector3_17 = VertexNormal.MY_PLAYER.method11166().coords;
				i_5 = (int) vector3_17.x;
				int i_6 = (int) vector3_17.z;
				RegionMap regionmap_7 = IndexLoaders.MAP_REGION_DECODER.method4433();
				SceneObjectManager sceneobjectmanager_8 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
				int i_9;
				if (NativeLibraryLoader.anInt3240 != 2 && PingRequester.anInt5864 == -1) {
					i_9 = Class504.getTerrainHeightAtPos(IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX, Class246.CAM_MOVE_ABSOLUTEY, Class4.anInt35);
					if (i_9 - Class109_Sub1.CAM_MOVE_ABSOLUTEZ < 3200 && (regionmap_7.tileMasks[Class4.anInt35][IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX >> 9][Class246.CAM_MOVE_ABSOLUTEY >> 9] & 0x4) != 0) {
						JS5Manager.method5492(sceneobjectmanager_8.aClass293ArrayArrayArray2604, 1, IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX >> 9, Class246.CAM_MOVE_ABSOLUTEY >> 9, false, (byte) -37);
					}
				} else {
					if (NativeLibraryLoader.anInt3240 != 2) {
						i_5 = PingRequester.anInt5864;
						i_6 = Class86.anInt833;
					}

					if ((regionmap_7.tileMasks[Class4.anInt35][i_5 >> 9][i_6 >> 9] & 0x4) != 0) {
						JS5Manager.method5492(sceneobjectmanager_8.aClass293ArrayArrayArray2604, 0, i_5 >> 9, i_6 >> 9, false, (byte) 46);
					} else if (Class293.anInt3512 < 2560) {
						i_9 = IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX >> 9;
						int i_10 = Class246.CAM_MOVE_ABSOLUTEY >> 9;
						int i_11 = i_5 >> 9;
						int i_12 = i_6 >> 9;
						int i_13;
						if (i_11 > i_9) {
							i_13 = i_11 - i_9;
						} else {
							i_13 = i_9 - i_11;
						}

						int i_14;
						if (i_12 > i_10) {
							i_14 = i_12 - i_10;
						} else {
							i_14 = i_10 - i_12;
						}

						if ((i_13 != 0 || i_14 != 0) && i_13 > -IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_13 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_14 > -IndexLoaders.MAP_REGION_DECODER.getSizeY() && i_14 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
							int i_16;
							int i_18;
							if (i_13 > i_14) {
								i_18 = i_14 * 65536 / i_13;
								i_16 = 32768;

								while (i_9 != i_11) {
									if (i_9 < i_11) {
										++i_9;
									} else if (i_9 > i_11) {
										--i_9;
									}

									if ((regionmap_7.tileMasks[Class4.anInt35][i_9][i_10] & 0x4) != 0) {
										JS5Manager.method5492(sceneobjectmanager_8.aClass293ArrayArrayArray2604, 1, i_9, i_10, false, (byte) -61);
										break;
									}

									i_16 += i_18;
									if (i_16 >= 65536) {
										i_16 -= 65536;
										if (i_10 < i_12) {
											++i_10;
										} else if (i_10 > i_12) {
											--i_10;
										}

										if ((regionmap_7.tileMasks[Class4.anInt35][i_9][i_10] & 0x4) != 0) {
											JS5Manager.method5492(sceneobjectmanager_8.aClass293ArrayArrayArray2604, 1, i_9, i_10, false, (byte) 49);
											break;
										}
									}
								}
							} else {
								i_18 = i_13 * 65536 / i_14;
								i_16 = 32768;

								while (i_12 != i_10) {
									if (i_10 < i_12) {
										++i_10;
									} else if (i_10 > i_12) {
										--i_10;
									}

									if ((regionmap_7.tileMasks[Class4.anInt35][i_9][i_10] & 0x4) != 0) {
										JS5Manager.method5492(sceneobjectmanager_8.aClass293ArrayArrayArray2604, 1, i_9, i_10, false, (byte) -10);
										break;
									}

									i_16 += i_18;
									if (i_16 >= 65536) {
										i_16 -= 65536;
										if (i_9 < i_11) {
											++i_9;
										} else if (i_9 > i_11) {
											--i_9;
										}

										if ((regionmap_7.tileMasks[Class4.anInt35][i_9][i_10] & 0x4) != 0) {
											JS5Manager.method5492(sceneobjectmanager_8.aClass293ArrayArrayArray2604, 1, i_9, i_10, false, (byte) 56);
											break;
										}
									}
								}
							}
						} else {
							CoordGrid coordgrid_15 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
							Class151.method2594(i_9 + "," + i_10 + " " + i_11 + "," + i_12 + " " + coordgrid_15.x + "," + coordgrid_15.y, new RuntimeException(), (byte) -63);
						}
					}
				}
			}
		}

	}

}
