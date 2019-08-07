package com.example.intentlatihan2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_intent3 extends AppCompatActivity implements View.OnClickListener {
    Button Implicit;
    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_intent3);

        Implicit = (Button)findViewById(R.id.btn4);
        Implicit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn4:
                Intent explicit = new Intent(activity_intent3.this, activity_intent2.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
