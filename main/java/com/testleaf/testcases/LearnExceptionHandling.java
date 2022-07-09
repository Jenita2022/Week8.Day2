package com.testleaf.testcases;

public class LearnExceptionHandling {
	//Execute the code.If there is an exception, catch it and keep it in variable then print it or do some other actions to handle it.
	//Exceptions is the super class of all type of exceptions
	//If there are multiple lines of code in try block,
	//when 1st line gets exception then it will directly go to Catch block withou executing the next line in try block
	//If 1st line no exception but 2nd line gets exception, then catch that particular excep.
	//In case, if there is excep in all lines in try block, catch it separately and handle it.
	//
	public static void main(String[] args) {

		int a= 10;
		int b= 0;

		int[] arr = new int[3];
		arr[0]	= 12;
		arr[1]	= 30;
		arr[2]	= 54;


		//		try {
		//			System.out.println(a/b);
		//			System.out.println(arr[3]);
		//		}catch(Exception e) {
		//			System.out.println("ExceptionName: " +e); 
		//		}		
		//		System.out.println("Continue executing fruther line of codes");

		try {
			System.out.println(a/1);
			System.out.println(arr[3]);
		}catch	(ArithmeticException e) {
			System.out.println(e); 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}



