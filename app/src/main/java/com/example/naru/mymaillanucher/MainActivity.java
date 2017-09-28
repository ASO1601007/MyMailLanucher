package com.example.naru.mymaillanucher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.naru.mymaillanucher.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setOnCheckedChangeListener(new ImageView.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup image, int checkedId) {
                RadioButton radioButtom = (RadioButton) findViewById(checkedId);
                String value = radioButtom.getText().toString();
                aimage.setText(value);
            }
        });

    }
}
