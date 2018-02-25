package com.example.airys.ardi_1202150093_modul3.MAIN;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.airys.ardi_1202150093_modul3.R;

public class ReyclerView extends AppCompatActivity {

    RecyclerView reyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reycler_view);

        //mengambil dari kelas adapter yang sudah ada holder untuk selanjutnya di tampilkan pada view
        reyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        ReyclerAdapter adapter=new ReyclerAdapter(this,ListMenu.getMenu());
        reyclerView.setAdapter(adapter);
        reyclerView.setHasFixedSize(true);
        reyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
