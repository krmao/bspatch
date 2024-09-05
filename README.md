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
// maven
implementation 'com.codesdancing.libraries:library-bspatch:0.0.3'
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

### how to use on ios

> [https://github.com/krmao/bspatch-ios](https://github.com/krmao/bspatch-ios)

### compile project
- brew install cmake
- https://stackoverflow.com/a/68158176/4348530
