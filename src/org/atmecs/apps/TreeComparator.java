package org.atmecs.apps;

import java.util.*;

public class TreeComparator implements Comparator<StudentDataBase>
{
	public int compare(StudentDataBase student1, StudentDataBase student2) 
	{
		return student1.studName.compareTo(student2.studName);
	}

}
