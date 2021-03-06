package com.az.PersonInfo;

import java.util.Calendar;

import android.util.Log;

public class DateBuffer{
	public int YearValue=2012;
	public int MonthValue=6;
	public int DayOfMonthvalue=20;
	public String mDate;
	private static final String TAG = "Aizhuservice";
	public DateBuffer (String strDate){
		if(strDate.length() > 0){
			SetDate(strDate);
		}else{
			Calendar c = Calendar.getInstance();
			YearValue = c.get(Calendar.YEAR);
			MonthValue = c.get(Calendar.MONTH);
			DayOfMonthvalue = c.get(Calendar.DAY_OF_MONTH);
			                   
		}
	}
	public DateBuffer(int year, int month, int day){
		SetDate (year, month, day);
	}
	public void SetDate (String strDate){
		mDate = strDate;
      	String strDateTemp = strDate;
      	String strTemp;
      	int strLen = strDate.length();
      	int pos1 = 0;
		int pos2 =strDateTemp.indexOf("-");
		Log.i(TAG, "Enter SetDate strDateTemp = " + strDateTemp);
		if(pos2 > pos1){
			strTemp = strDateTemp.substring(pos1, pos2);
			YearValue =Integer.parseInt(strTemp);
			strDateTemp = strDateTemp.substring(pos2+1);
		}
		Log.i(TAG, "Enter SetDate YearValue = " + YearValue);
		Log.i(TAG, "Enter SetDate strDateTemp = " + strDateTemp);
		strLen = strDateTemp.length();
		pos2 =strDateTemp.indexOf("-");
		if(pos2 > pos1){
			strTemp = strDateTemp.substring(pos1, pos2);
			MonthValue =Integer.parseInt(strTemp);
			strDateTemp = strDateTemp.substring(pos2+1);
		}
		Log.i(TAG, "Enter SetDate MonthValue = " + MonthValue);
		Log.i(TAG, "Enter SetDate strDateTemp = " + strDateTemp);
		DayOfMonthvalue = Integer.parseInt(strDateTemp);
	}
	public void SetDate (int year, int month, int day){
		YearValue = year;
		MonthValue = month;
		DayOfMonthvalue = day;
		mDate = String.valueOf(year);
	    mDate += "-" + ((month + 1) < 10 ? "0" + String.valueOf(month + 1) : String.valueOf((month + 1)));
	    mDate += "-" + ((day < 10) ? "0" + String.valueOf(day) : String.valueOf(day));
	    Log.i(TAG, "Enter SetDate mDate = " + mDate);
	}
}
