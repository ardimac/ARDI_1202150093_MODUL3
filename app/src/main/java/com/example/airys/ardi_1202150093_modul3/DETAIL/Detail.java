package com.example.airys.ardi_1202150093_modul3.DETAIL;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.airys.ardi_1202150093_modul3.R;

public class Detail extends AppCompatActivity {

    TextView menu, detailmenu, ukuran;
    ImageView image, battery;
    int angka = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        menu = (TextView) findViewById(R.id.id_detailimage);
        ukuran = (TextView) findViewById(R.id.liter);
        detailmenu = (TextView) findViewById(R.id.id_about);
        image = (ImageView) findViewById(R.id.id_image);
        battery = (ImageView) findViewById(R.id.id_battery);

        //mengambil data yang telah dikirimkan
        Intent i = this.getIntent();
        String menu2 = i.getExtras().getString("nama");
//        String detail = i.getExtras().getString("detail");
        int gambar = i.getExtras().getInt("gambar");


        //menempatkan data yang telah kita ambil pada posisinya
        menu.setText(menu2);
//        detailmenu.setText(detail);
        image.setImageResource(gambar);

    }


        //logic untuk tombol tambah dengan menggunakan handler postdelayed
    public void tambah(View view) {
        angka++;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (angka == 1){
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    ukuran.setText("30 L");
                }else if (angka == 2){
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    ukuran.setText("50 L");
                }else if (angka == 3){
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    ukuran.setText("60 L");
                }else if (angka == 4){
                    battery.setImageResource(R.drawable.ic_battery_80_black_24dp);
                    ukuran.setText("80 L");
                }else if (angka == 5){
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    ukuran.setText("90 L");
                }else if (angka == 6){
                    Toast.makeText(getApplicationContext(),"battery sudah FULL",Toast.LENGTH_LONG).show();
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    ukuran.setText("FULL");
                }

           //jeda setiap klik
            }
        },200);
    }


        //logic untuk tombol kurang dengan menggunakan handler postdelayed
    public void kurang(View view) {
        angka--;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(angka == 5){
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    ukuran.setText("90 L");
                }else if (angka == 4){
                    battery.setImageResource(R.drawable.ic_battery_80_black_24dp);
                    ukuran.setText("80 L");
                }else if (angka == 3){
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    ukuran.setText("60 L");
                }else if (angka == 2){
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    ukuran.setText("50 L");
                }else if (angka == 1){
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    ukuran.setText("30 L");
                }else if (angka == 0){
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    ukuran.setText("20 L");
                }

           //jeda setiap klik
            }
        },200);
    }
}
