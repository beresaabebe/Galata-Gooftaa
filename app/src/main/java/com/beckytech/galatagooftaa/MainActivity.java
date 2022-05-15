package com.beckytech.galatagooftaa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private BottomSheetBehavior mBottomSheetBehavior;

    public InterstitialAd mInterstitialAd;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, initializationStatus -> {
        });

        MobileAds.initialize(this, initializationStatus -> {});

        setAds();

        RelativeLayout yerooHundaa = findViewById(R.id.galata_gooftaa_yeroo_hundaa);
        RelativeLayout wiixata = findViewById(R.id.galata_gooftaa_yeroo_wiixata);
        RelativeLayout kibxataa = findViewById(R.id.galata_gooftaa_yeroo_kibxataa);
        RelativeLayout roobii = findViewById(R.id.galata_gooftaa_yeroo_roobii);
        RelativeLayout kamisaa = findViewById(R.id.galata_gooftaa_yeroo_kamisaa);
        RelativeLayout jimaata = findViewById(R.id.galata_gooftaa_yeroo_jimaata);
        RelativeLayout sanbataDuraa = findViewById(R.id.galata_gooftaa_yeroo_sanbata_duraa);
        RelativeLayout sanbataaGuddaa = findViewById(R.id.galata_gooftaa_yeroo_dilbaata);

        yerooHundaa.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, YerooHundaa.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, YerooHundaa.class));
            }
        });
        wiixata.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, KanWiixataKadhatamu.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, KanWiixataKadhatamu.class));
            }
        });
        kibxataa.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, KanKibxataaKadhatamuu.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, KanKibxataaKadhatamuu.class));
            }
        });
        roobii.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, Roobii.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, Roobii.class));
            }
        });
        kamisaa.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, Kamisaa.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, Kamisaa.class));
            }
        });

        jimaata.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, Jimaata.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, Jimaata.class));
            }
        });
        sanbataDuraa.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, SanbataaXiqqaa.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, SanbataaXiqqaa.class));
            }
        });
        sanbataaGuddaa.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, Dilbataa.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, Dilbataa.class));
            }
        });

        FloatingActionButton floatingActionButton = findViewById(R.id.floatingBtn);
        floatingActionButton.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "https://play.google.com/store/apps/details?id=com.beckytech.galatagooftaa");
            intent.putExtra(Intent.EXTRA_TEXT, "Download Galata Gooftaa from play store \n https://play.google.com/store/apps/details?id=com.beckytech.galatagooftaa");
            startActivity(Intent.createChooser(intent,"Share app's link via "));
        });

        LinearLayout mBottomSheet = findViewById(R.id.bottom_sheet);
        BottomAppBar bottomAppBar = findViewById(R.id.bottom_app_bar);

        mBottomSheetBehavior = BottomSheetBehavior.from(mBottomSheet);

        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        mBottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                if (BottomSheetBehavior.STATE_EXPANDED == newState) {
                    floatingActionButton.animate().scaleX(0).scaleY(0).setDuration(0).start();
                    floatingActionButton.setVisibility(View.GONE);
                }
                else if (BottomSheetBehavior.STATE_COLLAPSED == newState) {
                    floatingActionButton.animate().scaleX(1).scaleY(1).setDuration(0).start();
                    floatingActionButton.setVisibility(View.VISIBLE);
                }
                else if (BottomSheetBehavior.STATE_HIDDEN == newState) {
                    floatingActionButton.animate().scaleX(1).scaleY(1).setDuration(0).start();
                    floatingActionButton.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

        bottomAppBar.setNavigationOnClickListener(view -> mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED));


        LinearLayout shareLayout = findViewById(R.id.share_layout);
        shareLayout.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_SUBJECT, "https://play.google.com/store/apps/details?id=com.beckytech.galatagooftaa");
                        intent.putExtra(Intent.EXTRA_TEXT, "Download Galata Gooftaa from play store \n https://play.google.com/store/apps/details?id=com.beckytech.galatagooftaa");
                        startActivity(Intent.createChooser(intent,"Share app's link via "));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "https://play.google.com/store/apps/details?id=com.beckytech.galatagooftaa");
                intent.putExtra(Intent.EXTRA_TEXT, "Download Galata Gooftaa from play store \n https://play.google.com/store/apps/details?id=com.beckytech.galatagooftaa");
                startActivity(Intent.createChooser(intent,"Share app's link via "));
            }
        });

        LinearLayout exit = findViewById(R.id.exit);
        exit.setOnClickListener(view -> {

            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
            builder.setMessage("Cufu barbaadu?");
            builder.setIcon(R.mipmap.ic_icon);
            builder.setTitle("Cufi");
            builder.setNegativeButton("Lakki", (dialogInterface, i) -> dialogInterface.dismiss());
            builder.setPositiveButton("Eeyyeen", (dialogInterface, i) -> MainActivity.this.finish());
            builder.setBackground(getResources().getDrawable(R.drawable.alert_dialog_bg,null));
            builder.show();
        });

        LinearLayout more_apps = findViewById(R.id.more_apps);
        more_apps.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, MoreApps.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, MoreApps.class));
            }
        });

        LinearLayout rate = findViewById(R.id.rate);
        rate.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        String url = "https://play.google.com/store/apps/details?id=com.beckytech.galatagooftaa";
                        Intent  intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                String url = "https://play.google.com/store/apps/details?id=com.beckytech.galatagooftaa";
                Intent  intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        LinearLayout update = findViewById(R.id.update);
        update.setOnClickListener(view -> {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.galatagooftaa";
            Intent  intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        LinearLayout aboutus = findViewById(R.id.aboutUsLinear);
        aboutus.setOnClickListener(view -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(MainActivity.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(MainActivity.this, AboutUs.class));
                        mInterstitialAd = null;
                        setAds();
                    }
                });
            }
            else {
                startActivity(new Intent(this, AboutUs.class));
            }
        });

    }

    public void setAds() {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this, getString(R.string.ads_unit_interstitial_test_unit), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;
                    }
                });
    }
}