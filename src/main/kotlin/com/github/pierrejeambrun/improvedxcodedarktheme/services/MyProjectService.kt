package com.github.pierrejeambrun.improvedxcodedarktheme.services

import com.intellij.openapi.project.Project
import com.github.pierrejeambrun.improvedxcodedarktheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
