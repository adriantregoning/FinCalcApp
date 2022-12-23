package com.example.fincalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ThrusterInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thruster_info);

        Bundle bundle = getIntent().getExtras();
        int index = getIntent().getExtras().getInt("index");

        String centerFin = String.valueOf(mThruster.getArray()[index].centerFin);
        TextView centerFinView = findViewById(R.id.centerFin_txt);
        centerFinView.setText(centerFin);

        String thrusterFins = String.valueOf(mThruster.getArray()[index].thrusterFins);
        TextView thrusterFinsView = findViewById(R.id.thrusterFins_txt);
        thrusterFinsView.setText(thrusterFins);

        String totalArea = String.valueOf(mThruster.getArray()[index].totalArea);
        TextView totalAreaView = findViewById(R.id.totalArea_txt);
        totalAreaView.setText(totalArea);

        String sailRange = String.valueOf(mThruster.getArray()[index].sailRange);
        TextView sailRangeView = findViewById(R.id.sailRange_txt);
        sailRangeView.setText(sailRange);

        String sailorSize = String.valueOf(mThruster.getArray()[index].sailorSize);
        TextView sailorSizeView = findViewById(R.id.sailorSize_txt);
        sailorSizeView.setText(sailorSize);

        String boardSize = String.valueOf(mThruster.getArray()[index].boardSize);
        TextView boardSizeView = findViewById(R.id.boardSize_txt);
        boardSizeView.setText(boardSize);

        Log.d("ThrusterInfoActivity", "" + centerFin);
        Log.d("boardSize", "" + boardSize);
    }

    private Thruster mThruster = new Thruster();

}