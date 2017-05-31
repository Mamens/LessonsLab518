package com.alash.lessons;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ListView lvMain;
    Button main_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMain = (ListView) findViewById(R.id.lvMain);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this,
                                    Main2.class);
                            startActivity(intent);
                        }
                        if (position == 1) {
                            Intent intent = new Intent(MainActivity.this,
                                    Main2.class);
                            startActivity(intent);
                        }
                        if (position == 2) {
                            Intent intent = new Intent(MainActivity.this,
                                    Main2.class);
                            startActivity(intent);
                        }
                        if (position == 3) {
                            Intent intent = new Intent(MainActivity.this,
                                    Main2.class);
                            startActivity(intent);
                        }
                    }
                };
        ListView listView = (ListView) findViewById(R.id.lvMain);
        listView.setOnItemClickListener(itemClickListener);

        main_btn = (Button) findViewById(R.id.main_btn);
        main_btn.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_btn:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
        }
    }
}