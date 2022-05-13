package com.beckytech.galatagooftaa;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jean.jcplayer.view.JcPlayerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;

public class Kamisaa extends OptionsMenuActivity {

    TextView textTitle, textContents;

    JcPlayerView jcPlayerView;

    String title = "Galata Gooftaa Kan Guyyaa Gaafa Kamisaa";
    String contents = "Kadhannaa qalbii Jijjiiranna\n" +
            "Kanan si jaaladhu yaa Gooftaa, mana qulqullummaatti seera kennaa yerooo hojjatte, bayyinni jaalala keettikan ibsameedha. Haa ta’u malee natti ifee otoo jiruu jaalala kee akkanaaf kan ta’u jaalalli laphee koo keessa hin jiru.\n" +
            "\n" +
            "Ani hojii gaarii kanan hin qabne uumama xinnoo yemmuun ta’u, Atis bu’aa guddaa kan barbaaddu uumaa namaa gaddu yeroo taatu, naaf nyaata hanga naa tatutti jaalalli ati naa taate (goote) baayyee kan nama ajaa’ibsiisu dubbachuufis kan nama hin dandaa’amne dubbii keessummaadha. Dabalees lapheen koo jaalala kana otoo beekuu hanga harraatti si wajjin jaalala guddaa taasisu dhiisuu isaatiif baayyee kan nama dhiphisudha.\n" +
            "\n" +
            "Kunis utuu beekamu haraan dura dubbii na gargaaru dhiisee dubbii na midhu barbaadan ture’o. Tolummaa kee isa amana kan hin jedhamneen siin otoo hin jaallatin hafeera (jiraadheera). Siinis otoo sin jaallatin hafeera (jiraadheera). Siinis oton sin jaalatin yeemmuun jiraadhu atis kan hin beekne si taasisudhan nama fulduratti naman si jaaladhu haa fakkaadhu.\n" +
            "\n" +
            "Yaa Gooftaa koo sin namni hin jaallanne hiyyeessa abdii hin qabneedha naan jedha, beekumsa dhabiisa koo kanaf baay’ee nan gadda. Kanaan booda garuu waa’ee baay’inna tolummaa keetiif bara ati naaf kennitu hundumaa laphee koof lubbuu kootiin humna kootiinis sin jaalladha. Otoo naa ta’eemaa jaalalli koo jaalala ergamootaafi qulqullootaa wajjin wal qixxee naa ta’e akka isaanii utuu ani si jaalladhee akkaman jaalladha ture.\n" +
            "\n" +
            "Haa ta’u iyyuu malee jaalalli koo akka kan saanii yoo hin ta’u iyyuu ta’e, sababa hawwii kootiif jaalalli isaanii waa’ee koof naaf haa ta’u.\n" +
            "\n" +
            "Yaa Waaqayyo Gooftaa koo hangaa haar’atti otoo sin jaallatin qofa kanan deddeebi’e otoo hin ta’in biyya lafaa kana irratti badii guddaa kanan sirratti dalageedha. Kanaafuu fuula kee dura dhaabbadhe gadda guddaadhan badiin koo guddaadha nan jedha. Dabalees cubbuu yeroon hojjedhe fedha kee ala baheerahoo, fedhii kee ala bahuu kootiifis baay’ee nan gadda. Gadda koo irranis kan ka’e iji koos madda imimmaanii otoo naa ta’ee baay’ee nan jaaladha. Namni sammuu qabu sababa yakka isaatiif gadda inni gaddu hundumtuu laphee koo keessatti otoo walitti qabamee nan jaaladha. Kanaafuu akka humna naa kennitutti amma dandeetii kootii nan gadda. Fuula kee dhaabadhee cubbuu koofi badii koo, sababa cubbuu kootii nan sooka’a. Surra kee gargaarsa nan taasifadha. Hanga gaafa du’aattis gara cubbuun sooka’eetti hin deebi’u, sababa cubbuu irraas ofan eega.\n" +
            "\n" +
            "Duuka buutota keetti akka ibsite, hiika sagalee Waaqummaa keetis baranii gara beekumsa Waaqummaa kee isa hin qoratamneetti akka deebi’an yaa Gooftaa koo ija laphee kootiif ija sammuu koo naaf ibsi. Ulfaatota kan ta’an macaafota akkan baruuf iccitii hiika isaaniis hubadhee ajaja kee akkan hojjjadhuuf fedha kees akkan raawwadhuuf ija jaamota banteefi ifa lubbuufi foonii akka kenniteef anaafis naaf kenni. Ifa isa dhugaa akka ani arguufi ijaa laphee kooti naa banii. Yaa Gooftaa wantaa ati feetu akka ni raawwadhu na taasisi. Dhukkubaa lamxii kan qabu kan fayyiste sidha. Anaanis akkuma isa lamxii cubbuu keessafi lamxii afaani irraa na qulqulleessi. Kadhannaa koos na qulqulleessi jedhe akka si kadhatteefi akka si sagade atis toluma keetiin gatii kadhannaa isaati akka keennitefi kadhannaa koos akka namicha lamxiicha naaf haa ta’u. Yaa Gooftaa iyyeessaafi rakkaata kannan ta’e anis fayyinaa siraa nan feedha. Dubartii dugdii ishee goobate gara mana Kadhannaa yemmuu isheen seentu gaddittefi hidhaan kun sirra haa hiikamu, dhukkubniis sirraa haa fagatan akka ittin jette batalumasaa fayyitte sagalee taayita keetiif gooftummaa kee hundaan akka si ajaa’ibsiifatte, yaa gooftaa tolumaa keetin hidhaa cubbuu koo irraa hiiki. Xurraa’ummaa malee akkan si fuldura deddeebi’uuf qaama qajeelaa naa kenni. Hanga bara baraatti du’aafi hidhaa si’ool irraa kanan hiikame haa ta’u. Ameen naaf haa ta’u!\n" +
            "\n" +
            "Qalbii jijjiirannaa raajicha Daawitiin akka simatte, kufaatii hadha’aas erga kufee booda karaa harkaa raajicha Naattaan akka kaafte, dhiifama siif taasiseera gaafa inni ittin jedhu dhiifama gochu keetiifiis mallatto keniteefif. Dadhabaa ta’uudhan akkan badee ananis akkasuma dhiifama naaf taasisi. Cubbuu koo isa guddaas narra haqi. Kufaatii hadhaa’a ani kufe irraas na kaasi. Si malee kan naa kaasu hin jiruhoo. Ani rakkataa waanan ta’eef akka Naattaan bakka ani kufe kan na kaasu hin jiru. Yaa Gooftaa Naattaan, ani arjummaa keetti nan abdaadha. Qaama koos fuula kee duratti nan gata, Gooftaa raajjotafi Gooftaan araarsotaa sidha’o. Bullaa’uma koo irraa na kaasi badii koos irraa na darbi. Waa’ee badii koofis jette nan gattin.\n" +
            "\n" +
            "Yaa Gooftaa hanga ani bara koo raawwadhutti cubbuu irraa na eegi. Abdii kutannaadhaan kadhannaa Hisqiyaas kadhate simatte karaa sagalee Isaayyasin bara baay’ee akka kenniteefi jooraa yookaan rakkataa kanan ta’e anaafis akkasuma naa taasisi. Bara baraan kan jiraattu yaa Gooftaa midhama bara baraafi du’a cubbuu irraa na kaaftee duuti bakka hin jirre mootummaa samiitti jireenya bara baraa naa kenni. Harka naman kan hin hojjetamne bara baraan kan jiraattu, badiin kan irraa hin jirre mana jireenya ishee gubbaatti yaa Gooftaa hanga bara baraatti akka achii na jiraachiftu nan jaalladha. Ameen naaf haa ta’u!\n" +
            "\n" +
            "Baha biiftuutti hanga lixa biiftuutti kan jiraan kadhannaa qulqullootafi raajota akka simatte, gatii kadhannaa isaaniis jireenya lubbuufi foonii gammachuu bara baraas akka kenniteefiif beekaniis otoo hin beekinis dandaa’anis osoo hin dandaa’inis kan isaan hojeettan kan dhokatteefi kan mul’attuu cubbuu isaani akka dhiifteefi yaa Gooftaa Iyyeesuus Kiristoos rakkata kanan ta’ee anaanis cubbuu isaan mul’isee hojjedhefi dhoksee hojjedhee akka naa salphistuuf dhiifama sirraa naan feedha. Hangaffaas yoo ta’ee quxusuu ana garbichaa kee akka warra si tajaajilanii naa taasisi sinis kanan ittin si waamu hundumaan kadhannaa koo simadhu. Jaallatoota kee wajjin gammachuu hin darbineen ulfinaan akkan jiraadhuf kan gahu naa taasisi.Hanga bara baraan ameen naaf haa ta’u dhugumaan!";

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