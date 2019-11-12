package com.drs.baseadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button bt_listview,bt_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_listview = findViewById(R.id.bt_listview);
        bt_recyclerview=findViewById(R.id.bt_recyclerview);
        onclick();
    }

    private void onclick() {
        bt_listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ListViewActivity.class));
            }
        });
        bt_recyclerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RecyclerViewActivity.class));
            }
        });

    }
}
