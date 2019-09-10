package com.hcl.boxing;

public class TimeZone {
	int hr;
	int min;

	TimeZone() {
		this.hr = hr;
		this.min = min;

	}

	public TimeZone(int hr, int min) {
		super();
		this.hr = hr;
		this.min = min;
	}
	public TimeZone add(TimeZone t1,TimeZone t2){
		TimeZone t3=new TimeZone();
		t3.hr=t1.hr+t2.hr;
		t3.min=t1.min+t2.min;
		if(t3.min>60){
			t3.hr++;
			t3.min=t3.min%60;
		}
		return t3;
	}

	@Override
	public String toString() {
		return "TimeZone [hr=" + hr + ", min=" + min + "]";
	}

	public static void main(String[] args) {
		TimeZone t1 = new TimeZone(4, 34);
		TimeZone t2 = new TimeZone(2, 45);
		TimeZone t3 = new TimeZone().add(t1, t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

	}
}
