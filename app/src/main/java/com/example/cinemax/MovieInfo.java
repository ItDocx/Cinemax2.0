package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieInfo extends AppCompatActivity {

    //My JSON_LINK
    // https://run.mocky.io/v3/da716521-41cc-4d6d-8074-04934e34187b

String Production1 = "Legendary Pictures";
String Production2 = "Amblin Entertainment";
String Production4 = "Universal Pictures";
String Production5 = "Lynda Obst Productions";

    RelativeLayout relativeLayout;
    TextView name,date,rating,duration,genre,directors,producers,cast,discription,production;

    ImageView RI1,RI2,RI3,poster;

    String coli = "Colin Trevorrow";
    String chris = "Christopher Nolan";
    String spiel = "Steven Spielberg";

    String frank = "Frank Marshall";
    String patrik = "Patrick Crowley";
    String emma = "Emma Thomas";
    String kathlin = "Kathleen Kennedy";


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_info);
        relativeLayout = findViewById(R.id.InfoPoster);
        name = findViewById(R.id.Name_txt);
        date = findViewById(R.id.date_txt_change);
        rating= findViewById(R.id.rating_txt);
        duration = findViewById(R.id.duration_txt);
        production = findViewById(R.id.production_change_txt);
        directors = findViewById(R.id.directors_txt_change);
        producers = findViewById(R.id.producers_txt_change);
        cast = findViewById(R.id.cast_txt_change);
        genre = findViewById(R.id.genres_txt_change);
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
        production.setText(intent.getStringExtra("Production"));


        // Directors & Producers Conditions

        if (directors.getText().toString().contains(chris)){
          directors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int imageDp = R.drawable.christopher_nolan_dp;
                    int imageCover = R.drawable.christopher_nolan_cover;
                    String Spouse = "Emma thomas";
                    String DOB = "July 30, 1970";
                    String overView = "Christopher Nolan CBE is a British-American film director, producer, and screenwriter. His films have grossed more than US$5 billion worldwide, and have garnered 11 Academy Awards from 36 nominations. Born and raised in London, Nolan developed an interest in filmmaking from a young age";
                    Intent intent1 = new Intent(MovieInfo.this, CastInfo.class);
                    intent1.putExtra("Director_name", chris);
                    intent1.putExtra("Director_dp", imageDp);
                    intent1.putExtra("Director_cover", imageCover);
                    intent1.putExtra("Director_spouse", Spouse);
                    intent1.putExtra("Director_dob", DOB);
                    intent1.putExtra("Director_overView", overView);
                    startActivity(intent1);
                }
            });
        }
        else if (directors.getText().toString().contains(coli))
        {
            directors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
            int imageDp = R.drawable.colin_trevorrow_dp;
            int imageCover = R.drawable.colin_trevorrow_cover;
            String Spouse = "Isabelle Trevorrow";
            String DOB = "September 13, 1976";
            String overView = "Colin Trevorrow is an American filmmaker. He made his feature directorial debut with the science fiction comedy Safety Not Guaranteed to critical and commercial success";
            Intent intent2 = new Intent(MovieInfo.this, CastInfo.class);
            intent2.putExtra("Director_name", coli);
            intent2.putExtra("Director_dp", imageDp);
            intent2.putExtra("Director_cover", imageCover);
            intent2.putExtra("Director_spouse", Spouse);
            intent2.putExtra("Director_dob", DOB);
            intent2.putExtra("Director_overView", overView);
            startActivity(intent2);
                }
            });
        }
        else if (directors.getText().toString().contains(spiel)) {
            directors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int imageDp = R.drawable.steven_spielberg_dp;
                    int imageCover = R.drawable.steven_spielberg_cover;
                    String Spouse = "Kate Capshaw (m. 1991), Amy Irving (m. 1985–1989)";
                    String DOB = "December 18, 1946";
                    String overView = "Steven Allan Spielberg is an American film director, producer, and screenwriter. A figure of the New Hollywood era, he is the most commercially successful director of all time.";
                    Intent intent2 = new Intent(MovieInfo.this, CastInfo.class);
                    intent2.putExtra("Director_name", spiel);
                    intent2.putExtra("Director_dp", imageDp);
                    intent2.putExtra("Director_cover", imageCover);
                    intent2.putExtra("Director_spouse", Spouse);
                    intent2.putExtra("Director_dob", DOB);
                    intent2.putExtra("Director_overView", overView);
                    startActivity(intent2);
                }
            });

        }

        if (producers.getText().toString().contains(frank)){

            producers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int imageDp = R.drawable.frank_dp;
                    int imageCover = R.drawable.frank_cover;
                    String Spouse = "Kathleen Kennedy";
                    String DOB = "September 13, 1946";
                    String overView = "Frank Wilton Marshall is an American film producer and director. He often collaborates with his wife, film producer Kathleen Kennedy. With Kennedy and Steven Spielberg, he was one of the founders of Amblin Entertainment.";
                    String production ="Lucas Film";
                    Intent intent3 = new Intent(MovieInfo.this,CastInfo.class);
                    intent3.putExtra("Director_name", frank);
                    intent3.putExtra("Director_dp", imageDp);
                    intent3.putExtra("Director_cover", imageCover);
                    intent3.putExtra("Director_spouse", Spouse);
                    intent3.putExtra("Director_dob", DOB);
                    intent3.putExtra("Director_overView", overView);

                    startActivity(intent3);
                }
            });
        }

        else if (producers.getText().toString().contains(emma)){

            producers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int imageDp = R.drawable.emma_thomas_dp;
                    int imageCover = R.drawable.emma_thomas_dp_cover;
                    String Spouse = "Christopher Nolan";
                    String DOB = "December 9, 1971";
                    String overView = "Emma Thomas Nolan is an English film producer, known for frequent collaborations with her husband, the filmmaker Christopher Nolan. Her producing credits include The Dark Knight Trilogy, The Prestige, Inception, Interstellar, Dunkirk and Tenet.";
                    String production ="Not Specified";
                    Intent intent3 = new Intent(MovieInfo.this,CastInfo.class);
                    intent3.putExtra("Director_name", patrik);
                    intent3.putExtra("Director_dp", imageDp);
                    intent3.putExtra("Director_cover", imageCover);
                    intent3.putExtra("Director_spouse", Spouse);
                    intent3.putExtra("Director_dob", DOB);
                    intent3.putExtra("Director_overView", overView);

                    startActivity(intent3);

                }
            });

        }
        else if (producers.getText().toString().contains(kathlin)){

            producers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int imageDp = R.drawable.kathleen_kennedy_dp;
                    int imageCover = R.drawable.kathleen_kennedy_cover;
                    String Spouse = "Frank Marshall";
                    String DOB = "June 5, 1953";
                    String overView = "Kathleen Kennedy is an American film producer and current president of Lucasfilm. In 1981, she co-founded the production company Amblin Entertainment with Steven Spielberg and her husband Frank Marshall. Her first film as a producer was E.T. the Extra-Terrestrial.";
                    String production ="Lucas Film";
                    Intent intent3 = new Intent(MovieInfo.this,CastInfo.class);
                    intent3.putExtra("Director_name", patrik);
                    intent3.putExtra("Director_dp", imageDp);
                    intent3.putExtra("Director_cover", imageCover);
                    intent3.putExtra("Director_spouse", Spouse);
                    intent3.putExtra("Director_dob", DOB);
                    intent3.putExtra("Director_overView", overView);

                    startActivity(intent3);

                }
            });
        }

        // Production Companies Listener

        if (production.getText().toString().contains(Production1)){

            production.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String name = "Legendary Pictures";
                    int cover = R.drawable.legendary_cover;
                    int dp = R.drawable.legend_dp;
                    String producers = "Emma Thommas";
                    String directors = "Christopher Nolan";
                    String overView = "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.";
                    String production = "Paramount Pictures";

                    Intent intent1 = new Intent(MovieInfo.this,MoviesInfowithProduction.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_name",directors);
                    intent1.putExtra("Producer",producers);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Movie_OverView",overView);
                    intent1.putExtra("Production",production);

                    startActivity(intent1);


                }
            });
        }

        if (production.getText().toString().contains(Production2)){

            production.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = "Amblin Entertainment";
                    int cover = R.drawable.ambin_cover;
                    int dp = R.drawable.amblin_dp;
                    String producers = "Emma Thommas";
                    String directors = "Christopher Nolan";
                    String overView = "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.";
                    String production = "Paramount Pictures";

                    Intent intent1 = new Intent(MovieInfo.this,MoviesInfowithProduction.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_name",directors);
                    intent1.putExtra("Producer",producers);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Movie_OverView",overView);
                    intent1.putExtra("Production",production);

                    startActivity(intent1);

                }
            });
        }


        if (production.getText().toString().contains(Production4)){

            production.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = "Universal Pictures";
                    int cover = R.drawable.universal_cover;
                    int dp = R.drawable.universal_dp;
                    String producers = "Emma Thommas";
                    String directors = "Christopher Nolan";
                    String overView = "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.";
                    String production = "Universal Pictures";

                    Intent intent1 = new Intent(MovieInfo.this,MoviesInfowithProduction.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_name",directors);
                    intent1.putExtra("Producer",producers);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Movie_OverView",overView);
                    intent1.putExtra("Production",production);

                    startActivity(intent1);

                }
            });
        }

        if (production.getText().toString().contains(Production5))
        {
            production.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String name = "Lynda Obst Production";
                    int cover = R.drawable.lynda_cover;
                    int dp = R.drawable.lynda_dp;
                    String producers = "Emma Thommas";
                    String directors = "Christopher Nolan";
                    String overView = "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.";
                    String production = "Lynda Obst Production";

                    Intent intent1 = new Intent(MovieInfo.this,MoviesInfowithProduction.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_name",directors);
                    intent1.putExtra("Producer",producers);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Movie_OverView",overView);
                    intent1.putExtra("Production",production);

                    startActivity(intent1);



                }
            });

        }


        // Images Click Listeners

        RI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName = "Interstellar";
                int image_dp = R.drawable.interstellar_dp;
                int image_cover = R.drawable.interstellar_cover;
                String producers = "Emma Thommas";
                String directors = "Christopher Nolan";
                String overView = "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.";
                String production = "Paramount Pictures";

                Intent intent1 = new Intent(MovieInfo.this,MoviesInfowithProduction.class);
                intent1.putExtra("Director_dp",image_dp);
                intent1.putExtra("Director_cover",image_cover);
                intent1.putExtra("Director_name",directors);
                intent1.putExtra("Producer",producers);
                intent1.putExtra("Movie_Name",movieName);
                intent1.putExtra("Movie_OverView",overView);
                intent1.putExtra("Production",production);

                startActivity(intent1);



            }
        });


        RI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName = "Inception";
                int image_dp = R.drawable.inception_dp;
                int image_cover = R.drawable.inception_poster;
                String producers = "Emma Thommas";
                String directors = "Christopher Nolan";
                String production = " Warner Bros. Pictures";
                String overView = "Cobb steals information from his targets by entering their dreams. Saito offers to wipe clean Cobb's criminal history as payment for performing an inception on his sick competitor's son.";

                Intent intent1 = new Intent(MovieInfo.this,MoviesInfowithProduction.class);
                intent1.putExtra("Director_dp",image_dp);
                intent1.putExtra("Director_cover",image_cover);
                intent1.putExtra("Director_name",directors);
                intent1.putExtra("Producer",producers);
                intent1.putExtra("Movie_Name",movieName);
                intent1.putExtra("Movie_OverView",overView);
                intent1.putExtra("Production",production);


                startActivity(intent1);



            }
        });

        RI3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName = "The Dark Knight Rises";
                int image_dp = R.drawable.the_dark_knight_dp;
                int image_cover = R.drawable.the_dark_knight_cover;
                String producers = "Emma Thommas";
                String directors = "Christopher Nolan";
                String overView = "  Cobb steals information from his targets by entering their dreams. Saito offers to wipe clean Cobb's criminal history as payment for performing an inception on his sick competitor's son.";
                String production = "Legendary Pictures, Syncopy Inc.";


                Intent intent1 = new Intent(MovieInfo.this,MoviesInfowithProduction.class);
                intent1.putExtra("Director_dp",image_dp);
                intent1.putExtra("Director_cover",image_cover);
                intent1.putExtra("Director_name",directors);
                intent1.putExtra("Producer",producers);
                intent1.putExtra("Movie_Name",movieName);
                intent1.putExtra("Movie_OverView",overView);
                intent1.putExtra("Production",production);

                startActivity(intent1);



            }
        });





        //Calling JSON Array
/*
        try {

            JSONObject jsonObject = new JSONObject(LoadJsonfromAssets());
            JSONArray jsonArray = jsonObject.getJSONArray("Persons");
            HashMap<String,String> list;
            ArrayList<HashMap<String,String>> hashArray = new ArrayList<>();
            for (int i = 0; i<jsonArray.length(); i++){
                JSONObject o = jsonArray.getJSONObject(i);
                String directorname = o.getString("Name");
                String image_pathdp = o.getString("ImageDP");
                String image_pathcover = o.getString("ImageCover");
                String DOB = o.getString("DOB");
                String Spouse = o.getString("Spouse");
                String Rmovies = o.getString("RMovie_Image1");
                list = new HashMap<>();
                list.put("Name",directorname);
                list.put("ImageDP",image_pathdp);
                list.put("ImageCover",image_pathcover);
                list.put("DOB",DOB);
                list.put("Spouse",Spouse);
                list.put("RMovie_Image1",Rmovies);
            }

            ListAdapter adapter = new SimpleAdapter(this,hashArray,R.layout.d_p_c_items,new String[]{"Name","ImageDP",
                    "ImageCover","DOB","Spouse","RMovie_Image1"},new int[]{R.id.directorsInfo_txt,R.id.directorDpIV,R.id.directorCoverIV,
                    R.id.directorDOB_txt,R.id.directorSpouse_txt,R.id.directorRMovieIV});

            listView.setAdapter(adapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }

     /*   try {

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
                                                                                    */

    // Loading JSON From Assets
/*
        public String LoadJsonfromAssets(){

        String JSON;

        try {

            InputStream input = this.getAssets().open("JSON_Movie_Data.json");
            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();
            JSON = new String(buffer, StandardCharsets.UTF_8);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return JSON;
                                                                        */

    }

}