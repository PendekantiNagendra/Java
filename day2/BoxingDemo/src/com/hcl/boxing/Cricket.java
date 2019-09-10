package com.hcl.boxing;

public class Cricket {
	static int score;
	public void incr(int x){
		score+=x;
	}
	public static void main(String[] args) {
		Cricket fb=new Cricket();
		Cricket sb=new Cricket();
		Cricket eb=new Cricket();
		
		fb.incr(67);
		sb.incr(23);
		eb.incr(45);
		
		System.out.println(Cricket.score);
	}

}
