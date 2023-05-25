package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCam = this.findViewById(R.id.btnCambiar);
        btnCam.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ListaActivity.class);
            startActivity(intent);

        });
    }
}