# 将 bspatch/src 目录下的所有源文件(不包含子目录)保存在变量 'SRC' 中
aux_source_directory(${PROJECT_SOURCE_DIR}/bspatch/src SRC)

# 将 bspatch/src/bzip2-1.0.6 目录下的所有源文件(不包含子目录)保存在变量 'SRC_BZIP2' 中
aux_source_directory(${PROJECT_SOURCE_DIR}/bspatch/src/bzip2-1.0.6 SRC_BZIP2)

# 将 'SRC_BZIP2' 添加到 'SRC' 中
list(APPEND SRC ${SRC_BZIP2})

add_library(bspatch SHARED ${SRC})

# 链接日志库
target_link_libraries(bspatch log)