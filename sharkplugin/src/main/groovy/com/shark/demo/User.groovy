package com.shark.demo

import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionContainer

class User {
    String username
    String password

    String getUsername() {
        return username
    }

    void setUsername(String username) {
        this.username = username
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }
}
