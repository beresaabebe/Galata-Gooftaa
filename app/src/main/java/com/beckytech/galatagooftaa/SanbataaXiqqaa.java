package com.beckytech.galatagooftaa;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jean.jcplayer.view.JcPlayerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SanbataaXiqqaa extends OptionsMenuActivity {

    TextView textTitle, textContents;
    JcPlayerView jcPlayerView;

    String title = "Galata Gooftaa Kan Guyyaa Sanbata Duraa";
    String contents = "Maqaa Abbaa, Maqaa Ilmaafi Maqaa afuurraa qulqulluutti nan amana. Ajjeesuufi fayyisuu kan danda’utti nan amana. Duutiifi jireenyi harka isaa kan jirutti nan amana. Jireenya Afuuraa kan kennuttis nan amana. Kiruubeelirra kan taa’utti nan amana. Biyya lafaa yeroo ilaalu hundeen isaa akka ollatu kan taasisutti nan amana.\n" +
            "\n" +
            "Addaamiifi Ijoolleessaa fakkeenya isaan kan uumetti nan amana. Addaamiifi ijoollee isaa fayyisuuf dhufuu isaa nan amana. Qulqulleettii durboo kan taate Maariyaam irraa nama ta’u osaa nan amana. Ani ka’umsaafi jireenya kan jedhetti nan amana. Buddeen jireenyaa Ana, kan natti amanu hin du’u, yoo du’es ani nan kaasa kan jedhetti nan amana. Umumama isaatiif jireenya isa kan kennetti nana amana. Ani Abbaa keessan jira Abbaanis na keessa jira. Aniifi Abbaan tokkodha kan jedhetti nan amana. Cubbamoota qalbii jijjiirannaatti waamu kan dhufe, uumamaafis humnaafi cubbuu irra haqamu kan kennefitti nan amana. Laphee qulqulluutiin kan kadhatan, baayyina gara laafessummaa isaan kan simatutti nan amana.\n" +
            "\n" +
            "Otoo hin sassatin kan kennutti nan amana. Namni kan gaafate (kadhate) hundumaan isaa dhageessee abdii kan hin kutachiisnetti nana amana. Yaa Gooftaa Iyyesuus Kiristoos dhiifama naaf taasisi, akka dhiifama naa taasistuuf dhiifama kee nan arga’o. Sialee dhiifama kan kennu kan hin jirre, yaa Gooftaa ani uumama harka kee mirgaati’o dhiifama naa taasisi. Cubbamaa kanan ture ani si tajaajiluudhaan dhufeera, dhiifama keefi gara laafesummaan kee baayyee kan ta’e yaa uumaa, dhiifama naa kenni. Fuula keetti kufeera’o gaarummaan kee ballaa (guddaa) kan ta’e yaa Gooftaa dhiifama naa kenni. Kan cubbaman kiristiyaanota hundumaaf dhiifama taasisiif.\n" +
            "\n" +
            "Yaa Goofta baayyinaa dhiifama ketiin dhiifama naa kenni. Yaa Gooftaa baayyina tolummaa keetiin dhiifama naa kenni. Dhiifama cubbuu kootiif seera cuphaa naa hojjatteen dhiifama naa kenni. Cubbuun keenya nyaannee akka ittiin nurraa haqamuuf foon Waaqummaa kee isa nuu kenniteef jedhii dhiifama naa kenni. Dhiifama kan ittiin kennite seera kee ishee haaraadhaaf jedhii yaa Gooftaa ana garbichaa keetiif dhiifama naa kenni.\n" +
            "\n" +
            "Yaa Gooftaa gara Ilma ishee isa jaallatamaatti kadhannaan ishee ni dhagaa’ama malee, kadhannaa ishee isa hin tuffatamneen dhiifamni nuu taa’uuf kan nuu kadhattu kadhannaa Giiftii keenyaan dhiifama nuu kenni. Yaa Gooftaa waa’ee baayyina cubbuu kootiif kennaa sirraa fudhachuuf yoon hin ga’u ta’e iyyuu dhiifama naa kenni. Baayyina cubbuu kootiis hin millatin (ilaalin) qalbii jijjiirannaa malee cubbuu kan qulqulleessu hin jiru’o cubbuu xurii kootii baayina dhiifama kee duukaa kan qulqulleessu sidha’o (si waan ta’eef). Arjaafi tolaa kan taate dhiifama naa kenni. Samiin fuula kee duratti qulqulluu miti. Macci Ergamootaas fuula kee duratti qulqulloota miti, si duratti qulqulloota waan hin taaneefis lammii isaanii keessaa kan qaana’an jiru’o. Kanaafuu yaa Gooftaa si duratti uumamni qulqulluun hin jiru’oo dhiifama naa kennin siin jedha.\n" +
            "\n" +
            "Yaa Gooftaa dhiifama naa kenni. Ji’i koo akkasumatti darbaniiru’o, barri koos akkasumatti bu’aa malee darbaniiru, gara bara adda biraattis deebi’uuf abdiis hin qabu.\n" +
            "\n" +
            "Yaa Gooftaa koo dhiifama naa taasisi. Liqiidhaan qabameera’o lubbuu koo hidhaa cubbuu irraa kanan ittin baasu horii hin qabu’o, hojii badii kootiis baay’ateera’o yaa Gooftaa dhiifama naa kenni.\n" +
            "\n" +
            "Kunoo haramaan ni ga’ee warri haramanis mataa koorra dhabbatanii jiru’o yaa Gooftaa dhiifama naa taasisi. Kutamuun wayinii yeroon isaa ga’eerahoo, wayinichi garuu kichuudha waan ta’eef hin fayyadu, yaa Gooftaa koo dhiifama naa taasisi. Kunoo muki ija hin godhanne hundaaf qottoo qottoon qophaa’eera badii kan jedhame sun kanan ittin tajaajilu hojii gaarii kan hin qabne anaadha’oo yaa Gooftaa dhiifama naa taasisi. Yeroo ani callisutti duunni narra ga’eerahoo, yaa Gooftaa koo naa gaddi. Karaan koo baay’ee fagoodha, kan nama baay’ee dadhabsiisudhas, garuu ani karaa koof galaa hin qabu, yaa Gooftaa koo naa gaddi. Hojii gaarii kanan hin qabaanneef adduunyaa kana irraa gara keetti dhufuun kan naga’e miti, karaa ishee nama dhiphistu irrattis kan nama mudatu hin beeku’o yaa Gooftaa Ergamaan lubbuu koo baasuuf gara koo yeroo dhufu akka nan ariifachiisne sin kadhadha.\n" +
            "\n" +
            "Yaa Gooftaa ani garuu gargaarsa kee abdii nan taasifadha. Dhiifama keenis kan hafe abdii hin qabu. Yaa Gooftaa tolummaa kee irraa nan salphisin, badii hojjatee gara keetti kan deebi’u hin qaanessitu’oo. Dhiifama keefi kennaa keerraas nan qaanessin, baayyina tolummaa irraas. Yaa Gooftaa koo ofi jajuu irraa na fayyisi. Boonuu irraas na fayyisi, ofi gaddisuuf ofi ol ol qabuu irraa na fayyisi. Hinaaffi, hammeenyaafi abbaa (haadha) buddeeni irraa wal murteessuu irraa naa fayyisi. Yaa Gooftaa cubbuu isa guddaafi isa xinnoo, seexanni kan hojjachiistu hojii hundumaa irraa na fayyisi. Foon koo gammachiisu irraas na fayyisi. Miidhamuu koo irraas na eegi. Ganaafi balleessaa kan ta’e, jaalala Waaqayyoos kan jibbu harka diina koo diyaabiloos irraa na fayyisi. Diina koo narratti hin ergin. Mo’umsas hin hin kenniniif. Yoo mo’u humna isaatiin wanta na mo’e itti fakkaatee akka ofii hin jajjineef yaa Gooftaa halkanis guyyaas yeroo hundumaa sa’a hundumaattis na eegi kan nama qaanessaniif akka ibidaa kan nama guban, sammuu xuriifi sammuu badii irraa eegame akkan jiraadhu qalbii obsaa naa kenni. Bakka koos akka ani jiraadhu na taasisi.\n" +
            "\n" +
            "Hattuun akka na hin hanne iddoo koo irraas akka nan sochoosne, qarshiin jalaa badee obbolotaa isaa irra akka adda ba’e, akka orimaa akka naa hin taasisne, diina koo duratti nan ibsin. Cubbuu koo isa dhokates ifa na jalaa baasee akka natti hin kolfineef akka nati hin qoosne bakka kootti na jabeessi. Akka bakka ija gaarii godhattu, jabina lapheefi callisa lubbuutiin bakka kootti naa dhaabi.\n" +
            "\n" +
            "Waraana diinaan lapheen koo akka hin jeeqamne lubbuun koos ba’uuf galuudhaan gam tokko gam tokkotti naanna’u akka hin taane yaa Gooftaa koo waa’ee lubbuu koofi yaada cubbuu kootiin akkan boo’uuf, barri koos naanna’uuf hojii hiikuudhaan akka hin raawanne, jireenya humna diyaabiloosii humnaa keetiin balleessi. Akka dubartii abbaa mana hin qabnee, madaa isaatti madaan itti dabalamuusaaf akka nama dhukkubi isaa itti cimee abbaa qorichaa fedhu, yaa Gooftaa ani garbichi kee hojii hundumaan dadhabaa waanan ta’eef akka ijoollee abbaafi haadha hin qabne yeroo hundumaa gara keen ilaala.";

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