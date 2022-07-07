package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CastInfo extends AppCompatActivity {

    ImageView imageDP,imageCover,RMovie1,RMovie2;
    TextView dob,spouse,name,overView,RMovie1_txt,RMovie2_txt,RMovie1_date_txt,RMovie2_date_txt;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cast_info);
        imageDP = findViewById(R.id.profileIV);
        imageCover = findViewById(R.id.coverIV);
        dob = findViewById(R.id.DOB_txt);
        spouse = findViewById(R.id.Spouse_change_txt);
        name = findViewById(R.id.PersonName_txt);
        overView = findViewById(R.id.OverViewCastChange_txt);
        RMovie1 = findViewById(R.id.Rmovie1_img);
        RMovie2 = findViewById(R.id.RMovie2_img);
        RMovie1_txt = findViewById(R.id.Rmovie1_txt);
        RMovie2_txt = findViewById(R.id.RMovie2_txt);
        RMovie1_date_txt = findViewById(R.id.Rmovie1_date_txt);
        RMovie2_date_txt = findViewById(R.id.RMovie2_date_txt);


        Intent intent = getIntent();

        imageCover.setImageResource(intent.getIntExtra("Director_cover",0));
        imageDP.setImageResource(intent.getIntExtra("Director_dp",0));
        dob.setText("Date of Birth:  "+intent.getStringExtra("Director_dob"));
        spouse.setText(intent.getStringExtra("Director_spouse"));
        name.setText(intent.getStringExtra("Director_name"));
        overView.setText(intent.getStringExtra("Director_overView"));

        //Related Image Parse
        RMovie1.setImageResource(intent.getIntExtra("Rmovie1",0));
        RMovie2.setImageResource(intent.getIntExtra("Rmovie2",0));

        RMovie1_txt.setText(intent.getStringExtra("Rmovie1Name"));
        RMovie2_txt.setText(intent.getStringExtra("Rmovie2Name"));
        RMovie1_date_txt.setText(intent.getStringExtra("Rmovie1Date"));
        RMovie2_date_txt.setText(intent.getStringExtra("Rmovie2Date"));





    }
}