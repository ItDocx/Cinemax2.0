package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CastInfo extends AppCompatActivity {

    ImageView imageDP,imageCover;
    TextView dob,spouse,name,overView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cast_info);
        imageDP = findViewById(R.id.profileIV);
        imageCover = findViewById(R.id.coverIV);
        dob = findViewById(R.id.DOB_txt);
        spouse = findViewById(R.id.Spouse_txt);
        name = findViewById(R.id.PersonName_txt);
        overView = findViewById(R.id.OverViewCastChange_txt);

        Intent intent = getIntent();

        imageCover.setImageResource(intent.getIntExtra("Director_cover",0));
        imageDP.setImageResource(intent.getIntExtra("Director_dp",0));
        dob.setText("Date of Birth: "+intent.getStringExtra("Director_dob"));
        spouse.setText("Spouse: "+intent.getStringExtra("Director_spouse"));
        name.setText(intent.getStringExtra("Director_name"));
        overView.setText(intent.getStringExtra("Director_overView"));


    }
}