package org.x;

public class f {

	private void jazz(String name) {
		System.out.println("kavi");
		
		System.out.println("THIS IS MY NAME :" +name);
	}
	public void java(int age) 
	{
		System.out.println("age of the person : "+age);

	}
	public void selenium(String name) 
	{
		System.out.println("age of the person : "+name);

	}
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		f fi= new f();
		fi.java(27);
		fi.selenium("jazz");
		fi.jazz("jazz");
	}
}
