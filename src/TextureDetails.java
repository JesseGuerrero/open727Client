public class TextureDetails {

	public boolean isGroundMesh;
	public boolean repeatT;
	public byte effectId;
	public boolean isHalfSize;
	public boolean skipTriangles;
	public short color;
	public int blendType;
	public byte effectParam1;
	public int effectParam2;
	public byte shadowFactor;
	public byte brightness;
	public byte textureSpeedU;
	public boolean isBrickTile;
	public boolean repeatS;
	public boolean aBool2087;
	public byte useMipmaps;
	public boolean hdr;
	public byte textureSpeedV;
	public int combineMode;

	public static final synchronized long time() {
		long long_1 = System.currentTimeMillis();
		if (long_1 < Class97.aLong993) {
			Class97.aLong994 += Class97.aLong993 - long_1;
		}
		Class97.aLong993 = long_1;
		return long_1 + Class97.aLong994;
	}

	static final void method2874(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 69608151) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1319 = Class351.method6193(string_4, cs2executor_2, 1275110471);
		icomponentdefinitions_0.aBool1384 = true;
	}

	public static boolean method2875(int i_0, int i_1) {
		return i_0 == 13 || i_0 == 18 || i_0 == 12;
	}

	public static void method2876(NPC npc_0) {
		for (Class282_Sub48 class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass482_8074.head((byte) 123); class282_sub48_2 != null; class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass482_8074.next(1114732326)) {
			if (class282_sub48_2.aClass521_Sub1_Sub1_Sub2_Sub2_8085 == npc_0) {
				if (class282_sub48_2.aClass282_Sub15_Sub5_8099 != null) {
					Class79.aClass282_Sub15_Sub4_783.method15276(class282_sub48_2.aClass282_Sub15_Sub5_8099);
					class282_sub48_2.aClass282_Sub15_Sub5_8099 = null;
				}
				class282_sub48_2.remove();
				break;
			}
		}
	}

	public static void method2877(Interface45 interface45_0) {
		if (IcmpService_Sub1.anIcmpService_Sub1_7964 == null) {
			throw new IllegalStateException("");
		} else {
			IcmpService_Sub1.anIcmpService_Sub1_7964.aList7962.add(interface45_0);
		}
	}
}