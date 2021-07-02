package com.example.android.reportcard;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportcard);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.report_rcv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        final List<ReportCard> mReportCardList = new ArrayList<>();
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Maths",
                84,
                "A"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Physics",
                98,
                "A+"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Chemistry",
                75,
                "B"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "English",
                88,
                "B+"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Biology",
                90,
                "A"
        ));
        mReportCardList.add(new ReportCard(
                R.mipmap.ic_launcher,
                "Hindi",
                3,
                "F"
        ));

        mRecyclerView.setAdapter(new ReportCardAdapter(mReportCardList));

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, mReportCardList.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        }));
    }
}