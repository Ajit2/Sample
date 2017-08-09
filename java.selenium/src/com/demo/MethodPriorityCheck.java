package com.demo;

public class MethodPriorityCheck {
	
	
	void m1(int i){
		System.out.println("m1 of premtve int ");   //1
	}
	void m1(long i){
		System.out.println("m1 of premtve long");   //2
	}
	void m1(Integer i) {
		System.out.println("m1 of wrapper int");    //3
	}
	void m1(Long i) {
		System.out.println("m1 of wrapper Long");   /*Compile Time error parsing and 
														autoBoxing not possible at a time*/
	}
	
	
	
	
	void m2(Integer i,Integer j) {
		System.out.println("m2 of Wrapper Integer");   //2
	}
	void m2(Double i,Double j) {
		System.out.println("m2 of Wrapper Double");  //Compile Time Error
	}
	void m2(int i,int j) {
		System.out.println("m2 of premtve int");   //1
	}
	void m2(double i,Double j) {
		System.out.println("m2 of premtve ");  //Compile Time Error
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPriorityCheck mpc= new MethodPriorityCheck();
		mpc.m1(10);
		mpc.m2(20,30);

	}

}
