package com.example.menghitungluasdankelilingpersegipanjang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText panjangEditText;
    private EditText lebarEditText;
    private Button hitungButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjangEditText = findViewById(R.id.Panjang);
        lebarEditText = findViewById(R.id.Lebar);
        hitungButton = findViewById(R.id.button);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan nilai panjang dan lebar
                double panjang = Double.parseDouble(panjangEditText.getText().toString());
                double lebar = Double.parseDouble(lebarEditText.getText().toString());

                // Menghitung luas dan keliling
                double luas = panjang * lebar;
                double keliling = 2 * (panjang + lebar);

                // Pindah ke Activity kedua (Layout 2)
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("panjang", panjang);
                intent.putExtra("lebar", lebar);
                intent.putExtra("luas", luas);
                intent.putExtra("keliling", keliling);
                startActivity(intent);
            }
        });
    }
}
