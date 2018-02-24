package com.sorbonne.trombi.trombinoscope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_trombie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_trombie = (Button) findViewById(R.id.btn_trombie);
        btn_trombie.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "BIENVENUE AU TROMBINOSCOPE", Toast.LENGTH_LONG).show();
                        Intent activityChangeIntent = new Intent(MainActivity.this, PersonneListActivity.class);
                        MainActivity.this.startActivity(activityChangeIntent);
                    }
                }
        );

    }
}
