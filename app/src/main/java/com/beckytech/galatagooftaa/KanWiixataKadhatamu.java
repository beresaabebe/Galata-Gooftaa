package com.beckytech.galatagooftaa;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jean.jcplayer.view.JcPlayerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;


public class KanWiixataKadhatamu extends OptionsMenuActivity {

    TextView textTitle, textContents;

    JcPlayerView jcPlayerView;

    String title = "Galata Gooftaa Kan Guyyaa Wiixataa";
    String contents = "Yaa Gooftaa koo cubbuu ani dhoksee hojjadhe hundumaa isaa ati beekta. Tiruufi Laphee kan qoru si’idha; badii ani dhoksaadhaan hojjadhu hundumaa isaa ati ni beekta. Hojii badii ani hojjadhus agartee natti murteessuuf kan hin ariifanne, gammachuu ani irra jirurraas kan naa hin salphisne sidha. Yeroo ani kufus adeemsa koo kan hin salphiisne. Waan gaarii kan taasistu yaa Abbaa dhiifamaa ati hin ariifattu, Atoo daadhabina koos eeguudhaan dhiifama kee naa baayiste. Anis rafitii koo irraa dammaqee dhiifama kee yeroon barbaadu gara kee nan dhufe. Nama qalbii jijjiratu qalbii jijjiiraachuu isaa akka irraa simattu baree abdii keetti jabaachuun gara keetti nan dhufe. Kanaan tuffatame iyyeessi ani sin kadhadha.\n" +
            "\n" +
            "Kanan kufe irraa akka na kaastuuf, cubbuu koos akka irra naa darbituuf, qalbii jijiirannaa koos akka simattu, diinni taayitaa koo irraa na kuffisee akka ofi hin jajinneef, ofittoo otoo hin ta’in, otoo hin dhowwatin kan kennitu, waan gaariis kan kennitu tolaa uumaa qoricha keenya kan taate yaa Gooftaa keenya Iyyesuus Kiristoos ati sagalee kee isa amanamaaadhaan wangeela ulfaataa irratti “barbaadaa ni argattuu, kadhadhaa isiniif kennamaa, balbala rukkutaa isiniif banamaa Mat.7:7” jette akka dubbatte. Yaa Gooftaa rakkataaf iyyeessa kanan ta’e ani dhugummaa dubbii keetii fudhadhee jechaa keen jabaachuudhaan cubbuu koos amanee siin waammachaa kunoo fuula kee ijaajjeera.\n" +
            "\n" +
            "Gooftaa koofi qorichaa koo kan taate yaa Iyyesuus Kiristoos abdii koo kuttee akka nan qaanessineef sin kadhadha. Dadhabummaa koof naa gadditee, cubbuu koo akka na dhiiftuuf, fuula kees akka ana irra hin deebisneef, kadhannaan koos akka qaanoftee hin deebne. Yeroo kana ani siin kadhachuuf kanan hin geenye cubbamaafi yakkamaa nan ta’a, kanan xuraa’eefi kanan yakkameedha’oo.\n" +
            "\n" +
            "Haa ta’u iyyu malee dhiifama keefi baayina tolummaa keetiin araaraafi fayyina uummataa keetii jaallachuu keetiif dubbii koof deebii naaf deebisi, boo’icha koos naa dhaga’i. Yaa Gooftaa Uumaa koo badii hojii kootiif baayina cubbuu kootii ilaaltee imimmaan koo hin qaanessin. Akka abdii dhugummaa keetiitti ulfaataa maqaa keetti akka ani amanetti naaf haa ta’u malee, hojii harka kee qulqulluu kanan ta’e ani lammii garboota keetiiti. Anis ulfaataa bifa keetiif fakkeenya keetiin uumameera’o. Ogumaa keetiin kan uumte lammii garboota keetii waanan ta’eef ija jabaadhee arraba koo ishee hadhooftuu (xurooftuu) ol kaasee sin kadhadha.\n" +
            "\n" +
            "Cubbuu koo akka narraa haqtuuf, qalbii jijjiirannaa koos akka naa fudhattuuf, taayitaa jabaa dandeettii kan qabdu, yaa tolaa, dadhabaa kanan ta’e anaan dhiifama keetiin akka na fayyistuuf tolummaa keetiin na eegi. Baayina cubbuu kootiif badii koo narraa fageessi, ani kanaan gadde nama badiidhahoo.\n" +
            "\n" +
            "Yaa Gooftaa ani garbichi kee yemmuu ani kadhadhu fuula kee narraa hin deebisin. Yaa Gooftaa gara keetti yemmuun ani kadhadhus dhiifama kee narraa hin fageessin. Yaa Gooftaa gooftootaa yaa Mootii moototaa araaraan namoota gara keetti deebi’an araaramuu isaanii ni jaallatta’o, fayyina lubbuufi fayyina foonii ni jaallatta’o.\n" +
            "\n" +
            "Yaa Gooftaa Iyyesuus Kiristoos amantii ishee sirriidhaafi dhugummaan gara keetti deebi’u naa kenni. Qalbii jijjiirannaa qulqulla’a ta’e akka naa kennituufis sin kadhadha. Kan na jibban diinonni koo seexanni tasa yemmuu natti dhufan na fayyisi. Lubbuun koo foon koo irraa yemmuu adda baatu gara keetti na dhiyeessi malee, gara adda biraatti dabarsitee nan kennin. Hundumtuu kan siif danda’amu yaa uuma, diinota koo ana irratti hin leenjisiisin, hin gaggeesisinis.\n" +
            "\n" +
            "Galmee qajeelaa yaa Waaqayyo Gooftaa uumaa, naaf gadditee dhiifama kan taasistu, jireenyas kan kennitufi waan gaarii kan jaallattu sidha’o. Kanaf iyyuu ammeenyota kan ta’an diinota koo irraa na fayyisi, isaaniis sodaachuudhan kan ka’e lubbuun koo ollateettihoo. Kabajamaa maqaa keetiifi sirraan kan hafe hanga bara baraatti fayyina hin qabu, dhugummaan Ameen!";

    String url = "https://firebasestorage.googleapis.com/v0/b/galatagooftaa-a83c5.appspot.com/o/wiixata%20mixed.mp3?alt=media&token=ad8e1eb6-8a2e-4daa-8e62-bea3423c9490";

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