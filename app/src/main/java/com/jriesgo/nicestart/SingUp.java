package com.jriesgo.nicestart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SingUp extends AppCompatActivity {
    public Button btnRegistrar;
    public Button btnOpen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sing_up);

        btnRegistrar = findViewById(R.id.button1);
        btnOpen = findViewById(R.id.button2);

        btnRegistrar.setOnClickListener(v ->{
            Intent intent = new Intent(SingUp.this, MainLogin.class);
            startActivity(intent);
        });
        btnRegistrar.setOnClickListener(v -> {
            Intent intent = new Intent(SingUp.this, MainVista.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}