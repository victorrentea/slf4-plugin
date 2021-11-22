package com.github.victorrentea.slf4plugin.services

import com.intellij.openapi.project.Project
import com.github.victorrentea.slf4plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
