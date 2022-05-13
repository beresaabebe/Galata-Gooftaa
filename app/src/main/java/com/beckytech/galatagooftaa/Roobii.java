package com.beckytech.galatagooftaa;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jean.jcplayer.view.JcPlayerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;

public class Roobii extends OptionsMenuActivity {

    TextView textTitle, textContents;

    JcPlayerView jcPlayerView;

    String title = "Galata Gooftaa Kan Guyyaa Gaafa Roobii";
    String contents = "Kadhannaa qalbii jijjiirannaa\n" +
            "Yaa waaqayyoo koofi Gooftaa kooati ana irraa yoo fagaatte, anis yoon siin hin simadhu ta’e, jireenyi kan biraan naaf hin ta’uhoo, bowwaa (boolla) akkamii keessattan kufa laataa? hammeenya laphee koofi badii laphee koo qoricha balleessu sirraa yoon hin fudhadhu ta’e eenyuu irraan fudha. Diinota koo jalaa kanan miliqu, si’iraan kan hafe, eenyuunan qaba? Surraas naa kennitee laphee koo keessa kan naa jiraachisu kan biraa eenyuutu jira, si miti?\n" +
            "\n" +
            "Yaa Gooftaa Iyyesuus Kiristoos Ati foon koo yoo hin nyaattan ta’e Dhiiga koos yoo hin dhugdan ta’ee jireenya hin qabdan jette. Akkana waan jetteef lubbuu kooofi foon kootiin akkan hin duuneef, ga’adha otoo hin jedhin dirqamaan gara kennaatti nan dhiyaadha. Dabalees ilmi badii tokko beelaan gaafa dhiphate, beelaan du’uu koorra ka’een gara abbaa koo adeema, abbaa koonis waanan si yakkef garboota kee keessa akka isa tokko o na taasisi malee ilma kee jedhamuun naaf hin ta’u ittiinaan jedha jedhee yaadee gara abbaa isa akka deeme, abbaan isaas fagotti yemmuu argu (ilaalu) gaddaafi jaalalaan akka simate dubbatteetta’oo. Anis sababa kanaaf akka isaa, miilla qalbii jijjiirrannaan ka’e gara garaa laafessa abbaa koo nan dhufa. gara kee gara humna koo nan dhufa. Gara kee gara tiksee koo nan dhufa, gara kee gara naaf kadhatamu nan dhufa, kottaa nyaadhaa jette sagalee wangeelaan ni waamsiste.\n" +
            "\n" +
            "Dabalees gara kee dhufuu akka ani hin sodaanne laphee koos kan naaf jabeessu beekumsa koos kan naaf dabalu hammeenya koorra kan caalu dhiifama keeti. Jarreen faarisootaas cubbamootaas ni simata. Cubbamootaa wajjinis ni nyaata yoo sin jedhan iyyuu hamee isaanii sodaattee cubbamoota simachuu akka hin dhiisne isaanii wajjinis nyaachuu akka hin tuffanne wangeela irratti barreefamee ni jira. Kunis dhugaa dhugaa yoo ta’ee ajajaan (dura ta’an) cubbamoota anadha’oo akka ati nan tuffanne baree (beekee) gara keti yoo ani dhiyaadhe foon keef dhiiga keetiin lubbuu koofi dhiiga foon koo cubbuu irraa akka naa qulqulleessitu abdii qaba. Laphee koo cubbuu akka ibiddaa gubu hundaa irraa akka fayyistu abdii qaba. Kuusaan (dilbiin)arjummaa keetii hin dhumu’oo sif gatii ani kafalu (baasuu) akka naaf dhiistu abdii qaba.\n" +
            "\n" +
            "Arjummaa keetiin ulfaataadha’o kennaa laphee koo badhadhaa naa taasisu, surraa gubii ibiddaa bara baraarraa naa fayyisu, surraa gara mootummaa samitti na galchu akka naa galchituuf abdii qaba.\n" +
            "\n" +
            "Yaa Waaqayyo Gooftaa Uumaa koo sin kadhadha galaana cubbuu koo keessaa akka na fayyistuuf. dogogora koo irraa akka na fayyistuuf, duuka bu’aa kee Pheexiroosiin akka inni hin qaanofneef naasuu bishaani irraa akka fayyistee irree kee isa ol ol jedhuun mirgaa kee isa jabaadhaan liqimfamuu irraa akka fayyiste, sin ganuudhaan amantoota kee erga lolee booda, ajajaa diyaaqunootaa areegama isaa jalqabaa Isxifaanosin ajeesuudhaaf magalaatii erga ba’ee booda, gochaa kana hundumaas booda duuka bu’aa kee Phaawuloosiin akka simatte waliga’ii qulqullootaafi waldaa amantootaa keetiitti lammii keefi maqaa keen kan barsiisu barsiisaa ulfaataa ni taasiste.\n" +
            "\n" +
            "Yaa Gooftaa Iyyesuus Kiristoos, akka uma seera, mana Kiristaanaa kee irraa kanan fagaadhe anaanis na simadhu, dhiifama kee irraas nan fageessin. Arjummaa kees hangaa bara baraatti nan dhowwatin.\n" +
            "\n" +
            "Gooftaa koo kan taate yaa Iyyesuus Kiristoos cubbuu Metsaagu’iin akka dhiifteef, taayitaa kee isa jabaadhaan ormoota hedduu fuulduratti jabaatee siree isaa baatatee akka ka’uuf kan taasiste, akkasuma cubbuu koo hundaa naaf dhiifte ana garbicha keef jireenya fooniif lubbuu naaf kenni.\n" +
            "\n" +
            "Yaa Abbaa koo maqaa ulfaataa keen waan ani waamameef bara jireenya koo hundumaas sirriitti akka ana siif bitamuuf waaqefannaa kee naaf jabeessi.\n" +
            "\n" +
            "Waaqayyo Abbaafi Waaqayyo Afuuraa Qulqulluu wajjin bara baraaf kan jiraattu Gooftaa koo kan taate yaa Iyyesuus Kiristoos kadhannaa nama kanaanaawitii dhageessee, dhukkuffattee dhiphinni itti baayyattee kan turte mucaa ishee irraa Seexana akka irraa ifatte amantiin kees guddaadha, akka fedha keetii siif haa ta’u akka ittiin jette, fayyinas akka kenniteefiff yaa Gooftaa koo jooraafi jawwaraa kanan ta’u anis akkasuma sin kadhadha.\n" +
            "\n" +
            "Addunyaa ishee dabartuu kana hawwuudhaan kan na morkatu seexana ana irraa akka fageesituuf, yeroo hundumaas fedha kee akkaan hojjadhuuf tolummaa keenis akka na gargaartu, waggaa kudha lama dhiigi lola’aa kan turte dubartatti akka fayyiste, isheenis akka sitti amante, dhukkuba isheerraas fayyisuudhaan jireenya akka kennite akkuma kana anaanis dhukkubaa koo irraa na fayyisitii amantii naa kenni. Cubbuu koo irraas na qulqulleessi, bara jireenya koo hundaa dhugaadhaan akkan si Waaqefadhuuf maqaa kee isa ulfaataa hanga bara baraatti akka ani barsiisuuf dhugaadhaan ameen.\n" +
            "\n" +
            "Uumama kee hundaa erga xureesite booda gara qalbi jijjiirannaatti kan deebite dubartatti ejjituuf dhiifamni siif haa ta’u akka jette waa’ee deebi’uu isheetiifi waa’ee boo’icha isheetii akkasumas waa’ee gadda isheetiif cubbuun kee sirraa haqameera jette, yaa Gooftaa akka kana kan baayyatu imimmaan nama gubu na kenni, teri xuraa’ummaa koo irraa xinnoo na qulqulleessaa yoo ta’e bara jireenya koo hundumaa imimmaan akkana ija koo irraa haalola’u (haa dhangala’u)\n" +
            "\n" +
            "Yaa Gooftaa tolummaa keetiin guraachina fuula kootii naa qulqulleessa yoo ta’e, lammii kee keessaa akka nama siin hin beekne ta’udhaan erga si ganee booda deebi’uu isaafi gaabbuu isaa, gadda hadhaa’aa isaatiis booda duuka bu’oota keetiif hangafa kan ta’e qalbii jijjiiirannaa Pheexiroosii akka fudhatte amantoota keerrattis dura ta’aa taasistee akka filatte, manni Kiristaanaa kan ittiin dhaabbattu hendee amantii taasistee bantuu hiiktuu (furtuu) mootummaa samii akka kenniteef yaa Gooftaa anaanis akkasuma na simadhu. Bara jireenya koo hundumaa gara keetti akka ani deebi’ufi akka ani gaabbu akka ani deebi’ufi cubbuu ani hojjadhes akka naaf dhiistuuf waa’ee ulfaataa maqaa keetiif, waa’ee maqaa kee isa gaariif dhiifama naa taasisi. Cubbuu “Zakkiyoosii” dhiiftee amantii isa akka fudhatte, faarisoota caalaas kan filatamefi kan qulqullaa’ee akka taasiste waa’ee gaarummaa isaatiifis akka kabajje yaa Goofta koo yeroo hundumaa fuula kee duratti badii koo akka ani amanuuf lubbuu garummaa naa kenni.\n" +
            "\n" +
            "Yaa Gooftaa Iyyesuus Kiristoos fannoo irra yemmuu jirtuu waaqayyo dhugaa ta’uu kee kan amanee saamticha akka simatte hundumaafis akka hojii isaatiitti kennuufiif yemmuu deebitu, yaa Gooftaa tolummaa keetiinn na yaadadhu waan inni siin jedheef namoota hundaaf kan gadditu yaa Abbaa dhiifamaa, gaafa inni akkana siin jedhu har’a Jennata na wajjin seenta ittin jette. Waa’ee Cubbuu isaatiif waan fannifameef, badii hojii isa hundumaaf jettee, simaachu hin dhiifne. Waggaa kuma shaniif dhibba shani jannata cufamee ture banteef malee kan inni yaade caalaa surraa ulfinaa jabaa kenniteef. Cubbamaafi abbaa yakkaa kanan ta’u qaama koo bara baraan bakka ani jiraadhu bakka dhiifamaa kee isa ballaatti galshi, cubbuu koo naa dhiisi yakkaa koos dhiifama keetiin irra naaf darbi. Ameen naaf haa ta’u!";

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