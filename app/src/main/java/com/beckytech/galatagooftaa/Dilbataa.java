package com.beckytech.galatagooftaa;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jean.jcplayer.view.JcPlayerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;

public class Dilbataa extends OptionsMenuActivity {

    TextView textTitle, textContents;

    JcPlayerView jcPlayerView;

    String title = "Galata Gooftaa Kann Guyyaa Gaafa Sanbata Guddaa Kadhatamu";
    String contents = "Kadhannaa qalbii jijjiirannaa\n" +
            "Hawwii kadhannaa kootii yaa qorichaa koof Gooftaa koo Iyyesuus Kiristoos, kunoo kadhannnaa warra kana hundumaan gara koo kottu. Hin turinis. Lubbuun koo laphee koo Iyyesuus Kiristoosin ariitin gara koo kottu jedha. Afaan koo Iyyesuus Kiristoosin gara koo kottu jedhi. Yaa aduu qulqulleetti duukana lubbuu kootii narraa fageessi yaa abdii samii, jaalalaa qorra biyya lafaatiin laphee koo isa hidhame ho’a jaalala keetii kenniifiif,\n" +
            "\n" +
            "Yaa Gooftaa koo wangeela irratti, ajajaa dhibbaatiin gara mana kee nan dhufa, mucaa kees siifan fayyisa akka ittin jette, lubbuu koon gara kee nan dhufa, sin fayyisas jedhi. Kanaan booda waan hammeenya akka ani hin dubbbanneef afaan koo naa fayyisi. Waan gadhee (badii) akka ani hin ilaalleef, ija koos naa fayyisi. Waan badii akka ani hin hojjanneef lubbuu koofi foon koo hundumaa naa fayyisi.\n" +
            "\n" +
            "Gooftaa koo ana garbicha keef badii isaa dhiisuuf gara koo dhufu hin turin. Yaa egduu qulqulluu, lubbuu koo baayyee kan jaallattu yaa tiksee koo, waa’ee ulinaafi galata Waaqayyoof qalbii jijjiirannaa, ulfinaafi gaddaan akkasumas jaalalaan akkan raawadhu na agrgaaru.\n" +
            "\n" +
            "Waa’ee gorsa qalbii jijjiirrannaafi laphee ulfinaan gaabbuun kadhannaa guddaan kadhadha. Yaa Gooftaa uumaa koo boo’icha laphee qulqullummaa naa kenni. Yaa Gooftaa natti jabaa kan ta’an qoraattifi goraa hammeenya gantummaa narraa fageessi yeroo hundumaa bo’ica nama gaabbisiisu naa kenni.\n" +
            "\n" +
            "Yaa Gooftaa horii seexanaa kan ta’u hidda mi’aa cubbuu, bo’ichaa narraa buqisee gatu na kenni. Yaa Gooftaa bo’icha qulqullootaa na kenni. Yaa Gooftaa cubbuun otoo jiruu akka hin duuneef waa’ee ofi isaatiif kan boo’e sanyii imimmaan Daawit naa kenni. Yaa Gooftaa koo akka koo kan badii balleesse, akka kufaatii kootii kan kufe hin jiru akka ani qoratames namni qoratame hin jiru’o. Cubbuu ani hojjadhees tokkoo qofaa waan hin taaneef cubbuu kootiin qulqullummaa warra kaanis balleessera’o.\n" +
            "\n" +
            "Yaa Gooftaa koo otoo ani hin beekin kan na uumte sidha’o. Ati yaa Gooftaa ulfaataa barsiisaa jabaadha., ani garbichi kee garuu dadhabaadhafi kanan tuffatamedha afaan koos duudaadha, fooliis kan qabudha, anis cubbamaadha dadhabaadhas, lapheen koos kan xuraa’edha yaa Gooftaa tolummaa keeti dhiyaadhee sin waama, kadhannaa qulqullootaafi cubbamootaa kan warra badii dalaguus kan dhaga’u si’i, si malee tolaan hin jiru akka kee dhiifama kan namaa taasisu hin jiru’o.\n" +
            "\n" +
            "Yaa Gooftaa koo, hojii harkaa kee isa qulqulluu waanan ta’eef waa’ee cubbuu kootiif nan dhiisin, yaa Gooftaa foon koo irraa na qulqulleessi badii koo baree humna koo ala akka ni hin banne diinni koos akka na hin injifanneef humna naa kenni. Cuuphaa kee ulfaattuudhaan mana hojjatamte, foon koo akka hin diiginneef cubbuu badiidhaan akka nan xurreessineef waa’ee dhiifama cubbuu kootiif gara keetii nan kadhadha. Yaa Gooftaa, lubbuun koo akka hin Miidhamnee adaraa.\n" +
            "\n" +
            "Yaa Iyyesuus Kiristoos waa’ee dadhabummaa koof, waa’ee gadda kootiif waa’ee dhiphina kootiif sirraa nan kadhadha. Waa’ee badii fuula koof waa’ee badii koof sin kadhadha. Ifa dhugaa akka ani arguu hin dandeenye cubbamaa gurraacha’adha’o warra gara keetti hin deebineef murteef du’a kee yaadu naa kenni.Yaa Gooftaa badii koof qaanii koo imimmaan narraa dhiqu naa kenni. Yaa Gooftaa imimmaan si tajaajilu naaf kenni. Yaa Gooftaa gadda kan narraa fageessuufi guraachaina fuula kootii imimmaan narra dhiqu naa kenni. Yaa Gooftaa imimmaan xurii qaama kootii narraa dhiqu naa kenni. Yaa Gooftaa imimmaan gammachuudhaan simattu naa kenni.\n" +
            "\n" +
            "Imimmaan warra kan simattu, obboleessa isaanii hanga awwalcha irraa kaastuufitti otoo walirra hin kutin akka dhangalaasan imimmaan sanyii obboloota Alazaar naaf kenni. Boo’icha ati simatte akka bo’e akka imimmaan sanyii Pheexiroos naa kenni. Mila kee isa qulqulluu irratti imimmaan ishee lolaaftee rifeensa mataa isheetiin akka haxoofte (sukkumte) boo’icha sanyii Maariyaam Magdalaawit naa kenni. Boo’icha ishee waa’ee qalbii jijjiirannaa isheetiif ta’eeraafo.\n" +
            "\n" +
            "Imimmaan sanyii dubartattii iyyeessa muccaa ishee du’aa kaasteef naa kenni. Siree koo imimmaan koon nan jiisa. Affaa koos imimmaan koon nan dhiqa jedhee Daawit faarsaa 6ffaa irratti akka dubbate, sanyii akka imimmaan Daawit naa kenni.\n" +
            "\n" +
            "Yaa Gooftaa sanyii imimmaan barsiisota Abbootti kootii naa kenni. Sanyii imimmaan cubbamootaa naa kenni. Yaa Gooftaa imimmaan ishee akka lagaa lolaatuun na dhiqi, yaa Gooftaa balbala cufame naa bani. Yaa Gooftaa koo madda imimmaan wal irraa hin cinne naa baani. Yaa Gooftaa, kan wal irraa hin cinne lolaa imimmaanii naa lolaasi. Waa’ee badii kootiif waa’ee baayinaa cubbuu kootii, waa’ee miidhama cubbuu kootii, waa’ee horii nagadaa kan ta’u waa’ee badii kootiif yaa Gooftaa dhiifama naa kenni.\n" +
            "\n" +
            "Yaa Gooftaa koo, lubbuun koo foon koo irraa hangaa adda baatuutti na gargaari iddoo wayinii ishee baddee, iddoo ija gaariis fedha koo isa hadha’aaf cubbuun koo kan irratti leenjifaman soqii na kunuunsi.\n" +
            "\n" +
            "Yaa Gooftaa, gara fedha hawwii kootiitti nan galshiin. Murtee kees sodaadhee lubbuu koo fuula keetti gateera. Yaa Gooftaa, iyyeessa gargaarsa eeggatuuf gaddi. Baayyina gara laafessummaa kee kan kadhatu rakkataa kee hin salphisin. Haareffamuu cubbuu kootiif badii koo irra ani iyyeessa kufeedhahoo, jiraachummaa keetiin xurii cubbuu iraa na qulqulleessi. Garbichoota maqaa kee jaallataniif kan qopheesite imimmaan qalbii jijjiirannaan na dhiqi. Yaa Gooftaa, salphina koo naaf dhoksi. Umamatti yeroo murteessitu yaa Naaziraawii Iyyesuus Kiristoos kadhannaa koo naaf dhaga’i. Yaa Gooftaa Uumaa koo fuula kee kadhannaa koo irraa hin deebisin boo’icha koos simadhu imimmaan koos hin qaanessin. Ani sitti hirkadhee kanan jiraadhudha’o yaa Gooftaa koo waa’ee baayyina cubbuu kootiif sin bitama.\n" +
            "\n" +
            "Yaa Gooftaa koo hanga bara dhuma jireenya kootiitti maqaa kee guddaa nan galateeffadha. Kiruubeeliin, Suuraafeeliin, macci ergamootaa hundumaa siin ni galateeffatu. Hangaa bara baraatti ameen dhugummaan nuuf haa ta’u!";

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