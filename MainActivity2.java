package com.example.menghitungluasdankelilingpersegipanjang;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Mendapatkan nilai yang dilewatkan dari Intent
        Intent intent = getIntent();
        double panjang = intent.getDoubleExtra("panjang", 0);
        double lebar = intent.getDoubleExtra("lebar", 0);
        double luas = intent.getDoubleExtra("luas", 0);
        double keliling = intent.getDoubleExtra("keliling", 0);

        // Menampilkan nilai di TextView
        TextView panjangTextView = findViewById(R.id.viewPanjang);
        panjangTextView.setText("Panjang: " + panjang);

        TextView lebarTextView = findViewById(R.id.ViewLebar);
        lebarTextView.setText("Lebar: " + lebar);

        TextView luasTextView = findViewById(R.id.HasilLuas);
        luasTextView.setText("Luas: " + luas);

        TextView kelilingTextView = findViewById(R.id.Hasilkeliling);
        kelilingTextView.setText("Keliling: " + keliling);
    }
}
