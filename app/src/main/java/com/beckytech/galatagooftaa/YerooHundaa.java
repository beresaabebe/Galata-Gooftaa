package com.beckytech.galatagooftaa;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jean.jcplayer.view.JcPlayerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;

public class YerooHundaa extends OptionsMenuActivity {

    TextView textTitle, textContents;

    JcPlayerView jcPlayerView;

    String title = "Galata Gooftaa Kan Yeroo Hundaa";
    String contents = "Dheekamsa irra kan fagaatte, dhiifamni kees baayyee kan ta’e cubbuu kan namaa dhiostu qulqula’aa laphee ballaa kan taate yaa Gooftaa sin kabaja. Guyyaa guyyaan yeroo ani si yakku naa obsitee naa eegdeetta’o. Qalbii akka jijjiirannuufis hundaa keenyaafis taayitaa nuu kennite, kanaafuu si kabajinna, ulfaataa kan ta’e maqaa kee akka kabajinnuuf nuu obsite. Waan hojjatu hundumaaf, yaa ajajaa uumaa, gaddafi sodaa dadhabinas yeroo fiddu qabdahoo, raajotaanis yeroo sookate qabda’o, booda garuu mullachuu ilma kee Iyyesuus Kiristoosin nu daawwatte. Kan hin ture gara jireenyaatti kan nu uume si’i, abbaan keenya Gooftaan keenyas sidha.\n" +
            "\n\n" +
            "Rakkataa kanan ta’e ani fuula kee ani fuula kee duratti dubbachuun naan danda’amu. Cubbamoota hundaarra kanan caalu cubbamaadha’o, ulfaataa kan ta’e seera kees xureeseera’o. Cubbuu koorra obsa (Dhiifama) kee waan naa baayyisteef sin galateefadha.\n" +
            "\n\n" +
            "Ani waa’ee yakka kootiif murteen kan naaf ta’u ture, Ati garuu feedha keetiin calliste murtee otoo natti hin murteessin na eegdeetta’o. Waa’ee cubbuu kootiifis dhiphinaafi fuula kee duratti kufuu irraa jaalala dhala namaarraa qabduuf waa’ee obsa keetiif hangaa ammaatti na eegdeetta.\n" +
            "\n\n" +
            "Dhiifama kan kenitu yaa Gooftaa, Kanaaf sin galateefadha. Amamtaa kan hin qabne obsa keefi Gooftummaa keef galata ta’u akkan galateefadhuuuf, taayitaa kanan hin qabneef kanan tuffatame yoon ta’e iyyuu kadhannaa garbicha dadhabaa keetii dhaga’i. Baayyina dhiifama kee ishee daangaa hin qabneef hanga bara baraatti ulfiniifi galanni bitamuunis siif ni ta’a. Dhugummaan ameen.\n" +
            "\n\n" +
            "Yaa Gooftaa koo Iyyesuus Kiristoos, ana tajaajilaa kee waan hamaa hundaa irraa eegi, cubbuu koos naa dhiisi.";

    String url = "https://firebasestorage.googleapis.com/v0/b/galatagooftaa-a83c5.appspot.com/o/kan%20yeroo%20hundaa.mp3?alt=media&token=ee19d78a-3246-4525-b2a3-6a376b7cfa78";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeroo_hundaa);

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textTitle = findViewById(R.id.textTitle);
        textTitle.setText(title);

        textContents = findViewById(R.id.textContents);
        textContents.setText(contents);

        jcPlayerView = findViewById(R.id.jcplayer);

        jcPlayer(jcPlayerView, title, url);

    }
}