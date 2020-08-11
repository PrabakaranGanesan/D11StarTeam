package com.tamil.d_11starteammoneymakingteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button winningbutton,gobutton,glbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winningbutton=(Button)findViewById(R.id.winningbutton);
        gobutton=(Button)findViewById(R.id.gobutton);
        glbutton=(Button)findViewById(R.id.glbutton);


        winningbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                winningscreenshotlayout();

            }
        });

        gobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamslayout();

            }
        });

        glbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                glteamslayout();

            }
        });



    }



    private void winningscreenshotlayout()
    {
        Intent intent1=new Intent(MainActivity.this,winning.class);
        startActivity(intent1);

    }
    private void teamslayout()
    {
        Intent intent2=new Intent(MainActivity.this,teams.class);
        startActivity(intent2);
    }
    private void glteamslayout()
    {
        Intent intent3=new Intent(MainActivity.this,glteam.class);
        startActivity(intent3);
    }


}
