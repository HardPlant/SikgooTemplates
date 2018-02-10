package com.github.hardplant.sikgootemplates.data;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by KANG on 2018-02-07.
 */

public class PeriodTimer {
    Context context;
    Timer timer;
    TimerTask task;
    TextView timerView;
    TextView periodView;


    final String TimerFormat = "MM월 dd일 E요일 a hh시 mm분";
    final String PeriodFormat ="%d교시 수업중입니다";
    final DateFormat timerFormat = new SimpleDateFormat(TimerFormat);
    DateFormat periodDF = new SimpleDateFormat("E, HH, mm");

    public PeriodTimer(final Context context, TextView textView, TextView periodView) {
        this.context = context;
        this.timerView = textView;
        this.periodView = periodView;
        this.timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                ((Activity)context).runOnUiThread(new Runnable() {
                                                      @Override
                                                      public void run() {
                                                          setTextView();
                                                      }
                                                  }
                );
            }
        };
    }
    public void run(){
        timer.schedule(task, 200, 2000);
    }

    private void setTextView(){
        Date now = new Date();

        String timerString = timerFormat.format(now);
        timerView.setText(timerString);
        periodView.setText(getPeriodText(now));
    }

    private String getPeriodText(Date now){
        String period = periodDF.format(now);
        String[] data =  period.split(",");
        String day = data[0];
        String hour = data[1];
        String minute = data[2];

        return "0교시 수업중입니다";
    }
}
