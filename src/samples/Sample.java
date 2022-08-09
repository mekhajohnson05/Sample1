package samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class Student{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return id+" "+name+" "+age;
	}
}

public class Sample {
	public static void display(List<?> x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			List<Integer> li=new ArrayList<Integer>();
			li.add(100);
			li.add(200);
			List<String> li2=new ArrayList<String>();
			li2.add("100.5f");
			li2.add("100.5f");
			li2.add("100.5f");
			li2.add("100.5f");
			Sample.display(li);
			Sample.display(li2);
			
			
		
		System.out.println("success");

	}
}
