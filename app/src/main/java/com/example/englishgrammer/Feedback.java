package com.example.englishgrammer;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Feedback extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private EditText editText1, editText2;
    private RatingBar ratingBar;
    String ratingg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        ratingg = new String("");

        //back home button then add listener
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        button = findViewById(R.id.bt);
        editText1 = findViewById(R.id.et1);
        editText2 = findViewById(R.id.et2);

        button.setOnClickListener(this);
        ratingBar=findViewById(R.id.rtbar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                //Toast.makeText(Feedback.this,"value : "+rating,Toast.LENGTH_SHORT).show();
                ratingg = String.valueOf(rating);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        try {
            String name = editText1.getText().toString();
            String comment = editText2.getText().toString();

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/email");

            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"www.mobinulislam482@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");
            intent.putExtra(Intent.EXTRA_TEXT, "Name :" + name + "\n comment: " + comment);
            startActivity(Intent.createChooser(intent, "Feedback with"));

        } catch (Exception e) {
        }


    }
}