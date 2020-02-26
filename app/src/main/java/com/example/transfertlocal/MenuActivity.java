package com.example.transfertlocal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button meDeconnecter = (Button) findViewById(R.id.btnSeDeconnecter);
        Button eEnvoyer = (Button) findViewById(R.id.monEnvoi);

        meDeconnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formConnexion();
            }
        });
        eEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formEnvoie();

            }
        });
    }

    private void formEnvoie() {
        Intent intent = new Intent ( this, EnvoiActivity.class);
        startActivity(intent);

    }

    private void formConnexion(){
        Intent intent = new Intent ( this, MainActivity.class);
        startActivity(intent);
    }
}
