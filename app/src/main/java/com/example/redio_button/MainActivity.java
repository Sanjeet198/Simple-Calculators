package com.example.redio_button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText edtno1, edtno2;
    private Button add, sub, multi, div;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.teal_200));

    //    getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.teal_200));

        edtno1 = (EditText) findViewById(R.id.edtno1);
        edtno2 = (EditText) findViewById(R.id.edtno2);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        multi = (Button) findViewById(R.id.multi);
        div = (Button) findViewById(R.id.div);
        txt = (TextView) findViewById(R.id.txt);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,a;
                f= Integer.parseInt(edtno1.getText().toString());
                s= Integer.parseInt(edtno2.getText().toString());
                a=f+s;
                txt.setText("Results=" +a);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,a;
                f= Integer.parseInt(edtno1.getText().toString());
                s= Integer.parseInt(edtno2.getText().toString());
                a=f-s;
                txt.setText("Results=" +a);

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,a;
                f= Integer.parseInt(edtno1.getText().toString());
                s= Integer.parseInt(edtno2.getText().toString());
                a=f*s;
                txt.setText("Results=" +a);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,a;
                f= Integer.parseInt(edtno1.getText().toString());
                s= Integer.parseInt(edtno2.getText().toString());
                a=f/s;
                txt.setText("Results=" +a);
            }
        });

    }
}