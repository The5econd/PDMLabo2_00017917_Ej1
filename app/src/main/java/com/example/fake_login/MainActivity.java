package com.example.fake_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button btn, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.boton_1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txt1 = findViewById(R.id.texto_1);
                String usr;
                TextView mostrar1;
                usr = txt1.getText().toString();

                mostrar1 = findViewById(R.id.texto_3);
                mostrar1.setText(usr);
            }
        });

        btn = findViewById(R.id.boton_1);
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                EditText txt2 = findViewById(R.id.texto_2);
                String psswd;
                psswd = txt2.getText().toString();

                TextView mostrar2;
                mostrar2 = findViewById(R.id.texto_3);
                mostrar2.setText(psswd);

                return true;
            }
        });
    }
}
