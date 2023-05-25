package com.example.app1.adapters;

import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app1.Clases.Anime;
import com.example.app1.Clases.Persona;
import com.example.app1.R;
import com.squareup.picasso.Picasso;

import java.util.List;



public class NameAdapter extends RecyclerView.Adapter {
    private List<Anime> items;
    public NameAdapter(List<Anime> items){
      this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_string, parent, false);
        NameViewHolder viewHolder = new NameViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Anime anime = items.get(position);
        View view = holder.itemView;
        TextView tvName = view.findViewById(R.id.tvName);
        tvName.setText(anime.getNombre());
        //Telefono
        TextView tvAge = view.findViewById(R.id.txtDescripcion);
        tvAge.setText(String.valueOf(anime.getDescripcion()));

        //agregar imagen
        ImageView imageView = view.findViewById(R.id.imageView);
        Picasso.get().load(anime.getFoto()).into(imageView);

        ImageView imageViewEstrella = view.findViewById(R.id.imgEstrella);

        int imageResource = anime.isEstrella() ? R.drawable.blanco : R.drawable.negroo;
        imageViewEstrella.setImageResource(imageResource);

        imageViewEstrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                anime.setEstrella(!anime.isEstrella());

                int newImageResource = anime.isEstrella() ? R.drawable.blanco : R.drawable.negroo;
                imageViewEstrella.setImageResource(newImageResource);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public class NameViewHolder extends RecyclerView.ViewHolder{

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
