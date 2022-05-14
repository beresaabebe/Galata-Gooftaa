package com.beckytech.galatagooftaa;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jean.jcplayer.view.JcPlayerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;

public class Jimaata extends OptionsMenuActivity {

    TextView textTitle, textContents;

    JcPlayerView jcPlayerView;

    String title = "Galata Gooftaa Kan Guyyaa Jimaata Kadhatamu";
    String contents = "Sirna ga’ilicha\n" +
            "Yaa goofta ani hojii gaggariidhaan iyyeessa waanan ta’eef harka fuudhii siif dhi’eessu hin qabu. Garuu qulqulloonni kennaa qulqulluu yeroo fudhatan jaalala isaan iif dhi’eessan, waa’ee jireenya kootiif gara abbaa keetti jaalalaati dhi’eessite akka harka fuudhii tasiseen sii dhi’eessa. Du’a keef dhiphina keef yaadannoo akka ta’uuf Giiftii Maariyaamii qulqullootaa fi lammi’ootan kee hndaaf. Anaafis suurraa waan naaf kennitef galatasii dhi’eesssina.kanan alas haqa cubbuf, cubbuu irraa hiikamu akka naa kennituuf sin kadhadha. Yeroo ani du’us suurraa akka naa kennituuf abdii nan taasifadha.\n" +
            "\n" +
            "Warra qulqulloota irra kan qulqulloofte yaa haadhaIyyasuus Kiristoos si irraa Gooftaan ulfa’ee (dhaalate) ani vharra kanan fudhadhu dha. Ati haadha iyyasuus kiristoos akka taatuuf nama hundaarra kan ga’e cubbuun addaam sirra hin geenye. Ani garuu cubbuu kananhojjedhe yemmuuun ta’u ilma kee iyyasuus kiristoosiin fudhachuufgara kennaatti nan dhiyaadha.\n" +
            "\n" +
            "Yaa haadha dhiifamaa, badiin koo baayyee waan ta’eef yemmuu ani gara kennaatti dhiyaadhu (isafudhaadhu) akka dhiifama naa taasisuuf naa gaddi naa kadhaadhu.\n" +
            "\n" +
            "Ani fudhaachuun ko ulfina keetii gadi qabuu, tuffachuu akka hi taane, ati ilma kee yeroo fudhattee qophii qophooftee, ulfinni kee qulqullummaan kee waa’ee koof akka naa dhiistu sin kadhaadha.\n" +
            "\n" +
            "Yaa gooftaa Iyyasuus dhala nama barbaaddee iddoo isaanitti deebisuuf kandhufte sidha. Kanan bade anaaanis barbaadde leencota nama butan irraa gara ani fayyutti, naasuu malee gaadidduu keetiin boqadhee garaan jiraadhutti gara daangaa kee isaa hin diigamnetti na galchuun ammaam sirraa barbaachisaa? Yaa Gooftaa sagalee garbicha kee Daawititti, duutni qulqullootaa fuula waaqayyoo duratti ulfinadha jetteettahoo yaagooftaa koo cubbuudhaan du’a dhufu irraa na fayyisi.\n" +
            "\n" +
            "Jireenyaa fi qulqullummaa naa kenni. Waan gaariis hanga bara baraatti naa taasisi. Yaa gooftaa fayyuuf deebi’uu isaa malee cubbuu isaatiin du’u akka ani hin jaallanne kakadheera jettee Hisqi’eelirra buluudhaan dubbattee turte.\n" +
            "\n" +
            "Yaa gooftaa namoota warra deebi’aniif qalbii jijjirrannaa kennitu naafis keeni. Yaa gooftaa warra qalbii jijjirrannaa hin barbbaachisnee qulqulloota sagatamii sagal caalaa, deebi’uu cubbamaa tokkof ergamootaa biratti gammaachuun ni ta’aa jette dubbateetta.\n" +
            "\n" +
            "Yaa gooftaa ergamoota biratti gammachuun akkanaa akka naa ta’uuf qalbii jijjirannaa kana fakkaatu naa kenni. Yaa gooftaa ba’an kan isinitti ulfaate fi kan dadhabdan gara koo kottaa isnan boqochiisa jette dubbateetahoo. Yaa gooftaa gara keeakkan dhufuuf dhufaatti akkaan naaf keenni. Ba’aa cubburra na fayyistee boqonnaa bara baraa naaf keennituuf. Ameen naaf haa ta’u.\n" +
            "\n" +
            "Yaa gooftaa cubbammoota garaqalbii jijjirrannatti waamuufan dhufee malee qulqulloota waamuu hin dhufne jette dubbatteetahoo. Yaa gooftaa badii koo fi cubbuu koo naa dhiiftee ana cubbamticha waamichaa keetiin gara kee akka ani dhufu na taasisi. Yaa gooftaa namni lubbuu isaan yoo miidhamee maal buusaaf akka jette yaa gooftaa lubbuu koo fuula kee duratti horii akkan taasifadhu naa taasisi.\n" +
            "\n" +
            "Yaa gooftaa iyyasuus kiristoos iyyeessa dadhabaa kanan ta’e anaaf dhiifama naa taasisi. Ani xura’adh, ani ejjaadha, ani hamaadha,ani dalgifamaqdha,ani ubbuun kanan liqinfameedha. Ani kanan badeedha, ani kanan kufedha, ani kan karaan najalaa badedha, ani kanan tuffatameedha,ani kan gadi qabameedha (ilmaan xinnaadha) ani waa’ee hojii badiidhaaf kanan salphadheedha. Badiin narra jiruus kana qofa miti. Baayeedha kana irras harka lama ta’a. yaa gooftaa ulfaataa koo siin kadhaadha, badhaasaa kan taate yaa gooftaa ubbuu guddaa ani hojjedhe naa dhiisi, ati yakka koo beekta’oo cubbuu hundaa irraa na qulqullessi.\n" +
            "\n" +
            "Yaa Gooftaa koo siin kadhaadha, dhiphinni akka natti dhufuuf kanan hojjedhe diinummaanis kan natti kaka’an na harkisuun wayyaa kan narraa baasaan qullaa kan na ambisaan, gammisiisota irraa akka na fayyistu, narraa horii fudhatanis naa deebisi,dibaa gara laafesummaa keetinis madaa koo naa fayyisi. Yaa gooftaa koo fedhaa kee isaa tolaaf, ulfaataa fannoo keetiin seexana ariitiidhaan mila koo jalatti kufisi. Yaa gooftaa taayitaa keetin humnaa isaa daadhabsiisa, maccaa isaas ergmoota keetiin narra bittimsiisi, sammuu badii irraa fi dhiphina irraa na egi.\n" +
            "\n" +
            "Ani garbicha kee waan hin taane (hamaa) hundaa irra na eegi. Nagaa fi cal-jechuun bakka ittimurtaa’u naa keenni. Fashaa seexanaa akka ani hin hojjenneef harkaa diinaati nan gatiin. Dubbii kan jallisu sun akka kufe, anis akka anihin kufneef ana garbichaa kee na simaadhu. Amantoonni hojii gaarii hojjetanii sa’a kudha tokko irratti gatii isaanii akka argatan anis hojii garii hojjedhee isaanii wajjiin akka ani argadhuu wayinii kee wajjiin na lakkaa’ii.\n" +
            "\n" +
            "Yaa gooftaaqalbii jijjiirannaa qulqulluudhaan akka warrasi tajaajilani akka gamsiisichaa fi akk qaraxichaa anaanis harka ejjaatii na fayyisi. Kan nama jajjabeesu ergamaa dhiifamaa naa ajaaji. Yaa gooftaa lubbuu garbicha kee isaa badee fayyissiti garaa mootumma kee ishee hin darbineetti galchii.\n" +
            "\n" +
            "Deebi’uu cubbamaa malee du’a isaa kan hin jaallanne yaa gooftaa laphee si talaajiluu naa kenni, sitti amaneerati waa’ee baayina dhiifamaa keetifis siinan barbade malee adda biraa kanan barbadee hin qabu. Ani iyyeessa waanan ta’eef yeroo hundaa nan gadda.\n" +
            "\n" +
            "Yaa Gooftaa hojii kootinis waanan sii gammachisee hin qabu’oo qalbii jijjiirannaa isaa jalqabaa naa kenni, ulfina keetinis na marsi. Dadhaabina koos gargaarsaa ulfaataa fannoo keen na jabeessi. Mataa koo gara bakka itti kufeetii kaasii. Baayyina cubbuu ani hojjedhe hin hordofin. Sirraa kan hafee cubbuu koo kan narra haqu hin jiru’oo diinni na dogoggorsiisee dadhabina koo kanan balleessee bakka wayinii keetii arami kunuunsi. Cuuphaa kee shee ulfaatuudhaan kan qulqulleessite lafa kee hin dhiisiin, qoraatiin itti biqileera’o. yaa gooftaa hojii seexaaa irraa fi xuraa’ummaa hundaa irraa akka qulqulleessituuf ergamaa dhiifamaaeergi.\n" +
            "\n" +
            "Waaqayyoo jabbaa fi abbaa dhiifamaa kan taate sidha’o, siif bara baraaf ulfinni haa ta’u. Ameen dhugumman haa ta’u!";

    String url = "https://firebasestorage.googleapis.com/v0/b/galatagooftaa-a83c5.appspot.com/o/kan%20yeroo%20hundaa.mp3?alt=media&token=ee19d78a-3246-4525-b2a3-6a376b7cfa78";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeroo_hundaa);

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        textTitle = findViewById(R.id.textTitle);
        textTitle.setText(title);

        textContents = findViewById(R.id.textContents);
        textContents.setText(contents);

        jcPlayerView = findViewById(R.id.jcplayer);

        jcPlayer(jcPlayerView, title, url);

    }
}