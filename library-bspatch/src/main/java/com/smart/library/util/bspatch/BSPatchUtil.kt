package com.smart.library.util.bspatch

object BSPatchUtil {
    /**
     * @param basePath      基础文件
     * @param syntheticPath 合成的目标文件
     * @param patchPath     合成所需要的差分文件
     * @return main 返回值
     */
    @JvmStatic
    external fun bspatch(basePath: String, syntheticPath: String, patchPath: String): Int

    init {
        System.loadLibrary("bspatch")
    }
}
