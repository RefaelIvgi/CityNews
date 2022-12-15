package com.nowapp.citynews;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ListView;
import android.support.v7.widget.SearchView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements UpdateHelper.OnUpdateCheckListener{

    ListView listView;
    ListViewAdapter adapter;
    String[] title ;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        AdView adView = (AdView) findViewById(R.id.adView);
        MobileAds.initialize(this,"ca-app-pub-6806180347528583~8943230260");
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        UpdateHelper.with(this)
                .onUpdateCheck(this)
                .check();


        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        title = new String[]{ "אופקים","אור יהודה", "אור עקיבא", "אילת", "אלעד", "אריאל", "אשדוד", "אשקלון", "באר יעקב", "באר שבע", "בית שאן", "בית שמש", "ביתר עילית", "בני ברק", "בני עייש", "בת ים", "גבעת ברנר", "גבעת זאב", "גבעת שמואל", "גבעתיים", "גדרה", "גן יבנה", "דימונה", "הוד השרון", "הרצליה", "זכרון יעקב", "חדרה", "חולון", "חיפה", "טבריה", "טירת הכרמל", "יבנה", "יד בנימין", "יהוד", "יקנעם", "ירוחם", "ירושלים", "כפר חבד", "כפר סבא", "כרמיאל", "להבים", "לוד", "מבשרת ציון", "מודיעין", "מזכרת בתיה", "מטולה", "מעלה אדומים", "מצפה רמון", "נהריה", "ניצן", "נס ציונה", "נצרת עילית", "נשר", "נתיבות", "נתניה", "עכו", "עפולה", "פרדס חנה", "פתח תקווה", "קיסריה", "קריית אתא", "קריית ביאליק", "קריית גת", "קריית מוצקין", "קריית מלאכי", "קריית עקרון", "קריית שמונה", "ראש העין", "ראש פינה", "ראשון לציון", "רחובות", "רמלה", "רמת גן", "רמת השרון", "רעננה", "שדרות", "שוהם","תל אביב"};

        description = new String[]{"חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר...","חדש בעיר"};

        icon = new int[]{ R.mipmap.ofakim, R.mipmap.oryehuda, R.mipmap.newakiva,R.mipmap.eilat,R.mipmap.elad,R.mipmap.ariel,R.mipmap.ashdod,R.mipmap.ashkelon,R.mipmap.beeryakov,R.mipmap.beersheva,R.mipmap.betshean,R.mipmap.betshemesh,R.mipmap.betarnew,R.mipmap.bnebrak,R.mipmap.bneaish,R.mipmap.batyam,R.mipmap.brener,R.mipmap.givatzeev,R.mipmap.givatshmuel,R.mipmap.givataim,R.mipmap.gedera,R.mipmap.ganyavne,R.mipmap.dimona,R.mipmap.hodhasharon,R.mipmap.herzelia,R.mipmap.zikronyakovupdate,R.mipmap.hadera,R.mipmap.hulon,R.mipmap.haifa,R.mipmap.tveria,R.mipmap.tirathakarmel,R.mipmap.yavne,R.mipmap.yadbinyamin,R.mipmap.yahudupdate,R.mipmap.yokneam,R.mipmap.yeruham,R.mipmap.yerushalaim,R.mipmap.kfarhabad,R.mipmap.kfarsaba,R.mipmap.karmiel,R.mipmap.leavim,R.mipmap.lud,R.mipmap.mevaseretzion,R.mipmap.modiin,R.mipmap.mazkeretbatia,R.mipmap.metula,R.mipmap.maaleedumim,R.mipmap.mezperamon,R.mipmap.nahariya,R.mipmap.nitzan,R.mipmap.nesziyona,R.mipmap.nazrat,R.mipmap.nesher,R.mipmap.netivot,R.mipmap.natanya,R.mipmap.ako,R.mipmap.afula,R.mipmap.pardeshana,R.mipmap.petahtikva,R.mipmap.kesarya,R.mipmap.ata,R.mipmap.kiryatbialik,R.mipmap.gat,R.mipmap.kiryatmuzkin,R.mipmap.malahi,R.mipmap.ekron,R.mipmap.shmona,R.mipmap.roshhayan,R.mipmap.roshpina,R.mipmap.rishonleziyon,R.mipmap.rehovot,R.mipmap.ramle,R.mipmap.ramatgan,R.mipmap.ramathasharon,R.mipmap.ranana,R.mipmap.sderot,R.mipmap.shoam,R.mipmap.telaviv};


        listView=(ListView) findViewById(R.id.listView);

        for (int i=0;i < title.length;i++){
            Model model = new Model(title[i],description[i],icon[i]);
            arrayList.add(model);
        }

        adapter = new ListViewAdapter(this,arrayList);
        listView.setAdapter(adapter);

    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu ,menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }

                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();



        if (id == R.id.action_settings){
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setIcon(R.mipmap.ic_launcher_foreground)
                    .setTitle("איך המערכת עובדת?")
                    .setMessage("כדי למצוא את העיר שלך - יש ללחוץ על הזכוכית מגדלת." +
                            "ברגע לחיצה על העיר הרצויה המערכת תתחבר לחדשות העיר.")
                    .setPositiveButton("אוקיי הבנתי", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
            return true;
        }

        if (id == R.id.appclick) {
            String url = "https://play.google.com/store/apps/details?id=com.nowapp.news.flashnews";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);

            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onUpdateCheckListener(String urlApp) {

        AlertDialog alertDialog =  new AlertDialog.Builder(this)
                .setTitle("עצור! יש לעדכן גרסא!")
                .setMessage("אנא עדכן כדי לקבל את העדכונים החדשים בכדי להמשיך")
                .setIcon(R.mipmap.ic_launcher_foreground)
                .setPositiveButton("עדכן", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String url2 = "https://play.google.com/store/apps/details?id=com.nowapp.citynews";
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse(url2));
                        startActivity(intent2);
                    }
                }).show();

    }
}
