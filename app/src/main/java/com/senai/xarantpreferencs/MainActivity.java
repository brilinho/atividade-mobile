package com.senai.xarantpreferencs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.SharedPreferencesKt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import com.google.android.material.materialswitch.MaterialSwitch;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    private EditText inputEmail;
    private EditText inputSenha;
    private Button btnLogin;
    private MaterialSwitch materialSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEmail = findViewById(R.id.inputEmail);

        materialSwitch = findViewById(R.id.materialSwitch);

        inputSenha = findViewById(R.id.inputSenha);

        btnLogin = findViewById(R.id.Button);

        sp = getSharedPreferences(getString(R.string.prefs_login), Context.MODE_PRIVATE);

        inputEmail.setText(sp.getString(getString(R.string.prefs_Email), "" ));

        inputSenha.setText(sp.getString(getString(R.string.prefs_pass), ""));

        //capturar o valor armazenado na switch
        materialSwitch.setChecked(sp.getBoolean(getString(R.string.prefs_switch), false));

       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               editor = sp.edit();
               if(materialSwitch.isChecked()){

                   editor.putString(getString(R.string.prefs_Email),inputEmail.getText().toString());
                   editor.putString(getString(R.string.prefs_pass),inputEmail.getText().toString());
                   editor.putBoolean(getString(R.string.prefs_switch), materialSwitch.isChecked());
               }else{
                  editor.remove(getString(R.string.prefs_Email));
                  editor.remove(getString(R.string.prefs_pass));
               }
                editor.apply();

               Intent i = new Intent(MainActivity.this,HomeActivity.class);
               startActivity(i);

               finish(); //finalizar a execução da activiry atual
           }
       });


    }
}