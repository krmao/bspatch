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
api 'com.smart.library.util:bspatch:0.0.2'
```

```
try {
    // first param : base zip file path
    // second param: dest zip file path
    // third  param: patch file path
    val result = BSPatchUtil.bspatch(baseBundleHelper.getBaseZipFile().absolutePath, tempZipFile.absolutePath, getTempPatchFile().absolutePath)
    
    if (result == 0) {
        // success
    }else {
        // failure
    }
    
} catch (e: Exception) {
    // failure
}
```