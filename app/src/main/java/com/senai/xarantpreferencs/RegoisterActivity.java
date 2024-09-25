package com.senai.xarantpreferencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegoisterActivity extends AppCompatActivity {


    private EditText cadastroNome,cadastroEmail,cadastroSenha;


    private Button btnCadastrar,btnLoginVoltar;

    cadastronome ;
    cadastroEmail ;
    cadastroSenha ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regoister);
    }
}