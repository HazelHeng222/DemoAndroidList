package sg.edu.ep.c346.id20029318.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVer;
    ArrayList <AndroidVersion> alAndroidVer;
    ArrayAdapter<AndroidVersion> aaAndroidVer;

    //ArrayAdapter<AndroidVersion> aaAndroidVersions;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVer = findViewById(R.id.lv);
        alAndroidVer = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow", "6.0 - 6.0.1");
        AndroidVersion item5 = new AndroidVersion("Lollipop", "5.0 - 5.1.1");
        AndroidVersion item6 = new AndroidVersion("KitKat", "4.4 - 4.4.4");
        AndroidVersion item7 = new AndroidVersion("Jelly Bean", "4.1 - 4.3.1");

        alAndroidVer.add(item1);
        alAndroidVer.add(item2);
        alAndroidVer.add(item3);
        alAndroidVer.add(item4);
        alAndroidVer.add(item5);
        alAndroidVer.add(item6);
        alAndroidVer.add(item7);


        //aaAndroidVersions = new ArrayAdapter<>(this,
        //android.R.layout.simple_list_item_1, alAndroidVersions);
        adapter = new CustomAdapter(this, R.layout.row, alAndroidVer);


        //lvAndroidVersions.setAdapter(aaAndroidVersions);
        lvAndroidVer.setAdapter(adapter);
    }
}
