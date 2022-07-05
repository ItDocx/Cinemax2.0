package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieInfo extends AppCompatActivity {

    //My JSON_LINK
    // https://run.mocky.io/v3/da716521-41cc-4d6d-8074-04934e34187b


    RelativeLayout relativeLayout;
    TextView name,date,rating,duration,genre,directors,producers,cast,discription;

    ImageView RI1,RI2,RI3,poster;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_info);
        relativeLayout = findViewById(R.id.InfoPoster);
        name = findViewById(R.id.Name_txt);
        date = findViewById(R.id.date_txt_change);
        rating= findViewById(R.id.rating_txt);
        duration = findViewById(R.id.duration_txt);
        genre = findViewById(R.id.genres_txt_change);
        directors = findViewById(R.id.directors_txt_change);
        producers = findViewById(R.id.producers_txt_change);
        cast = findViewById(R.id.cast_txt_change);
        discription = findViewById(R.id.description_txt_change);
        poster= findViewById(R.id.posterImage);
        RI1 = findViewById(R.id.relatedIV1);
        RI2 = findViewById(R.id.relatedIV2);
        RI3 = findViewById(R.id.relatedIV3);


        Intent intent = getIntent();


        poster.setImageResource(intent.getIntExtra("Movie_Image",R.color.rating_color));
        name.setText(intent.getStringExtra("Movie_Name"));
        date.setText(intent.getStringExtra("Movie_Date"));
        rating.setText("Rating: "+intent.getStringExtra("Movie_rating"));
        duration.setText("Duration: "+intent.getStringExtra("Movie_Duration"));
        genre.setText(intent.getStringExtra("Movie_Genre"));
        directors.setText(intent.getStringExtra("Movie_Direc"));
        producers.setText(intent.getStringExtra("Movie_Producer"));
        cast.setText(intent.getStringExtra("Movie_Cast"));
        discription.setText(intent.getStringExtra("Movie_Desc"));



        //Calling JSON Array

        try {

            JSONObject jsonObject = new JSONObject(LoadJsonfromAssets());
            JSONArray jsonArray = jsonObject.getJSONArray("Persons");
            HashMap<String,String> list = new HashMap<>();
            ArrayList<HashMap<String,String>> hashArray = new ArrayList<>();
            for (int i = 0; i<jsonArray.length(); i++){
                JSONObject o = jsonArray.getJSONObject(i);
                String actorname = o.getString("");
                String image_path = o.getString("");
                String DOB = o.getString("");
                String Spouse = o.getString("");
                String Rmovies = o.getString("");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    // Loading JSON From Assets

        public String LoadJsonfromAssets(){

        String JSON = null;

        try {

            InputStream input = this.getAssets().open("JSON_Data.json");
            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();
            JSON = new String(buffer,"UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return JSON;

        }

}