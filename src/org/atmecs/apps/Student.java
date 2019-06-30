package org.atmecs.apps;

public class Student {
	
	String stuName;
	int stuId;
	double stumarks;
	String stuBranch;
	int count = 1;
	
	Student(String stuName,int stuId,double stumarks,String stuBranch)
	{
		this.stuName = stuName;
		this.stuId= stuId;
		this.stumarks = stumarks;
		this.stuBranch = stuBranch;
	}
	
	
	public String toString()
	{
		return this.stuName+"  "+this.stuId+"  "+this.stumarks+"  "+this.stuBranch;
	}
}
