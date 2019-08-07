package com.example.intentlatihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {
    Button Explicitintent;
    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_intent1);

        Explicitintent = (Button)findViewById(R.id.btn2);
        Explicitintent.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Intent explicit = new Intent(IntentActivity.this, activity_intent2.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}