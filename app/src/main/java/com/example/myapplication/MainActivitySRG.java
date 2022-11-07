package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivitySRG extends AppCompatActivity {


    private TextView textView,textViewSky,textViewGrass,textViewRoot;
    private Button btnSky, btnRoot, btnGrass;
    String [] alphabets={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int skyRight=0,skyWrong=0,grassRight=0,grassWrong=0,rootRight=0,rootWrong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_srg);



        textView = findViewById(R.id.textView6);
        textViewSky=findViewById(R.id.textView7);
        textViewGrass=findViewById(R.id.textView8);
        textViewRoot=findViewById(R.id.textView9);

        btnSky=findViewById(R.id.button6);
        btnRoot=findViewById(R.id.button8);
        btnGrass=findViewById(R.id.button7);
        textView.setText(alphabets[generateRnadomNumber(26)]);


    }

    public int generateRnadomNumber(int range)
    {
        Random random=new Random();
        int num=random.nextInt(range);
        return num;
    }
    public void alphabetSky(View view)
    {

        String [] skyLetters={"b","d","f","h","k","l","t"};
        String letter=textView.getText().toString();
        System.out.println(letter);
        boolean status=false;
        for(int i=0;i<skyLetters.length;i++)
        {
            if(skyLetters[i]==letter)
            {
                status=true;
                skyRight++;
                break;
            }
        }
        if(status==false)
            skyWrong++;
        textViewSky.setText("Right : "+skyRight+"\nWrong : "+skyWrong);
        textView.setText(alphabets[generateRnadomNumber(26)]);

    }
    public void alphabetGrass(View view)
    {
        String [] grassLetters={"a","c","e","i","m","n","o","r","s","u","v","w","x","z"};


        String letter=textView.getText().toString();

        boolean status=false;
        for(int i=0;i<grassLetters.length;i++)
        {
            if(grassLetters[i]==letter)
            {
                status=true;
                grassRight++;
                break;
            }
        }
        if(status==false)
            grassWrong++;
        textViewGrass.setText("Right : "+grassRight+"\nWrong : "+grassWrong);
        textView.setText(alphabets[generateRnadomNumber(26)]);
    }
    public void alphabetRoot(View view)
    {
        String [] rootLetters={"g","j","p","q","y"};

        String letter=textView.getText().toString();

        boolean status=false;
        for(int i=0;i<rootLetters.length;i++)
        {
            if(rootLetters[i]==letter)
            {
                status=true;
                rootRight++;
                break;
            }
        }
        if(status==false)
            rootWrong++;
        textViewRoot.setText("Right : "+rootRight+"\nWrong : "+rootWrong);
        textView.setText(alphabets[generateRnadomNumber(26)]);
    }


}