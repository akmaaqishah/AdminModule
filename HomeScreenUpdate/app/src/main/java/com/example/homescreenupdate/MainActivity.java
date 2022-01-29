package com.example.homescreenupdate;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimation;
    ImageView homescreenbg;

    TextView modul,welcome;

    TextView dashboard,parcel,scanner;

    private Object FrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        //Hide status bar
        WindowInsetsControllerCompat controller = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        controller.hide( WindowInsetsCompat.Type.systemBars());

        //Hide aplication aplication bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //Home screen
        lottieAnimation = findViewById(R.id.parcelicon);
        homescreenbg = findViewById(R.id.homescreenbg);

        //second screen
        lottieAnimation = findViewById( R.id.hai );
        modul = findViewById( R.id.module );
        welcome = findViewById( R.id.welcome );

        //dashboard
        lottieAnimation = findViewById( R.id.headerwaves1 );
        lottieAnimation = findViewById( R.id.headerwaves2 );

        parcel = findViewById( R.id.parcel );
        scanner = findViewById( R.id.scanner );
        dashboard = findViewById( R.id.dasboard );



        //setContentView( R.layout.activity_main );
        setContentView( R.layout.dashboard );
        //setContentView( R.layout.welcoming);



    }
}