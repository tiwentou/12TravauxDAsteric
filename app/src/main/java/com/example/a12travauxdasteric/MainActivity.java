package com.example.a12travauxdasteric;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeSexe(View view) {
        Switch switchButton = (Switch) findViewById(R.id.inputChangeSexe);
        Boolean switchState = switchButton.isChecked();
        TextView text = (TextView)findViewById(R.id.sexeText);

        if(switchState){
            text.setText("M");
        }
        else{
            text.setText("F");
        }
    }

    public void hideSignature(View view) {
        CheckBox switchButton = (CheckBox) findViewById(R.id.inputHideSignature);
        Boolean switchState = switchButton.isChecked();
        ImageView signature = (ImageView)findViewById(R.id.signature);

        if(switchState){
            signature.setVisibility(View.INVISIBLE);
        }
        else{
            signature.setVisibility(View.VISIBLE);
        }
    }

    public void Enregistrer(View view) {
        TextView nom = (TextView)findViewById(R.id.nomText);
        TextView prenom = (TextView)findViewById(R.id.prenomText);

        TextView newNom = (TextView)findViewById(R.id.inputLastName_text);
        TextView newPrenom = (TextView)findViewById(R.id.inputFirstName_text);

        nom.setText(newNom.getText());
        prenom.setText(newPrenom.getText());
    }
}
