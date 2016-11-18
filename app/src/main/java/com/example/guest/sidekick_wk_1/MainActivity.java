package com.example.guest.sidekick_wk_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private Button mfirstContinueButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);


        mfirstContinueButton = (Button) findViewById(R.id.firstContinueButton);
        mfirstContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SurveyInfoPage.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Thanks for joining the team!", Toast.LENGTH_SHORT).show();

            }
        });




    }
}
