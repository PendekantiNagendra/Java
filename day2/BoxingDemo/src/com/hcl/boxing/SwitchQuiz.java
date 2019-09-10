package com.hcl.boxing;

public class SwitchQuiz {
	public void show(int x){
		switch(x){
		case 1:
			System.out.println("Hi 1");
			break;
		case 2:
			System.out.println("Bye 1");
			break;
		case 3:
			System.out.println("Hello 1");
			break;
		case 4:
			System.out.println("Test 4");
			break;
		case 5:
			System.out.println("Demo 5");
			break;
			default :
				System.out.println("Default");
		}
	}
	public static void main(String[] args) {
		SwitchQuiz obj=new SwitchQuiz();
		obj.show(4);
	}

}
