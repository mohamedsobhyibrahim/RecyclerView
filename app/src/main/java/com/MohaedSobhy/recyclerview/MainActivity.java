package com.MohaedSobhy.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.MohaedSobhy.Model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    private List<UserModel> models;
    private Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        models = new ArrayList<>();

        models.add(new UserModel("Mohamed Sobhy" , "Sometimes losing a close friend hurts worse than a heartbreak. " ,R.drawable.img1));
        models.add(new UserModel("Youssef Essam" , "Never Love Someone At The Cost Of Your Dignity And Self Respect...!!! ..." ,R.drawable.img2));
        models.add(new UserModel("Ahmed Khaled" , "There are two ways to be happy: Change your situation, or change your mindset towards it." ,R.drawable.img3));
        models.add(new UserModel("John Doe" , "If you push me away I promise you, you won’t find me where you left me. My heart is big , but not big enough to deal with people, who decide to love me when it’s convenient for them." ,R.drawable.img4));
        models.add(new UserModel("Ahmed Helmi" , "''Things i do in my life:happy being single, enjoy life, endless talking, and wait until there's someone who truly loves me''" ,R.drawable.img5));
        models.add(new UserModel("Mohamed Salah" , "Love is sweet when its new, but sweeter when its true." ,R.drawable.img6));
        models.add(new UserModel("Messi" , "Call me old fashioned but i actually take relationships seriously." ,R.drawable.img1));
        models.add(new UserModel("Ronaldo" , "''Things i do in my life:happy being single, enjoy life, endless talking, and wait until there's someone who truly loves me''" ,R.drawable.img2));
        models.add(new UserModel("Mohamed Ahmed" , "My life isnt perfect but i am thankful for everything i have." ,R.drawable.img3));
        models.add(new UserModel("Ahmed Samir" , "Just because I am smiling, doesnt mean my life is perfect." ,R.drawable.img4));




        adapter = new Adapter(models , getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
