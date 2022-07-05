package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.cinemax.Adapter.MovieAdapter;
import com.example.cinemax.Model.MoviesModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ImageSlider imageSlider;

private RecyclerView recyclerView;
private ArrayList<MoviesModel> Movielist = new ArrayList<>();

int[] MovieImages = {R.drawable.the_dark_knight_dp, R.drawable.jurassic_world_dp,
        R.drawable.inception_poster, R.drawable.jurassic_park_dp,
        R.drawable.interstellar_dp};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.main_recycler);

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

        //RecyclerView Start
        SetUpMovieData();

        MovieAdapter adapter = new MovieAdapter(this,Movielist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));



    }

    private void SetUpMovieData() {

        String[] MovieName = getResources().getStringArray(R.array.Movies_Names);
        String[] Release_Date = getResources().getStringArray(R.array.Release_Dates);
       String[] rating = getResources().getStringArray(R.array.Rating);
        String[] cast = getResources().getStringArray(R.array.Cast);
        String[] genre = getResources().getStringArray(R.array.Genre);
    //    String[] Description = getResources().getStringArray(R.array.Description);
        String[] directors = getResources().getStringArray(R.array.Directors);
        String[] duration = getResources().getStringArray(R.array.Duration);
        String[] producers = getResources().getStringArray(R.array.Producers);
        for (int i=0; i< MovieName.length; i++)
        {
            Movielist.add(new MoviesModel(MovieImages[i],MovieName[i],
                    Release_Date[i],rating[i],"",genre[i],directors[i],duration[i],producers[i],cast[i]));


        }

    }
}