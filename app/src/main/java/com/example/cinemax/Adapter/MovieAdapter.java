package com.example.cinemax.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.security.identity.IdentityCredentialStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cinemax.CastInfo;
import com.example.cinemax.Model.MoviesModel;
import com.example.cinemax.MovieInfo;
import com.example.cinemax.R;

import java.lang.reflect.Array;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private Context context;
    private List<MoviesModel> moviesModelList;


    public MovieAdapter(Context context, List<MoviesModel> moviesModelList) {
        this.context = context;
        this.moviesModelList = moviesModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final MoviesModel temp = moviesModelList.get(position);

        holder.date.setText(moviesModelList.get(position).getRelease_Date());
        holder.name.setText(moviesModelList.get(position).getName());
        holder.rating.setText(moviesModelList.get(position).getRelease_Date());
        holder.duration.setText(moviesModelList.get(position).getRelease_Date());
        holder.cast.setText(moviesModelList.get(position).getRelease_Date());
        holder.decription.setText(moviesModelList.get(position).getRelease_Date());
        holder.director.setText(moviesModelList.get(position).getRelease_Date());
        holder.genre.setText(moviesModelList.get(position).getRelease_Date());
        holder.producer.setText(moviesModelList.get(position).getRelease_Date());
        holder.production.setText(moviesModelList.get(position).getProduction());


        holder.image.setImageResource(moviesModelList.get(position).getImage());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MovieInfo.class);

                intent.putExtra("Movie_Image", temp.getImage());
                intent.putExtra("Movie_Name", temp.getName());
                intent.putExtra("Movie_Date", temp.getRelease_Date());
                intent.putExtra("Movie_rating", temp.getRating());
                intent.putExtra("Movie_Desc", temp.getDescription());
                intent.putExtra("Movie_Direc", temp.getDirectors());
                intent.putExtra("Movie_Producer", temp.getProducers());
                intent.putExtra("Movie_Duration", temp.getDuration());
                intent.putExtra("Movie_Genre", temp.getGenre());
                intent.putExtra("Movie_Cast", temp.getCast());
                intent.putExtra("Production",temp.getProduction());


                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return moviesModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image,Rimage1,Rimage2,Rimage3;
        TextView name,date,rating,duration,cast,producer,director,decription,genre,production;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.movieImage);
            name = itemView.findViewById(R.id.movieName);
            date = itemView.findViewById(R.id.release_date);
            rating = itemView.findViewById(R.id.rate_txt);
            genre = itemView.findViewById(R.id.genre_txt);
            duration = itemView.findViewById(R.id.duration_txt);
            cast = itemView.findViewById(R.id.caste_txt);
            director = itemView.findViewById(R.id.direct_txt);
            producer = itemView.findViewById(R.id.produce_txt);
            decription = itemView.findViewById(R.id.desc_txt);
            production = itemView.findViewById(R.id.productions);


            Rimage1 = itemView.findViewById(R.id.relatedIV1);
            Rimage2 = itemView.findViewById(R.id.relatedIV2);
            Rimage3 = itemView.findViewById(R.id.relatedIV3);


        }
    }

    /*                if (holder.image.callOnClick()){

                    holder.Rimage1.setImageResource(R.drawable.interstellar_dp);
                    holder.Rimage2.setImageResource(R.drawable.jurassic_world_dp);
                    holder.Rimage3.setImageResource(R.drawable.the_dark_knight_dp);

                }
                else
                {
                    holder.Rimage2.setImageResource(R.drawable.interstellar_dp);
                    holder.Rimage1.setImageResource(R.drawable.inception_poster);
                    holder.Rimage3.setImageResource(R.drawable.jurassic_park_dp);

                }
                                                 */
}
