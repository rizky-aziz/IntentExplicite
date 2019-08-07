package com.example.intentlatihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_intent2 extends AppCompatActivity implements View.OnClickListener {
    Button Explicitintent;
    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_intent2);

        Explicitintent = (Button)findViewById(R.id.btn3);
        Explicitintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn3:
                Intent explicit = new Intent(activity_intent2.this, activity_intent3.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
