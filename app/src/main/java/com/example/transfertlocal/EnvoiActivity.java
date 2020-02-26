package com.example.transfertlocal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnvoiActivity<cni2, cni3> extends AppCompatActivity {

    private Object EditText;

    public void Envoyer(View view){

        EditText = (EditText) findViewById(R.id.cni2);
        String str = ((android.widget.EditText) EditText).getText().toString();
        int nbLettre = str.length();
        
        Intent intent = new Intent(this, ConfirmEnvoiActivity.class);
        intent.putExtra("edittext", str);
        //intent.putExtra("nbLettre", nbLettre);
        startActivity(intent);
        
    }

    private void startActivity(Intent intent) {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envoi);


    }


}
