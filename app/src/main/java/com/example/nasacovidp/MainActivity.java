package com.example.nasacovidp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6;
    Context context;


    String CHANNEL_ID = "notification";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn1 = findViewById(R.id.btn1);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(new activity_band(), false, "one" );
            }
        });




    }

    public void addFragment(Fragment fragment, boolean addToBackStack, String tag){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();

        if(addToBackStack){
            ft.addToBackStack(tag);
        }
        ft.replace(R.id.container,fragment,tag);
        ft.commitAllowingStateLoss();

    }
}
