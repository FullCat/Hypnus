package com.fcat.android.plugin.hypnus;


import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class MediaUtils {
    public static void play_mp3(InputStream is) {
        try {
            BufferedInputStream stream = new BufferedInputStream(is);
            Player player = null;
            player = new Player(stream);
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
