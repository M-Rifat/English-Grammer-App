package com.example.englishgrammer;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity implements View.OnClickListener {

    private TextView txtMarquee;
    private ImageView imageView1, imageView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.about_us);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.engbook);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        txtMarquee = (TextView) findViewById(R.id.marqueeText);
        txtMarquee.setSelected(true);

        imageView1 = findViewById(R.id.img1);
        imageView2 = findViewById(R.id.img2);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.img1) {
            imageView1.setVisibility(View.GONE);
            imageView2.setVisibility(View.VISIBLE);
        }
        if (v.getId() == R.id.img2) {
            imageView2.setVisibility(View.GONE);
            imageView1.setVisibility(View.VISIBLE);
        }
    }
}
