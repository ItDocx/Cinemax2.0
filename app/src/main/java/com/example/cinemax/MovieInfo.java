package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MovieInfo extends AppCompatActivity {

    //My JSON_LINK
    // https://run.mocky.io/v3/da716521-41cc-4d6d-8074-04934e34187b

String Production1 = "Legendary Pictures";
String Production2 = "Amblin Entertainment";
String Production4 = "Universal Pictures";
String Production5 = "Lynda Obst Productions";


String jeff = "Jeff Goldblum";
String chritian = "Christian Bale";
String leonardo = "Leonardo DiCaprio";
String ariana = "Ariana Richards";
String chriss = "Chris Pratt";
String dern = "Laura Dern";
String ken = "Ken Watanabe";


    RelativeLayout relativeLayout;
    TextView name,date,rating,duration,genre,directors,producers,cast1,cast2,cast3,cast4,cast5,discription,production;

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
        cast1 = findViewById(R.id.cast1_txt_change);
        cast2 = findViewById(R.id.cast2_txt_change);
        cast3 = findViewById(R.id.cast3_txt_change);
        cast4 = findViewById(R.id.cast4_txt_change);
        cast5 = findViewById(R.id.cast5_txt_change);
        genre = findViewById(R.id.genres_txt_change);
        discription = findViewById(R.id.description_txt_change);
        poster= findViewById(R.id.posterImage);
        RI1 = findViewById(R.id.relatedIV1);
        RI2 = findViewById(R.id.relatedIV2);
        RI3 = findViewById(R.id.relatedIV3);


        Intent intent = getIntent();


        poster.setImageResource(intent.getIntExtra("image",R.color.rating_color));
        name.setText(intent.getStringExtra("Movie_name"));
        date.setText(intent.getStringExtra("date"));
        rating.setText("Rating: "+intent.getStringExtra("rating"));
        duration.setText("Duration: "+intent.getStringExtra("duration"));
        genre.setText(intent.getStringExtra("genre"));
        directors.setText(intent.getStringExtra("director"));
        producers.setText(intent.getStringExtra("producer"));
        cast1.setText(intent.getStringExtra("cast1"));
        cast1.setVisibility(View.VISIBLE);
        cast2.setText(intent.getStringExtra("cast2"));
        cast2.setVisibility(View.VISIBLE);
        cast3.setText(intent.getStringExtra("cast3"));
        cast3.setVisibility(View.VISIBLE);
        discription.setText(intent.getStringExtra("description"));
        production.setText(intent.getStringExtra("production"));


        // Directors & Producers Conditions

        if (directors.getText().toString().contains(chris)){
          directors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int imageDp = R.drawable.christopher_nolan_dp;
                    int imageCover = R.drawable.christopher_nolan_cover;

                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.the_dark_knight_dp;
                    rmovie2 = R.drawable.inception_dp;


                    String RMovie1Name = "The Dark Knight Rises";
                    String RMovie2Name = "Inception";
                    String RMovie1date = "Aug 20, 2012";
                    String RMovie2date = "Sep 11, 2010";


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
                    intent1.putExtra("Rmovie1",rmovie1);
                    intent1.putExtra("Rmovie2",rmovie2);
                    intent1.putExtra("Rmovie1Name",RMovie1Name);
                    intent1.putExtra("Rmovie2Name",RMovie2Name);
                    intent1.putExtra("Rmovie1Date",RMovie1date);
                    intent1.putExtra("Rmovie2Date",RMovie2date);

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
                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.jurassic_world_dp;
                    rmovie2 = R.drawable.jurassic_park_dp;

                    String RMovie1Name = "Jurassic World Dominion";
                    String RMovie2Name = "Jurassic Park";
                    String RMovie1date = "Jun 10, 2022";
                    String RMovie2date = "Apr 12, 2013";

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
                    intent2.putExtra("Rmovie1",rmovie1);
                    intent2.putExtra("Rmovie2",rmovie2);
                    intent2.putExtra("Rmovie1Name",RMovie1Name);
                    intent2.putExtra("Rmovie2Name",RMovie2Name);
                    intent2.putExtra("Rmovie1Date",RMovie1date);
                    intent2.putExtra("Rmovie2Date",RMovie2date);

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

                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.jurassic_park_dp;
                    rmovie2 = R.drawable.jurassic_world_dp;

                    String RMovie2Name = "Jurassic World Dominion";
                    String RMovie1Name = "Jurassic Park";
                    String RMovie2date = "Jun 10, 2022";
                    String RMovie1date = "Apr 12, 2013";


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
                    intent2.putExtra("Rmovie1",rmovie1);
                    intent2.putExtra("Rmovie2",rmovie2);
                    intent2.putExtra("Rmovie1Name",RMovie1Name);
                    intent2.putExtra("Rmovie2Name",RMovie2Name);
                    intent2.putExtra("Rmovie1Date",RMovie1date);
                    intent2.putExtra("Rmovie2Date",RMovie2date);

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

                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.jurassic_park_dp;
                    rmovie2 = R.drawable.jurassic_world_dp;

                    String RMovie2Name = "Jurassic World Dominion";
                    String RMovie1Name = "Jurassic Park";
                    String RMovie2date = "Jun 10, 2022";
                    String RMovie1date = "Apr 12, 2013";

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
                    intent3.putExtra("Rmovie1",rmovie1);
                    intent3.putExtra("Rmovie2",rmovie2);
                    intent3.putExtra("Rmovie1Name",RMovie1Name);
                    intent3.putExtra("Rmovie2Name",RMovie2Name);
                    intent3.putExtra("Rmovie1Date",RMovie1date);
                    intent3.putExtra("Rmovie2Date",RMovie2date);


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

                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.inception_dp;
                    rmovie2 = R.drawable.interstellar_dp;

                    String RMovie1Name = "Inception";
                    String RMovie2Name = "Interstellar";
                    String RMovie1date = "Sep 11, 2010";
                    String RMovie2date = "Oct 26, 2014";

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
                    intent3.putExtra("Rmovie1",rmovie1);
                    intent3.putExtra("Rmovie2",rmovie2);
                    intent3.putExtra("Rmovie1Name",RMovie1Name);
                    intent3.putExtra("Rmovie2Name",RMovie2Name);
                    intent3.putExtra("Rmovie1Date",RMovie1date);
                    intent3.putExtra("Rmovie2Date",RMovie2date);


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

                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.jurassic_park_dp;
                    rmovie2 = R.drawable.jurassic_world_dp;

                    String RMovie2Name = "Jurassic World Dominion";
                    String RMovie1Name = "Jurassic Park";
                    String RMovie2date = "Jun 10, 2022";
                    String RMovie1date = "Apr 12, 2013";

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

                    intent3.putExtra("Rmovie1",rmovie1);
                    intent3.putExtra("Rmovie2",rmovie2);
                    intent3.putExtra("Rmovie1Name",RMovie1Name);
                    intent3.putExtra("Rmovie2Name",RMovie2Name);
                    intent3.putExtra("Rmovie1Date",RMovie1date);
                    intent3.putExtra("Rmovie2Date",RMovie2date);

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
                    int cover = R.drawable.legend_dp;
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



        // Cast Listeners


        if (cast1.getText().toString().contains(chritian)) {
            cast1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// RMovies
                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.inception_dp;
                    rmovie2 = R.drawable.the_dark_knight_dp;

                    String name = chritian;
                    int cover = R.drawable.christian_bale_cover;
                    int dp = R.drawable.christian_bale_dp;
                    String Spouse = " Sibi Blažić";
                    String DOB = "Jan 30, 1974 ";
                    String overView = "Christian Charles Philip Bale is an English actor. Known for his versatility and recurring physical transformations to play his roles, he has been a leading man in films of several genres. Bale is the recipient of various accolades, including an Academy Award and two Golden Globe Awards.";
                    String production = "Lynda Obst Production";

                    String RMovie1Name = "The Dark Knight Rises";
                    String RMovie2Name = "Interstellar";
                    String RMovie1date = "Aug 20, 2012";
                    String RMovie2date = "Oct 26, 2014";



                    Intent intent1 = new Intent(MovieInfo.this,CastInfo.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_spouse",Spouse);
                    intent1.putExtra("Director_dob",DOB);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Director_overView",overView);
                    intent1.putExtra("Production",production);

                    //Image parse
                    intent1.putExtra("Rmovie1",rmovie1);
                    intent1.putExtra("Rmovie2",rmovie2);
                    intent1.putExtra("Rmovie1Name",RMovie1Name);
                    intent1.putExtra("Rmovie2Name",RMovie2Name);
                    intent1.putExtra("Rmovie1Date",RMovie1date);
                    intent1.putExtra("Rmovie2Date",RMovie2date);


                    startActivity(intent1);



                }
            });
        }

        if (cast1.getText().toString().contains(ariana)) {
            cast1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// RMovies
                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.jurassic_world_dp;
                    rmovie2 = R.drawable.jurassic_park_dp;

                    String name = ariana;
                    int cover = R.drawable.ariana_richards_cover;
                    int dp = R.drawable.ariana_richards_dp;
                    String Spouse = "Mark Aaron Bolton";
                    String DOB = "Sep 11, 1979";
                    String overView = "Ariana Clarice Richards is an American painter and former actress. She is best known for her role as Lex Murphy in the blockbuster film Jurassic Park. Richards won several Young Artist Awards for her acting as a child, but as an adult has focused primarily on her art career.";
                    String production = "Amblin Entertainment";

                    String RMovie1Name = "Jurassic World";
                    String RMovie2Name = "Jurassic Park";
                    String RMovie1date = "June 10, 2022";
                    String RMovie2date = "April 12, 2013";



                    Intent intent1 = new Intent(MovieInfo.this,CastInfo.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_spouse",Spouse);
                    intent1.putExtra("Director_dob",DOB);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Director_overView",overView);
                    intent1.putExtra("Production",production);

                    //Image parse
                    intent1.putExtra("Rmovie1",rmovie1);
                    intent1.putExtra("Rmovie2",rmovie2);
                    intent1.putExtra("Rmovie1Name",RMovie1Name);
                    intent1.putExtra("Rmovie2Name",RMovie2Name);
                    intent1.putExtra("Rmovie1Date",RMovie1date);
                    intent1.putExtra("Rmovie2Date",RMovie2date);


                    startActivity(intent1);



                }
            });
        }

        if (cast1.getText().toString().contains(dern)) {
            cast1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// RMovies
                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.jurassic_world_dp;
                    rmovie2 = R.drawable.jurassic_park_dp;

                    String name = dern;
                    int cover = R.drawable.laura_dern_cover;
                    int dp = R.drawable.laura_derren_dp;
                    String Spouse = "Ben Harper";
                    String DOB = "Feb 10, 1967";
                    String overView = "Laura Elizabeth Dern is an American actress and producer. She is the recipient of numerous accolades, including an Academy Award, an Emmy Award, and five Golden Globe Awards.";
                    String production = "Universal Picture";

                    String RMovie1Name = "Jurassic World";
                    String RMovie2Name = "Jurassic Park";
                    String RMovie1date = "June 10, 2022";
                    String RMovie2date = "April 12, 2013";



                    Intent intent1 = new Intent(MovieInfo.this,CastInfo.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_spouse",Spouse);
                    intent1.putExtra("Director_dob",DOB);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Director_overView",overView);
                    intent1.putExtra("Production",production);

                    //Image parse
                    intent1.putExtra("Rmovie1",rmovie1);
                    intent1.putExtra("Rmovie2",rmovie2);
                    intent1.putExtra("Rmovie1Name",RMovie1Name);
                    intent1.putExtra("Rmovie2Name",RMovie2Name);
                    intent1.putExtra("Rmovie1Date",RMovie1date);
                    intent1.putExtra("Rmovie2Date",RMovie2date);


                    startActivity(intent1);



                }
            });
        }

        if (cast2.getText().toString().contains(jeff)) {
            cast2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// RMovies
                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.the_dark_knight_dp;
                    rmovie2 = R.drawable.interstellar_dp;

                    String name = jeff;
                    int cover = R.drawable.jeff_goldblum_cover;
                    int dp = R.drawable.jeff_gold_blum_dp;
                    String Spouse = " Emilie Livingston (m. 2014), Geena Davis (m. 1987–1990), Patricia Gaul (m. 1980–1986)";
                    String DOB = "Oct 22, 1952";
                    String overView = "Jeffrey Lynn Goldblum is an American actor and musician. He has starred in some of the highest-grossing films of his era, such as Jurassic Park and Independence Day, as well as their respective sequels.";
                    String production = "Universal Picture";

                    String RMovie1Name = "The Dark Knight Rises";
                    String RMovie2Name = "Interstellar";
                    String RMovie1date = "Aug 20, 2012";
                    String RMovie2date = "Apr 12, 2013";



                    Intent intent1 = new Intent(MovieInfo.this,CastInfo.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_spouse",Spouse);
                    intent1.putExtra("Director_dob",DOB);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Director_overView",overView);
                    intent1.putExtra("Production",production);

                    //Image parse
                    intent1.putExtra("Rmovie1",rmovie1);
                    intent1.putExtra("Rmovie2",rmovie2);
                    intent1.putExtra("Rmovie1Name",RMovie1Name);
                    intent1.putExtra("Rmovie2Name",RMovie2Name);
                    intent1.putExtra("Rmovie1Date",RMovie1date);
                    intent1.putExtra("Rmovie2Date",RMovie2date);


                    startActivity(intent1);



                }
            });
        }

        if (cast2.getText().toString().contains(ken)) {
            cast2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// RMovies
                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.inception_dp;
                    rmovie2 = R.drawable.interstellar_dp;

                    String name = ken;
                    int cover = R.drawable.ken_watanabe_cover;
                    int dp = R.drawable.ken_watanabe_dp;
                    String Spouse = " Kaho Minami (m. 2005–2018), Yumiko Watanabe (m. 1983–2005)";
                    String DOB = "Oct 21, 1959";
                    String overView = "Ken Watanabe is a Japanese actor. To English-speaking audiences, he is known for playing tragic hero characters, such as General Tadamichi Kuribayashi in Letters from Iwo Jima and Lord Katsumoto Moritsugu in The Last Samurai, for which he was nominated for the Academy Award for Best Supporting Actor.";
                    String production = "Universal Picture";

                    String RMovie1Name = "Inception";
                    String RMovie2Name = "Interstellar";
                    String RMovie1date = "Sep 11, 2010";
                    String RMovie2date = "Apr 12, 2013";



                    Intent intent1 = new Intent(MovieInfo.this,CastInfo.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_spouse",Spouse);
                    intent1.putExtra("Director_dob",DOB);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Director_overView",overView);
                    intent1.putExtra("Production",production);

                    //Image parse
                    intent1.putExtra("Rmovie1",rmovie1);
                    intent1.putExtra("Rmovie2",rmovie2);
                    intent1.putExtra("Rmovie1Name",RMovie1Name);
                    intent1.putExtra("Rmovie2Name",RMovie2Name);
                    intent1.putExtra("Rmovie1Date",RMovie1date);
                    intent1.putExtra("Rmovie2Date",RMovie2date);


                    startActivity(intent1);



                }
            });
        }


        if (cast3.getText().toString().contains(ken)) {
            cast3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// RMovies
                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.the_dark_knight_dp;
                    rmovie2 = R.drawable.interstellar_dp;

                    String name = ken;
                    int cover = R.drawable.ken_watanabe_cover;
                    int dp = R.drawable.ken_watanabe_dp;
                    String Spouse = " Kaho Minami (m. 2005–2018), Yumiko Watanabe (m. 1983–2005)";
                    String DOB = "Oct 21, 1959";
                    String overView = "Ken Watanabe is a Japanese actor. To English-speaking audiences, he is known for playing tragic hero characters, such as General Tadamichi Kuribayashi in Letters from Iwo Jima and Lord Katsumoto Moritsugu in The Last Samurai, for which he was nominated for the Academy Award for Best Supporting Actor.";
                    String production = "Universal Picture";

                    String RMovie1Name = "Inception";
                    String RMovie2Name = "Interstellar";
                    String RMovie1date = "Aug 20, 2012";
                    String RMovie2date = "Apr 12, 2013";



                    Intent intent1 = new Intent(MovieInfo.this,CastInfo.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_spouse",Spouse);
                    intent1.putExtra("Director_dob",DOB);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Director_overView",overView);
                    intent1.putExtra("Production",production);

                    //Image parse
                    intent1.putExtra("Rmovie1",rmovie1);
                    intent1.putExtra("Rmovie2",rmovie2);
                    intent1.putExtra("Rmovie1Name",RMovie1Name);
                    intent1.putExtra("Rmovie2Name",RMovie2Name);
                    intent1.putExtra("Rmovie1Date",RMovie1date);
                    intent1.putExtra("Rmovie2Date",RMovie2date);


                    startActivity(intent1);



                }
            });
        }



        if (cast3.getText().toString().contains(chriss)) {
            cast3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// RMovies
                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.jurassic_world_dp;
                    rmovie2 = R.drawable.jurassic_park_dp;

                    String name = chriss;
                    int cover = R.drawable.chris_pratt_cover;
                    int dp = R.drawable.chris_pratt_dp;
                    String Spouse = " Katherine Schwarzenegger (m. 2019), Anna Faris (m. 2009–2018)";
                    String DOB = "June 21, 1979";
                    String overView = "Christopher Michael Pratt is an American actor. He rose to prominence for his television roles, particularly as Andy Dwyer in the NBC sitcom Parks and Recreation, for which he received critical acclaim and was nominated for the Critics' Choice Television Award for Best Supporting Actor in a Comedy Series in 2013.";
                    String production = "Universal Picture";

                    String RMovie1Name = "Jurassic World";
                    String RMovie2Name = "Jurassic Park";
                    String RMovie1date = "Jun 10, 2022";
                    String RMovie2date = "Apr 12, 2013";



                    Intent intent1 = new Intent(MovieInfo.this,CastInfo.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_spouse",Spouse);
                    intent1.putExtra("Director_dob",DOB);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Director_overView",overView);
                    intent1.putExtra("Production",production);

                    //Image parse
                    intent1.putExtra("Rmovie1",rmovie1);
                    intent1.putExtra("Rmovie2",rmovie2);
                    intent1.putExtra("Rmovie1Name",RMovie1Name);
                    intent1.putExtra("Rmovie2Name",RMovie2Name);
                    intent1.putExtra("Rmovie1Date",RMovie1date);
                    intent1.putExtra("Rmovie2Date",RMovie2date);


                    startActivity(intent1);



                }
            });
        }

        if (cast3.getText().toString().contains(leonardo)) {
            cast3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// RMovies
                    int rmovie1,rmovie2;
                    rmovie1 = R.drawable.the_dark_knight_dp;
                    rmovie2 = R.drawable.inception_dp;

                    String name = leonardo;
                    int cover = R.drawable.leonardo_dicaprio_cover;
                    int dp = R.drawable.leonardo_dicarpio;
                    String Spouse = "Gisele Bündchen (2000–2005) Bar Refaeli (2005–2011) Camila Morrone (2017–present)";
                    String DOB = "November 11, 1974";
                    String overView = "Leonardo Wilhelm DiCaprio is an American actor and film producer. Known for his work as a leading man in biopics and period films, he is the recipient of numerous accolades, including an Academy Award, a British Academy Film Award, and three Golden Globe Awards.";
                    String production = Production4;

                    String RMovie1Name = "Jurassic World";
                    String RMovie2Name = "Jurassic Park";
                    String RMovie1date = "Jun 10, 2022";
                    String RMovie2date = "Apr 12, 2013";



                    Intent intent1 = new Intent(MovieInfo.this,CastInfo.class);
                    intent1.putExtra("Director_dp",dp);
                    intent1.putExtra("Director_cover",cover);
                    intent1.putExtra("Director_spouse",Spouse);
                    intent1.putExtra("Director_dob",DOB);
                    intent1.putExtra("Movie_Name",name);
                    intent1.putExtra("Director_overView",overView);
                    intent1.putExtra("Production",production);

                    //Image parse
                    intent1.putExtra("Rmovie1",rmovie1);
                    intent1.putExtra("Rmovie2",rmovie2);
                    intent1.putExtra("Rmovie1Name",RMovie1Name);
                    intent1.putExtra("Rmovie2Name",RMovie2Name);
                    intent1.putExtra("Rmovie1Date",RMovie1date);
                    intent1.putExtra("Rmovie2Date",RMovie2date);


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