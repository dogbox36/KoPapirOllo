package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     Button ko;
     Button papir;
     Button ollo;
     TextView tippErtekember;
     TextView tippErtekgep;
     ImageView imageView;
     ImageView imageViewgep;
     ImageView hp1;
     ImageView hp2;
     ImageView hp3;
     ImageView hp4;
     ImageView[] eletek;
     Random r;
    private int countergep = 0;
    private int counterember = 0;

    Integer[]images={
            R.drawable.scissors
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView) findViewById(R.id.imageView);
        imageViewgep=(ImageView) findViewById(R.id.imageViewgep);
        ko =(Button) findViewById(R.id.ko);
        papir =(Button) findViewById(R.id.papir);
        ollo =(Button) findViewById(R.id.ollo);
        tippErtekember=(TextView)findViewById(R.id.tippErtekember);
        tippErtekgep=(TextView)findViewById(R.id.tippErtekgep);
        r=new Random();
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] images = {R.drawable.paper,R.drawable.rock,R.drawable.scissors};
                Random rand = new Random();
                imageView.setImageResource(R.drawable.rock);
                imageViewgep.setImageResource(images[rand.nextInt(images.length)]);
                int geptipp=r.nextInt(3);
                if (geptipp==0){
                    imageViewgep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Döntetlen lett", Toast.LENGTH_SHORT).show();
                } else if(geptipp==1){
                    imageViewgep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                    countergep++;
                    tippErtekgep.setText(String.valueOf(countergep));
                }
                else{
                    imageViewgep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Te nyertél", Toast.LENGTH_SHORT).show();
                    counterember++;
                    tippErtekember.setText(String.valueOf(counterember));
                }

            }
        });
        papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] images = {R.drawable.paper,R.drawable.rock,R.drawable.scissors};
                Random rand = new Random();
                imageView.setImageResource(R.drawable.paper);
                imageViewgep.setImageResource(images[rand.nextInt(images.length)]);
                int geptipp=r.nextInt(3);
                if (geptipp==0){
                    imageViewgep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Döntetlen lett", Toast.LENGTH_SHORT).show();
                } else if(geptipp==1){
                    imageViewgep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                    countergep++;
                    tippErtekgep.setText(String.valueOf(countergep));
                }
                else{
                    imageViewgep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Te nyertél", Toast.LENGTH_SHORT).show();
                    counterember++;
                    tippErtekember.setText(String.valueOf(counterember));
                }

            }
        });
        ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] images = {R.drawable.paper,R.drawable.rock,R.drawable.scissors};
                Random rand = new Random();
                imageView.setImageResource(R.drawable.scissors);
                imageViewgep.setImageResource(images[rand.nextInt(images.length)]);
                int geptipp=r.nextInt(3);
                if (geptipp==0){
                    imageViewgep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Döntetlen lett", Toast.LENGTH_SHORT).show();
                } else if(geptipp==1){
                    imageViewgep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                    countergep++;
                    tippErtekgep.setText(String.valueOf(countergep));
                }
                else{
                    imageViewgep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Te nyertél", Toast.LENGTH_SHORT).show();
                    counterember++;
                    tippErtekember.setText(String.valueOf(counterember));
                }
            }
        });




    }
}