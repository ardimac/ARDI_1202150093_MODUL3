package com.example.airys.ardi_1202150093_modul3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.airys.ardi_1202150093_modul3.MAIN.ReyclerView;


public class login extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    String username1;
    Bundle a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.edUser);
        password = (EditText) findViewById(R.id.edPass);
        btnLogin = (Button) findViewById(R.id.id_login);
    }

    public void login(View view) {
        String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();

        username1 = username.getText().toString();

        if (usernameKey.equals("EAD") && passwordKey.equals("MOBILE") || usernameKey.equals("ardi") && passwordKey.equals("basmalah")){

            Toast.makeText(this,"Anda berhasil login",Toast.LENGTH_LONG).show();

            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setTitle("Alert Message");

            alert.setMessage("Login Success")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            Intent intent = new Intent(login.this, ReyclerView.class);
                            a = new Bundle();
                            a.putString("parse_username", username1);
                            intent.putExtras(a);
                            login.this.startActivity(intent);
                        }
                    });

            AlertDialog alertDialog = alert.create();

            alertDialog.show();

        }else{
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setTitle("Salah bro");

            alert.setMessage("Login Failed")
                    .setCancelable(false)
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });

            AlertDialog alertDialog = alert.create();

            alertDialog.show();


        }

    }

    public void logout(View view) {
    }
}
