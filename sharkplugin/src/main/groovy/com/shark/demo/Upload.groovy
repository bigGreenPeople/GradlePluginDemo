package com.shark.demo

import org.gradle.api.Project

class Upload {
    String name
    // 将获取扩展对象的代码封装为静态方法
    static Upload getConfig(Project project) {
        // 从 ExtensionContainer 容器获取扩展对象
        Upload extension = project.getExtensions().findByType(Upload.class)
        // 配置缺省的时候，赋予默认值
        if (null == extension) {
            extension = new Upload()
        }
        return extension
    }

}
