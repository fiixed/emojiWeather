package com.fiixed.emojiweather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/**
 * Created by abell on 11/21/13.
 */
public class Weather {
    private int mDate;
    private int mTempMin;
    private int mTempMax;
    private String icon;

    public Weather() {

    }

    public Weather(int mDate, int mTempMin, int mTempMax, String icon) {
        this.mDate = mDate;
        this.mTempMin = mTempMin;
        this.mTempMax = mTempMax;
        this.icon = icon;
    }

    public int getmDate() {
        return mDate;
    }

    public void setmDate(int mDate) {
        this.mDate = mDate;
    }

    public int getmTempMin() {
        return mTempMin;
    }

    public void setmTempMin(int mTempMin) {
        this.mTempMin = mTempMin;
    }

    public int getmTempMax() {
        return mTempMax;
    }

    public void setmTempMax(int mTempMax) {
        this.mTempMax = mTempMax;
    }

    public int fahrenheitToCelsius(int fahrenheit) {
        int celcius = ((fahrenheit - 32) * 5) / 9;
        return celcius;
    }

    public String getIcon() {
        return icon;
    }

    //convert time to readable date
    public String simpleDate() {
        String formattedDate;
        Date date = new Date(getmDate() * 1000L); // *1000 is to convert minutes to milliseconds
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d"); // the format of your date
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+11"));
        formattedDate = sdf.format(date);
        return formattedDate;
    }

    public String simpleDay() {
        String formattedDate;
        Date date = new Date(getmDate() * 1000L); // *1000 is to convert minutes to milliseconds
        SimpleDateFormat sdf = new SimpleDateFormat("EEE"); // the format of your date
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+11"));
        formattedDate = sdf.format(date);
        return formattedDate;
    }

    public String getEmoji(String icon) {
        if ("partly-cloudy-day".equals(icon)) {
            return "six";
        } else if ("rain".equals(icon)) {
            return "ten";
        } else if ("partly-cloudy-night".equals(icon)) {
            return "twelve";
        } else {
            return "one";
        }
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
