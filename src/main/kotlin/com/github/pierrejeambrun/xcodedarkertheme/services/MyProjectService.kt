package com.github.pierrejeambrun.xcodedarkertheme.services

import com.intellij.openapi.project.Project
import com.github.pierrejeambrun.xcodedarkertheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
