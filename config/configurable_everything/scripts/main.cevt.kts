import net.minecraft.Util

if (Util.getPlatform() == Util.OS.WINDOWS) {
    throw RuntimeException("NO WINDOWS")
}
