package com.beckytech.galatagooftaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MoreApps extends OptionsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_apps);

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        LinearLayout galatafi_barumsa = findViewById(R.id.barumsaafi_galata);
        galatafi_barumsa.setOnClickListener(view -> {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.galatoofibarumsaa";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        LinearLayout faaruu = findViewById(R.id.faaruu);
        faaruu.setOnClickListener(view -> {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        LinearLayout cidha = findViewById(R.id.cidha);
        cidha.setOnClickListener(view -> {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarsaacidhaa";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        LinearLayout qiddaassee = findViewById(R.id.qiddaassee);
        qiddaassee.setOnClickListener(view -> {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.sirnagalatoo";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        LinearLayout galataMaariyaam = findViewById(R.id.galata_maariyaam);
        galataMaariyaam.setOnClickListener(view -> {
            String url = "http://www.mediafire.com/file/cyglsztsy4qq1wp/Kadhannaa_Afaan_Oromoo.apk/file";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });
    }
}