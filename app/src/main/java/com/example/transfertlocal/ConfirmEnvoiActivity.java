package com.example.transfertlocal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmEnvoiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_envoi);

        Intent intent = getIntent();
        if(intent != null){
            String str="";
            if(intent.hasExtra("edittext")){
                str = intent.getStringExtra("edittext");
            }
            int nbLettre = intent.getIntExtra("nbLettre", 0);
            TextView textView = (TextView) findViewById(R.id.cni2);
            textView.setText(str + "; " + nbLettre);
        }

    }
}
