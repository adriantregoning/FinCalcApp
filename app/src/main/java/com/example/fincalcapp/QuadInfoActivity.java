package com.example.fincalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class QuadInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quad_info);

        Bundle bundle = getIntent().getExtras();
        int index = getIntent().getExtras().getInt("index");

        String rearFins = String.valueOf(mQuad.getArray()[index].rearFins);
        TextView rearFinsView = findViewById(R.id.rearFins_txt);
        rearFinsView.setText(rearFins);

        String frontFins = String.valueOf(mQuad.getArray()[index].frontFins);
        TextView frontFinsView = findViewById(R.id.frontFins_txt);
        frontFinsView.setText(frontFins);

        String totalArea = String.valueOf(mQuad.getArray()[index].totalArea);
        TextView totalAreaView = findViewById(R.id.totalArea_txt);
        totalAreaView.setText(totalArea);

        String sailRange = String.valueOf(mQuad.getArray()[index].sailRange);
        TextView sailRangeView = findViewById(R.id.sailRange_txt);
        sailRangeView.setText(sailRange);

        String sailorSize = String.valueOf(mQuad.getArray()[index].sailorSize);
        TextView sailorSizeView = findViewById(R.id.sailorSize_txt);
        sailorSizeView.setText(sailorSize);

        String boardSize = String.valueOf(mQuad.getArray()[index].boardSize);
        TextView boardSizeView = findViewById(R.id.boardSize_txt);
        boardSizeView.setText(boardSize);

        //Log.d("ThrusterInfoActivity", "" + rearFins);
    }

    private Quad mQuad = new Quad();

}
