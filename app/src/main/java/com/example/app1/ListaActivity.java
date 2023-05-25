package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.app1.Clases.Anime;
import com.example.app1.Clases.Persona;
import com.example.app1.adapters.NameAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        NameAdapter adapter = new NameAdapter(data());

        RecyclerView rvLista = findViewById(R.id.rvListaSimple);
        rvLista.setLayoutManager(new LinearLayoutManager(this));
        rvLista.setAdapter(adapter);

    }
    private List<Anime> data(){
        List<Anime> anime = new ArrayList<>();
        anime.add(new Anime("goku","goku dass","https://w7.pngwing.com/pngs/562/839/png-transparent-american-football-football-sport-sports-%D1%84%D1%83%D1%82%D0%B1%D0%BE%D0%BB-thumbnail.png",true));
        anime.add(new Anime("vegeta","vegeta azul","https://img.lovepik.com/free-png/20220110/lovepik-football-png-image_401385251_wh860.png",false));
        anime.add(new Anime("frezer","frezer malvado","https://i.pinimg.com/474x/dd/11/c3/dd11c32cd5fe5aa1faa4ffd43ecc3978.jpg",false));
        anime.add(new Anime("cooler","coller malvado","https://w7.pngwing.com/pngs/833/368/png-transparent-abstract-soccer-art-background-05-thumbnail.png",false));
        return  anime;
    }
}