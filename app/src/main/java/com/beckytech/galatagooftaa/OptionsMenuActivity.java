package com.beckytech.galatagooftaa;

import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class OptionsMenuActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (item.getItemId() == R.id.aboutusmenu) {
            startActivity(new Intent(this, AboutUs.class));
        }

        if (item.getItemId() == R.id.sharemenu) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            intent.putExtra(Intent.EXTRA_TEXT, "Download this useful app's from Google play \n https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            startActivity(Intent.createChooser(intent,"Share app's link via "));
        }

        if (item.getItemId() == R.id.starmenu) {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
            Intent  intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        if (item.getItemId() == R.id.checkUpdateMenu) {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
            Intent  intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        if (id == R.id.exitmenu) {
            Intent close = new Intent(Intent.ACTION_MAIN);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Cufu barbaade?")
                    .setCancelable(false)
                    .setPositiveButton("Eeyyeen", (dialogInterface, i) -> {
                        close.addCategory(Intent.CATEGORY_HOME);
                        close.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(close);
                        finish();
                    })
                    .setNegativeButton("Lakki", (dialogInterface, i) -> dialogInterface.cancel()).create().show();
        }

        if (id == R.id.moreappmenu) {
            startActivity(new Intent(this, MoreApps.class));
        }

        return super.onOptionsItemSelected(item);
    }

    public void jcPlayer(JcPlayerView jcPlayerView, String title, String url) {
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL(title,url));
        jcPlayerView.initPlaylist(jcAudios, null);
        jcPlayerView.createNotification(R.mipmap.ic_icon);
    }

}