package com.collections.arraylist;

/**
 * Hello world!
 *
 */
import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        CustomArrayList customarraylist=new CustomArrayList();
        System.out.println("Intializing with 10 Integers");
        customarraylist.adding(new Integer(1));
        customarraylist.adding(new Integer(2));
        customarraylist.adding(new Integer(3));
        customarraylist.adding(new Integer(4));
        customarraylist.adding(new Integer(5));
        customarraylist.adding(new Integer(6));
        customarraylist.adding(new Integer(7));
        customarraylist.adding(new Integer(8));
        customarraylist.adding(new Integer(9));
        customarraylist.adding(new Integer(10));
        System.out.println("All Elements in list after adding ");
        System.out.println(customarraylist);
        System.out.println("Enter how many elements you want to remove");
        int remove=sc.nextInt();
        for(int i=0;i<remove;i++)
        {
        	System.out.println("Enter the index you want to remove");
        	int n=sc.nextInt();
        	customarraylist.remove(n);
        }
        System.out.println("All the elements after removing elements ");
        System.out.println(customarraylist);
        System.out.println("Enter how many elements want to fetch ");
        int fetch=sc.nextInt();
        for(int i=0;i<fetch;i++)
        {
        	System.out.println("Enter the index you want to fetch");
        	int n=sc.nextInt();
        	customarraylist.fetching(n);
        }
        System.out.println("All elements in list after fetching ");
        System.out.println(customarraylist);
        System.out.println("Fetching");
        System.out.println("All elements in list are ");
        System.out.println(customarraylist);
        System.out.println("Number of elements in list are :"+customarraylist.size());
        
        
    }
}
