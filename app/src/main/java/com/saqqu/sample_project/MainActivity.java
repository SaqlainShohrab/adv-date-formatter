package com.saqqu.sample_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.saqqu.advanceddateformatter.AdvDateFormatter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.main_text);

        String date = "01-01-1900";
        String currentFormat = "dd-MM-yyyy";


        String thFormattedDate = AdvDateFormatter.getThFormattedDate(date,currentFormat);
        String thFormattedDateYesterday = AdvDateFormatter.getDateThFormatBefore(1,date,currentFormat);
        String thFormattedDateNoYear = AdvDateFormatter.getThFormattedDate(date,currentFormat,false,true);
        String thFormattedDateNoYearNoMonth = AdvDateFormatter.getThFormattedDate(date,currentFormat,false,false);

        String finalString = "This is TH formatted Date - " + thFormattedDate + "\n\n"
                + "This is TH formatted Date 1 day ago - " + thFormattedDateYesterday+ "\n\n"
                + "This is TH formatted Date without year - " + thFormattedDateNoYear+ "\n\n"
                + "This is TH formatted Date with only day - " + thFormattedDateNoYearNoMonth;

        textView.setText(finalString);

    }
}
