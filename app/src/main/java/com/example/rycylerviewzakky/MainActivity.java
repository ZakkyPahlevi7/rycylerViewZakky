package com.example.rycylerviewzakky;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecycleView();


    }

    private void initData() {

        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.iniitsuki, "Itsuki", "10:45Am", "Aku cantik kan?", "_______________________________________"));

        userList.add(new ModelClass(R.drawable.inimiku, "Miku", "02:30Am", "Besok main yuk", "_______________________________________"));

        userList.add(new ModelClass(R.drawable.ininino, "Nino", "18.20Pm", "Mana hutangmu woi!", "_______________________________________"));

        userList.add(new ModelClass(R.drawable.iniyotsuba, "Yotsuba", "17.45Pm", "Pliss lah zakk", "_______________________________________"));

        userList.add(new ModelClass(R.drawable.iniitsuki, "Fans Itsuki", "8:10Am", "Gapapa sumpah hhe", "_______________________________________"));

        userList.add(new ModelClass(R.drawable.inimiku, "Fans Miku", "06.29Am", "Heleh bohong ah", "_______________________________________"));

        userList.add(new ModelClass(R.drawable.ininino, "Fans Nino", "12:28Am", "Kata siapa heh ngawur", "_______________________________________"));

        userList.add(new ModelClass(R.drawable.iniyotsuba, "Fans Yotsuba", "22:55Am", "Salam kenal juga zak", "_______________________________________"));

        userList.add(new ModelClass(R.drawable.iniichika, "Fans Ichika", "19:15Am", "Ya emang bener itu ", "_______________________________________"));



    }

    private void initRecycleView() {

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}