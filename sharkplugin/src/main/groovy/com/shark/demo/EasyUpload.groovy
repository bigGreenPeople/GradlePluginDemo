package com.shark.demo

import org.gradle.api.Project
import org.gradle.api.Plugin

class EasyUpload implements Plugin<Project> {

    //扩展
    public static final String UPLOAD_EXTENSION_NAME = "upload"

    @Override
    void apply(Project project) {
        // 构建逻辑
        println ".fudsadadsadsadassdasadsadsda jdie..........................................................................."
        applyExtension(project)
        applyMavenFeature(project)
        println "Hello12312.fu jdasdie..........................................................................."

    }

    /**
     * 编写
     * @param project
     */
    private static void applyExtension(Project project) {
        // 创建扩展，并添加到 ExtensionContainer
        project.extensions.create(UPLOAD_EXTENSION_NAME, Upload)

    }

    private static void applyMavenFeature(Project project) {
        project.afterEvaluate {
            // 1. Upload extension
            Upload rootConfig = Upload.getConfig(project)
            println "Hello12312.fu jdasdie..........................................................................."
            print(rootConfig)
            // 构建逻辑 ...
        }
    }
}
