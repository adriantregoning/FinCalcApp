package com.example.fincalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuadBoardSizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quad_board_size);
    }

    public void QuadInfo(View v) {
        Intent i = new Intent(this, QuadInfoActivity.class);
        int index = -1;
        switch (v.getId()) {
            case R.id.btn50_60:
                index = 0;
                break;
            case R.id.btn55_70:
                index = 1;
                break;
            case R.id.btn65_75:
                index = 2;
                break;
            case R.id.btn70_80:
                index = 3;
                break;
            case R.id.btn75_85:
                index = 4;
                break;
            case R.id.btn80_90:
                index = 5;
                break;
            case R.id.btn85_95:
                index = 6;
                break;
            case R.id.btn90_100:
                index = 7;
                break;
            case R.id.btn95_110:
                index = 8;
                break;
            case R.id.btn100_120:
                index = 9;
                break;
        }
        i.putExtra("index", index);

        startActivity(i);
    }
}