package com.example.englishgrammer;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    private TextView nameText,detailsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide action bar
        getSupportActionBar().hide();

        setContentView(R.layout.output_activity);

        nameText=findViewById(R.id.text1);
        detailsText=findViewById(R.id.text2);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            String resultMatch=bundle.getString("key");
            showDetails(resultMatch);
        }
    }
    void showDetails(String str){
        if (str.equals("tagQuestion")){
            nameText.setText("Tag Question");
            detailsText.setText(R.string.tagQuestion);
        }

    }
}
