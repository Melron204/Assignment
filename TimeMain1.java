  
package com.montran.main;

import com.montran.pojo.Time;

public class TimeMain1 {

	public static void main(String[] args) {
		Time time=new Time();
		Time time2=new Time();
		Time time3=new Time();
		
		
		
		time.setTime(4,  22);
		time2.setTime(3,  88);
		time3=time2.Sum(time);
	
		
		System.out.println(time.ShowTime());
		System.out.println(time2.ShowTime());
		System.out.println(time3.ShowTime());
	}

}