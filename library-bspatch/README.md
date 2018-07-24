# bspatch tools for android
please see ./outputs/

### bsdiff
[download bsdiff](http://www.daemonology.net/bsdiff/)
```
    https://github.com/mendsley/bsdiff
```

### make diff
```
    make
```

* make bugs
```
    http://www.cnblogs.com/lping/p/5833090.html
```

### how to use on mac
```
    bsdiff oldfile newfile patchfile
    bspatch oldfile newfile patchfile
```


### how to use on android
```
api(name: "library-bspatch-release-1.0", ext: "aar")
```

```
fun merge(baseBundleHelper: CXBaseBundleHelper): Boolean {
    if (!checkTempBundleFileValid()) {
        if (checkPatchFileValid()) {
            if (baseBundleHelper.info.version == info.baseVersion) {
                val tempZipFile = getTempZipFile()

                if (tempZipFile.exists()) {
                    CXFileUtil.deleteFile(tempZipFile)
                }

                try {
                    val result = BSPatchUtil.bspatch(baseBundleHelper.getBaseZipFile().absolutePath, tempZipFile.absolutePath, getTempPatchFile().absolutePath)
                    CXLogUtil.w(TAG, "bspatch ${if (result == 0) "success" else "failure"}, result=$result")
                    if (result == 0) {
                        return checkTempBundleFileValid()
                    }
                } catch (e: Exception) {
                    CXLogUtil.e(TAG, e)
                }
            }
        }
        return false
    } else {
        return true
    }
}
```