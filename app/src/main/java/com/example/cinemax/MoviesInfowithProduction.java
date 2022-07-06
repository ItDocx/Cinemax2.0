package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MoviesInfowithProduction extends AppCompatActivity {

    ImageView imageDP,imageCover;
    TextView name,overView,director,producers,production;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_infowith_production);

        imageCover = findViewById(R.id.coverIV);
        imageDP = findViewById(R.id.profileIV);
        name = findViewById(R.id.PersonName_txt);
        overView = findViewById(R.id.OverViewCastChange_txt);
        director = findViewById(R.id.directors_txt_movieInfo);
        producers = findViewById(R.id.producers_txt_movieInfo);
        production = findViewById(R.id.productionCompany);

        Intent intent = getIntent();
        imageCover.setImageResource(intent.getIntExtra("Director_cover",0));
        imageDP.setImageResource(intent.getIntExtra("Director_dp",0));
        director.setText("Director:  "+intent.getStringExtra("Director_name"));
        overView.setText(intent.getStringExtra("Movie_OverView"));
        name.setText(intent.getStringExtra("Movie_Name"));
        producers.setText("Producer:  "+intent.getStringExtra("Producer"));
        production.setText("Production: "+intent.getStringExtra("Production"));





    }
}