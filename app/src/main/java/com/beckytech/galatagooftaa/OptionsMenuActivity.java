package com.beckytech.galatagooftaa;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class OptionsMenuActivity extends AppCompatActivity {

    public void jcPlayer(JcPlayerView jcPlayerView, String title, String url) {
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL(title,url));
        jcPlayerView.initPlaylist(jcAudios, null);
        jcPlayerView.createNotification(R.mipmap.ic_icon);
    }

}