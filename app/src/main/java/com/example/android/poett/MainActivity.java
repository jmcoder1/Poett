package com.example.android.poett;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        CollapsibleCalendar collapsibleCalendar = findViewById(R.id.collapsibleCalendarView);
        Calendar today = new GregorianCalendar();
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH));
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH),Color.BLUE);

        collapsibleCalendar.setToolbarColor(R.color.colorPrimaryDark);
        collapsibleCalendar.setTitleCalendarColor(Color.WHITE);
        collapsibleCalendar.setCalendarListener(new CollapsibleCalendar.CalendarListener() {
            @Override
            public void onDaySelect() {

            }

            @Override
            public void onItemClick(View v) {

            }

            @Override
            public void onDataUpdate() {

            }

            @Override
            public void onMonthChange() {

            }

            @Override
            public void onWeekChange(int position) {

            }
        });


    }
}
