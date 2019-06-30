package org.atmecs.apps;

import java.util.*;

public class Test {
	
	static Scanner scanner = new Scanner(System.in);
	Student s1 = new Student("amulu",1,100,"cse");
	Student s2 = new Student("vijju",34,50,"IT");
	Student s3 = new Student("chinnu",103,95,"ece");
	Student s4 = new Student("vijji",104,36,"cse");
	Student s5 = new Student("rajji",102,75,"It");
	Student s6 = new Student("maggi",105,60,"eee");
	Student s7 = new Student("padu",10,60,"eee");
	
	
	
	//Method to add objects into ArrayList
	public void arrayList(List<Student> list)
	{
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		System.out.println("Objects of ArrayList");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	//Method to add objects into LinkedList
	public void linkList(List<Student> list)
	{
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		System.out.println("Objects of LinkedList");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println("enter the choice:");
		System.out.println("1. Delete an object 2. Add an object ");
		int choice = scanner.nextInt();
		if(choice==1)
			deleteListObject(list);
		else 
			addListObject(list);
				
	}
	
	//Method to delete an object from the LinkedList
	public void deleteListObject(List<Student> list1)
	{
		list1.remove(s2);
		System.out.println();
		System.out.println("after removing");
		for(Student s:list1)
		{
			System.out.println(s);
		}
	}
	
	//Method to add an object to the LinkedList
	public void addListObject(List<Student> list2)
	{
		list2.add(s7);
		System.out.println();
		System.out.println("after adding");
		for(Student e:list2)
		{
			System.out.println(e);
		}
	}
	
	//Method to add objects into vector
	public void vector(List<Student> list)
	{
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		System.out.println("Objects of Vector");
		Enumeration<Student> enumeration = Collections.enumeration(list);
		while (enumeration.hasMoreElements()) 
			System.out.println(enumeration.nextElement()); 
	}
	
	public static void main(String[] args) 
	{
		Test test =  new Test();
		System.out.println("Enter the choice:");
		System.out.println("1. ArrayList  2. LinkedList  3. Vector");
		int choice=scanner.nextInt();
		switch(choice)
		{
			case 1: test.arrayList(new ArrayList<>());
					break;

			case 2: test.linkList(new LinkedList<>());
					break;

			case 3: test.vector(new Vector<>());
					break;

		    default: test.linkList(new LinkedList<>());
		    		 System.out.println("invalid choice");
		    		 break;

		}
		
	}
}
