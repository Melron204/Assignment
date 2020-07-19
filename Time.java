package com.montran.pojo;

public class Time {
	
private int hours;
	private int mins;

	public void setTime(int hours,int minutes)
	{
		this.hours=hours;
		this.mins=minutes;
	}
	
	public Time ShowTime()
	{
		return this;
	}
	
	public Time Sum(Time time)
	{
		Time time3=new Time();
		time3.hours=time.hours+this.hours;
		time3.mins=time.mins+this.mins;
		return time3;
	}
	
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + mins + "]";
	}
	
	
}