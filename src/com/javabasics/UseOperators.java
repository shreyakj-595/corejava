package com.javabasics;

public class UseOperators {
	public static void main(String[] args) {
		int a=3;
//		post increment:use value first then change in memory
		System.out.println(a++);
		System.out.println(a);
		int b=4;
		int c=b--;
		System.out.println(b);
		System.out.println("c:"+c);
//		chech a member is visible by both 3 & 4
		System.out.println(3==0);
		System.out.println(3!=4);
		System.out.println(3!=3);
		System.out.println("====================");
		System.out.println("logical operators");
		System.out.println("AND (&&)");
		System.out.println(true&&true&&false);
		System.out.println(true&&true&&true);
		System.out.println(false&&true);
		System.out.println("==================");
		System.out.println("OR (||)===");
		System.out.println(false||true||false);
		System.out.println(true||false);
		System.out.println(false||false);
		System.out.println("==============");
		int n=10;
//		divisibility is checked by (reminder==0) hint(%)
		System.out.println(n % 3==0 && n % 4==0);
		System.out.println("==========================");
		System.out.println("eligibility for marriage");
		System.out.println("age: 22 to 32");
		int age=21;
		System.out.println(age >= 22 && age <= 32);
		System.out.println("=========================");
		
	}

}
