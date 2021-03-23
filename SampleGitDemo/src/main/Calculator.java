package main;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Hello! World");
		add(10,20);
	}
	
	public static void add(int num1, int num2){
		System.out.println(num1+num2);
	}
	
	public static void difference(int num1, int num2){
		System.out.println(num2-num1);
	}
	
	public static void prod(int num1, int num2){
		System.out.println(num1*num2);
	}
	

	public static void div(int num1, int num2){
		System.out.println(num1/num2);
	}
	
	public static void mod(int num1, int num2){
		System.out.println(num1%num2);
	}
	public static void square(int num){
		System.out.println(num*num);
	}
	
	public static void cube(int num){
		System.out.println(num*num*num);
	}
	
	public static void masterGreet(){
		System.out.println("master greets");
	}

}
