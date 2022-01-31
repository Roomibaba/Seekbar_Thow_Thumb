package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import com.google.android.material.slider.RangeSlider;

public class MainActivity extends AppCompatActivity {

    CrystalRangeSeekbar rangeSlider;
    TextView maxV,minV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rangeSlider=findViewById(R.id.Duration_rangeBar);
        maxV=findViewById(R.id.maxV);
        minV=findViewById(R.id.minV);

        rangeSlider.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {

                minV.setText("Rs"+ minValue);
                maxV.setText("Rs"+ maxValue);

            }
        });
    }
}