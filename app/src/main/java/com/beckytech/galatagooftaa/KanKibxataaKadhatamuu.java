package com.beckytech.galatagooftaa;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jean.jcplayer.view.JcPlayerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;


public class KanKibxataaKadhatamuu extends OptionsMenuActivity {

    TextView textTitle, textContents;

    JcPlayerView jcPlayerView;

    String title = "Galata Gooftaa Kan Guyyaa Kibxataa";
    String contents = "Waa’ee Fooniifi Dhiiga isaa, waa’ee qurbaana qulqullaa’aa.\n" +
            "\n" +
            "Gooftaa koofi qorichaa koo kan taate yaa Iyyesuus Kiristoos, Qurbaana qulqulluu fooniifu dhiiga kana keessa waaqummaan akka jiratu nan beeka. Kanas waanan beekeef (bareef ulfina hundaa caalaa kan ulfaate foon kee ulfina samiirra jiru hundaa wajjin nan kabaja. Fakkeenya hibistii mul’atu kanaanis akka ani fudhadhu nan amana.\n" +
            "\n" +
            "Ulfina hundaa caalaa kan ulfaatu dhiiga kee, ulfina isa samiirra jiru hundaa wajjin nan kabaja. Fakkeenya “Wayinii” mullatu kanaanis akka ani fudhadhu nan amana jilbeenfannaan (sagaduun) kan ta’uuf ulfaataa Waaqummaa keetii akka ni fudhadhu laphee guutuu nan amana. Yoo akkanas ta’ee guyyaa tokkoo uumaa koo, tiksee koo, murteessaa koo, qoricha koo nan fudhadha. Dabalees qurbaana qulqullaa’aa kana qaama Ibistiifi wayiniin akka ani argadhu nan amana. Hibistiifi Wayini qofa ta’uun akka irra hin jiraanne nan amana.\n" +
            "\n" +
            "Mootummaa samii irratti, Kiruubeeliifi Suraafeeliin kan sii sagadan, uumaan addunyaa hundumaa sidha. Mootii Moototaa kan taate ati qurbaana qulqullaa’a kana keessa dhokattee akka jirtu beekee amanee nan fudhadha.\n" +
            "\n" +
            "Yaa Gooftaa koo jechi kun akkumaa ati dubbatte jecha keeti malee jecha biraa miti. Jecha kee waan ta’eefis haadha keenya kan taate Manni Kiristannaa kan isheen amantu hundumaa nan amana, icitii dhugaa miti kan naan jedhuufis lubbuu koo dabarsee nan kenna.\n" +
            "\n" +
            "Yaa Gooftaa waa’ee cubbuu koof, kan naaf hin taane, raammoo lafaa yemmuu ani ta’u siin Gooftaa koo fudhachuu akkamittan dandaa’a. Ergamoonni kan siif jilbeenfatan Gooftaan addunyaafi walitti qabami namoota hundumaa sidha. Si fulduratti gatii kan hin qabneen fakkadha. Ati garuu Gooftaa ajaa’ibsiifama utuu taatee jirtuu siin fudhachuu akkamittan danda’a. Fudhachuun koo illee haa turuu al tokko illee ija kee deebiftee na ilaaluuf dhuguma kan naaf hin taanedha.\n" +
            "\n" +
            "Yaa Gooftaa ati samiirra kan buute na wajjinis wal qunnamuuf na gammachiistees foon keefi dhiiga kee na nyaachisuuf naaf dhufte. Haa ta’uu iyyuu malee ati arjumma akkanan yoo naaf dhufte iyyuu ani baayyina badii kootiif si fudhachuun dhuguma kan naaf hin taane akka ta’e nan amana, nan amanatamas. Dabalees ani fuula kee duratti uumama tuffatamafi kan gatii hin qabnedha. Kanan tuffatameefi kanan gatii hin qabnee qofaa osoo hin taane seera kee kanan diige baay’ee cubbamaadha. Yaa Gooftaa ati na beekta hoomaalan sitti himaa, sitti yeroo meeqan darbee si yakke, kanan si yakkes lakkoofsaa hin qabu.\n" +
            "\n" +
            "Gooftaa lubbuu kootiifi mootiin lubbuu kootii si qofaa ta’ee utuu jiruu shiftummaa kootiin si’a baay’ee lubbuu koo keessaa baase si ari’adheera. Bakka keefi iddoo kee diinota keefi diinota koo galshee jiraachiseera. Galshee kan ani jiraachise diinoonni keefi diinoonni koo seexanaafi cubbuudha. Ati garuu dhiifamni amala kee waan ta’eef, ani badii akkanaa si’irratti hojadhee yoo ani jiraadhu badii koo undumaa utuu natti hin yaadin dhiifama keetiin gara kootti ni deebita. Umurii qalbii jijjiirannaas naa keennite. Ofii kees dabarsitee laaxhudhaan lubbuu kootiifi foon koof abbaa ni taate. Kana gochuun kees jaalala kee naaf baay’isuu qofaaf malee ana irra bu’aan argadha jette miti. Jaalala kee baay’isuuf yoo ta’e irraan kan hafe uumamni hundumtuu si fuulduratti qulqulluu miti, qulqullumaan ergamoota hundumaalle. Uttu ma qofaas ta’e qulqullumaa koo yaadde gara koo dhufuun naaf hin ta’u ture, anis si simachuun kan naaf ta’u miti.\n" +
            "\n" +
            "Yaa Gooftaa ati bara baraan qulqulluu akka taate otoon beekuu, laphee koo isa dadhabaadhaan, afaan koo isa salphadhaanis, badiin sa’atii tokko ille kan adda irraa hin baane laphee kootiin siin simachuu akkamittan danda’a. Haa ta’u iyyuu malee akka anaaf hin taane nan amana, nan amanatamas.\n" +
            "\n" +
            "Nama kan uumte yaa Gooftaa, seera ati dangeessiteen fuula kee akka ani dhaabadhuuf na jabeessi, lubbuu dhaabdee lafee kan lalisiiste yaa Gooftaa, badii kootiifi cubbuu koo natti hin yaadin. Kanan qaana’e kanan salphadhe ani fuula keetti nan sodaadha’oo, gara dhiifama keetti na waamuuf abdii kee naa tursi. Yaa Gooftaa maqaa kee kan ganeef waan hojjatteef yaadadhu, erga ganee boodas bakka gubiitii baaftee gammachuun gara itti taasifamu gara jannataatti deebifte. Abdii isaas si irra hin kunne, rakkataa kanan ta’u badii koo hadhaa’aa naa dhoksi. Golgaa cubbuu koottis baqaqsi, gurrachummaan fuula kootiis, murteen dhugaa kennamuuf macaafonni fuula kee duratti yemmuu diriirfaman nan salphisin. Yaa Gooftaa Uumama kee hundaaf murtee yemmuu kennitu fuula kee duratti kanan salphadheefi kanan dhiphadhe ani afaan loqoda’adhaan sirraa kadachuuf ija hin jabaadhu kanaafuu nan salphisin.\n" +
            "\n" +
            "Yaa Gooftaa ani sin gammachiisne’o fuula kee durattis waan gaarii hin hojjanne’o, baay’ina badii kootii hirina sammuu kootiin afaan koo xuroofteetti, fooliis godhateettiso. Afaan koo isa xuuraa’eenis nan dubbadha, fuula koo isa xuraa’es gara keetti nan deebisa. Dhiifama akka naa taasistuuf ami uumama keeti’o gara keetti nan kadhadha. Ulfina waaqummaa kee isa nama sodaachisuufi isa nama naasisuun yeroo mullattu, cubbuun guutamee fuula kee otoo ani hin ijaajjin, Ergamoonni si galateeffachuu si ajaa’ibsiifachuuf yemmuu bu’an, maqaa kee ulfaatatti waan amananiif, dhiphinaan bitamaa namoonni turan hundumtuu, lubbuun isaanii akka olitti qabamuuf nagaariitiin yeroo waamaman, uumamni hundumtuus ba’a cubbuu baatanii teessoo kee isa sodaachisu fuula dura yemmuu dhaabbatan, kan hojjata badiifi gaariin hundumtuu yemmuu sana hojiin keenya ifa ba’a, iccitiin keenyas ifa ba’a. Xalayaan hojii salphina keenyaa, fuula Ergamootaa duratti ni diriira. Hojiin keenya fuula uumama hundumaa gidduuttis ni dubbifama. Yaa Gooftaa ulfinni si’a sanaa ammami haa ta’u! Teessoo nama naasisuufi nama sodaachisu irraa teesse yeroo mul’attu, ulfinni kees yeroo fuula kee duratti mul’atu, uumama kee hundaas qajeeltummaafi dhugummaan yeroo yeroo bittu, kan dhokate hundumtuu yemmuu mul’attu, qulqullootis cubbamoota irra yemmuu addan ba’an.\n" +
            "\n" +
            "Abdii koo kan taate yaa Gooftaa Iyyesuus Kiristoos, Ulfina gidirichaa ilaaluuf kan nama dhiphisu waan ta’eef yerootti sa’a sanaaf dhiifama kee nan barbaada. Fuula kee duratti cubbuu ani hojjadheef garibicha kee hin morkatin. Dhiifama keetiin malee murtee kee irraa fayyuu kan danda’u hin jiruhoo.\n" +
            "\n" +
            "Yaa gooftaa barsiisaa koo, murtee nama dhiphistu kana irraa na fayyisi. Murtee jireenyaa irraa kan hin taane, ishee irraa waan itti dhufteef, namoonni hundumtuus kan ittin dhiphatan, ammaas yaa Gooftaa koo lubbuu koo guyyaa sana irra akka fayyistuuf, murtee badii irraas akka na fayyistuuf sin kadhadha. Arjummaa keetiifi tollummaa keetiin garaa laafeessummaa keetiin lammii kee kan ta’anii wajjin akka na lakkoftuuf, ameen naaf haa ta’u.\n" +
            "\n" +
            "Dhiifama kee isaan irratti kan dhangalasite, yeroo dhiphina isaanis kan isaan jaallattee wajjin carra akka nama kennituuf, yaa Gooftaa Iyyesuus Kiristoos sin kadhadha. Anaaf illee fuula kee ijaajjuun, dhiifama kee wajjinis kan waliigalu hojii gaariin koo natti hin mul’attu. Dhiifama keettan amana malee. Hojii gaggaariidhaan kan si tajaajilanifi kan si jaalataniitti kan himte, gammachuu bara baraa arjummaa keettin akka ani ga’u akka na taasistuuf yaa Gooftaa koo kanan xuraa’e. Kanan guraacha’e anaaf dhiifama naa taasisi. Yaa Gooftaa ifa fakkeenyi isa hin dubbatamne keessatti na galchi. Fuula koo isa gurraacha’ees ibidda qalbii jijjiirrannaa isa dhugaadhaan, imimmaan danfeen na dhiqi. Ameen dhufuma naaf haa ta’u!";

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