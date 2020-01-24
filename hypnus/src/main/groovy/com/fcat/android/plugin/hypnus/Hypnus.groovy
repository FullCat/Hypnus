package com.fcat.android.plugin.hypnus

import org.gradle.api.Plugin
import org.gradle.api.Project

public class Hypnus implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.getGradle().addBuildListener(new NotifyBuildListener())
    }
}