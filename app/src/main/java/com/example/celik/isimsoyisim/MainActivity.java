package com.example.celik.isimsoyisim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText isim;
    EditText soyisim;
    TextView sonuc;
    Button gonder;
    int i;

    String ad,soyad,birlestir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isim = (EditText) findViewById(R.id.isim);
        soyisim= (EditText) findViewById(R.id.soyisim);
        sonuc = (TextView) findViewById(R.id.goster);
        gonder = (Button) findViewById(R.id.gonder);

    }

    public void bas(View view) {



        ad = isim.getText().toString();


        soyad = soyisim.getText().toString();

        birlestir = ad  + soyad ;
        sonuc.setText(birlestir);
        for (i=0; i<birlestir.length(); i++){

            sonuc.setText(sonuc.getText() + "\n" + birlestir.substring(i, i + 1));
        }
    }
}
