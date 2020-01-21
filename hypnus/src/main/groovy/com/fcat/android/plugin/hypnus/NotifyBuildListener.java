package com.fcat.android.plugin.hypnus;

import org.gradle.BuildListener;
import org.gradle.BuildResult;
import org.gradle.api.initialization.Settings;
import org.gradle.api.invocation.Gradle;

import java.io.InputStream;

public class NotifyBuildListener implements BuildListener {
    @Override
    public void buildStarted(Gradle gradle) {

    }

    @Override
    public void settingsEvaluated(Settings settings) {

    }

    @Override
    public void projectsLoaded(Gradle gradle) {

    }

    @Override
    public void projectsEvaluated(Gradle gradle) {

    }

    @Override
    public void buildFinished(BuildResult buildResult) {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("duo_la.mp3");
        MediaUtils.play_mp3(is);
    }
}
