package com.shark.demo

import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionContainer

class Upload {
    String name
    User user = new User()

//    Upload() {
//        this.extensions.create("user", User)
//    }

// 嵌套扩展闭包函数，方法名为 maven（方法名不一定需要与属性名一致）
//    void user(Action<User> action) {
//        action.execute(user)
//    }

    // 嵌套扩展闭包函数，方法名为 maven
    void user(Closure closure) {
        org.gradle.util.ConfigureUtil.configure(closure, user)
//        def username = closure.getProperty("username")
//        print(username)
    }

    // 将获取扩展对象的代码封装为静态方法
    static Upload getConfig(Project project) {
        // 从 ExtensionContainer 容器获取扩展对象
            ExtensionContainer extensionContainer =  project.getExtensions()
        Upload extension = extensionContainer.findByType(Upload.class)

        // 配置缺省的时候，赋予默认值
        if (null == extension) {
            extension = new Upload()
        }
        return extension
    }

}
