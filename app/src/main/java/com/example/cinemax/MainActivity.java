package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ImageSlider imageSlider;

ImageView TDKR,JWD,INCEPTION,JP,INTERSTELLAR;
LinearLayout layout;

TextView TDKR_name, TDKR_date;
TextView JWD_name, JWD_date;
TextView Inception_name, Inception_date;
TextView JP_name, JP_date;
TextView Interstellar_name, Interstellar_date;

NestedScrollView nestedScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nestedScrollView = findViewById(R.id.scroll);
        TDKR = findViewById(R.id.tdkr_img);
        JWD = findViewById(R.id.jwd_img);
        INCEPTION = findViewById(R.id.inception_img);
        JP = findViewById(R.id.jp_img);
        INTERSTELLAR = findViewById(R.id.Interstellar_img);

        TDKR_name = findViewById(R.id.tdkr_txt);
        JWD_name = findViewById(R.id.jwd_txt);
        Inception_name = findViewById(R.id.Inception_txt);
        JP_name = findViewById(R.id.jp_txt);
        Interstellar_name = findViewById(R.id.Interstellar_txt);
        TDKR_date = findViewById(R.id.tdkr_date_txt);
        JWD_date = findViewById(R.id.jwd_date_txt);
        Inception_date = findViewById(R.id.inception_date_txt);
        JP_date = findViewById(R.id.jp_date_txt);
        Interstellar_date = findViewById(R.id.Interstellar_date_txt);




       // Image Slider start
         imageSlider = findViewById(R.id.image_slider);

        // Create image list
        ArrayList<SlideModel> imageList = new ArrayList<>();
// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title
        imageList.add(new SlideModel(R.drawable.the_dark_knight_cover, "The Dark Knight Rises", ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.jurassic_world_cover, "Jurassic World",ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.inception_poster,"Inception", ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.jurassic_park_cover, "Jurassic Park",ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.interstellar_cover, "Interstellar",ScaleTypes.FIT));

                imageSlider.setImageList(imageList);

                // Image Slider End


        //Movie Click Listeners
        TDKR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int img= R.drawable.the_dark_knight_cover;
                String rating = "8.4";
                String duration = "2:10:00";
                String director = "Christopher Nolan";
                String name = "The Dark Knight Rises";
                String producer = "Emma Thomas";
                String production = "Legendary Pictures";
                String date = "August 20, 2012";
                String genre = "Action,Thriller";
                String description = "Bane, an imposing terrorist, attacks Gotham City and disrupts its eight-year-long period of peace. This forces Bruce Wayne to come out of hiding and don the cape and cowl of Batman again";
                String cast1 = "Christian Bale";
                String cast2 = "Jeff Goldblum";
                String cast3 = "Leonardo DiCaprio";


                Intent intent = new Intent(MainActivity.this,MovieInfo.class);
                intent.putExtra("Movie_name",name);
                intent.putExtra("rating",rating);
                intent.putExtra("duration",duration);
                intent.putExtra("director",director);
                intent.putExtra("producer",producer);
                intent.putExtra("genre",genre);
                intent.putExtra("description",description);
                intent.putExtra("cast1",cast1);
                intent.putExtra("cast2",cast2);
                intent.putExtra("cast3",cast3);
                intent.putExtra("date",date);
                intent.putExtra("production",production);
                intent.putExtra("image",img);
                startActivity(intent);





            }
        });

        JWD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int img= R.drawable.jurassic_world_dp;
                String rating = "5.9";
                String duration = "1:49:00";
                String director = "Colin Trevorrow";
                String name = "Jurassic World Dominion";
                String producer = "Frank Marshall";
                String production = "Amblin Entertainment";
                String date = "June 10, 2022";
                String genre = "Scifi,Action";
                String description = "Four years after the destruction of Isla Nublar, dinosaurs now live and hunt alongside humans all over the world. This fragile balance will reshape the future and determine, once and for all";
                String cast1 = "Ariana Richards";
                String cast2 = "Jeff Goldblum";
                String cast3 = "Ken Watanabe";


                Intent intent = new Intent(MainActivity.this,MovieInfo.class);
                intent.putExtra("Movie_name",name);
                intent.putExtra("rating",rating);
                intent.putExtra("duration",duration);
                intent.putExtra("director",director);
                intent.putExtra("producer",producer);
                intent.putExtra("genre",genre);
                intent.putExtra("description",description);
                intent.putExtra("cast1",cast1);
                intent.putExtra("cast2",cast2);
                intent.putExtra("cast3",cast3);
                intent.putExtra("date",date);
                intent.putExtra("production",production);
                intent.putExtra("image",img);
                startActivity(intent);





            }
        });



        INCEPTION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int img= R.drawable.inception_poster;
                String rating = "8.8";
                String duration = "2:28:00";
                String director = "Christopher Nolan";
                String name = "Inception";
                String producer = "Emma Thomas";
                String production = "Legendary Pictures";
                String date = "September 11, 2010";
                String genre = "Action,Scifi";
                String description = "Cobb steals information from his targets by entering their dreams. Saito offers to wipe clean Cobb's criminal history as payment for performing an inception on his sick competitor's son";
                String cast1 = "Christian Bale";
                String cast2 = "Ken Watanabe";
                String cast3 = "Leonardo DiCaprio";


                Intent intent = new Intent(MainActivity.this,MovieInfo.class);
                intent.putExtra("Movie_name",name);
                intent.putExtra("rating",rating);
                intent.putExtra("duration",duration);
                intent.putExtra("director",director);
                intent.putExtra("producer",producer);
                intent.putExtra("genre",genre);
                intent.putExtra("description",description);
                intent.putExtra("cast1",cast1);
                intent.putExtra("cast2",cast2);
                intent.putExtra("cast3",cast3);
                intent.putExtra("date",date);
                intent.putExtra("production",production);
                intent.putExtra("image",img);
                startActivity(intent);





            }
        });


        JP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int img= R.drawable.jurassic_park_cover;
                String rating = "8.2";
                String duration = "2:05:00";
                String director = "Steven Spielberg";
                String name = "Jurassic Park";
                String producer = "Kathleen Kennedy";
                String production = "Universal Pictures";
                String date = "April 12, 2013";
                String genre = "Scifi,Action";
                String description = "John Hammond, an entrepreneur, opens a wildlife park containing cloned dinosaurs. However, a breakdown of the island's security system causes the creatures to escape and bring about chaos";
                String cast1 = "Laura Dern";
                String cast2 = "Jeff Goldblum";
                String cast3 = "Chris Pratt";



                Intent intent = new Intent(MainActivity.this,MovieInfo.class);
                intent.putExtra("Movie_name",name);
                intent.putExtra("rating",rating);
                intent.putExtra("duration",duration);
                intent.putExtra("director",director);
                intent.putExtra("producer",producer);
                intent.putExtra("genre",genre);
                intent.putExtra("description",description);
                intent.putExtra("cast1",cast1);
                intent.putExtra("cast2",cast2);
                intent.putExtra("cast3",cast3);
                intent.putExtra("date",date);
                intent.putExtra("production",production);
                intent.putExtra("image",img);
                startActivity(intent);





            }
        });


        INTERSTELLAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int img= R.drawable.interstellar_cover;
                String rating = "8.6";
                String duration = "2:49:00";
                String director = "Christopher Nolan";
                String name = "Interstellar";
                String producer = "Emma Thomas";
                String production = "Lynda Obst Productions";
                String date = "October 26, 2014";
                String genre = "Scifi,Adventure";
                String description = "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans";
                String cast1 = "Christian Bale";
                String cast2 = "Ken Watanabe";
                String cast3 = "Leonardo DiCaprio";


                Intent intent = new Intent(MainActivity.this,MovieInfo.class);
                intent.putExtra("Movie_name",name);
                intent.putExtra("rating",rating);
                intent.putExtra("duration",duration);
                intent.putExtra("director",director);
                intent.putExtra("producer",producer);
                intent.putExtra("genre",genre);
                intent.putExtra("description",description);
                intent.putExtra("cast1",cast1);
                intent.putExtra("cast2",cast2);
                intent.putExtra("cast3",cast3);
                intent.putExtra("date",date);
                intent.putExtra("production",production);
                intent.putExtra("image",img);
                startActivity(intent);





            }
        });




    }

}