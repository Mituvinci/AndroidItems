package com.androiditems.mitu.androiditems.MusicPlayer;

import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Hi on 09-Sep-16.
 */
public  class SongsList {
    private static String[] items;
    public static String[] AllsongsOfMemory(){

        final ArrayList<File> songs = getSongList(Environment
                .getExternalStorageDirectory());

        items = new String[songs.size()];

        for(int i=0;i<songs.size();i++){
            items[i] = songs.get(i).getName().toString().replace(".mp3","").replace(".amr","");
            Log.d("song",items[i]);
        }
        return  items;
    }

    public static ArrayList<File> getSongList(File root) {
        ArrayList<File> al = new ArrayList<>();
        File[] files = root.listFiles();
        if (files != null && root.exists()) {

            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory() && !files[i].isHidden()) {
                    al.addAll(getSongList(files[i]));
                } else if (files[i].getName().endsWith(".mp3")
                        || files[i].getName().endsWith(".amr")) {
                    al.add(files[i]);
                }
            }
        }
        return al;
    }
}
