package com.example.englishgrammer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button15;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.bt1);
        button2=findViewById(R.id.bt2);
        button3=findViewById(R.id.bt3);
        button4=findViewById(R.id.bt4);
        button5=findViewById(R.id.bt5);
        button6=findViewById(R.id.bt6);
        button7=findViewById(R.id.bt7);
        button8=findViewById(R.id.bt8);
        button15=findViewById(R.id.bt15);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button15.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_2layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.srid){
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject="Calculate anything what you want";
            String body="So much important app !! \n com.example.myapp02 ";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"Share with"));
        }
        if(item.getItemId()==R.id.fid){
            Intent intent=new Intent(this,Feedback.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.usid){
            Intent intent=new Intent(this,AboutUs.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bt15){
            intent=new Intent(MainActivity.this,ResultActivity.class);
            intent.putExtra("key","tagQuestion");
            startActivity(intent);
        }

    }
}