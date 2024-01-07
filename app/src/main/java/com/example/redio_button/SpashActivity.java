package com.example.redio_button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class SpashActivity extends AppCompatActivity {

    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);

        //    getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.teal_200));

        getWindow().setStatusBarColor(ContextCompat.getColor(SpashActivity.this,R.color.teal_200));

        SharedPreferences sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);
        userId = sharedPreferences.getString("userId","");
//        Toast.makeText(this, ""+userId, Toast.LENGTH_SHORT).show();


        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {

                    if (userId.equals("")){
                        Intent intent= new Intent(SpashActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        Intent intent= new Intent(SpashActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }


            }
        };thread.start();
    }
}