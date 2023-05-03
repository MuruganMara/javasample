package org.ipt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrgmDemo {

	public static void main(String[] args) {
      
		
		
		
		int n = 14;
		 
		 for(int i=1; i<=10; i++){
		     System.out.println(n+"*"+i+ "="+n*i);
		 }
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Printing tables in output
//		
//	int	n= 10;
//	
//	
//	for (int i = 1; i <=10; i++) {
//		System.out.println(n +"*"+i + "="+ n*i);
//	}
//		
		
		
		
		
		
		
		
		
//		List<Integer>a = new LinkedList<>(Arrays.asList(10,20,30,40,40,50,10,50,60,70));
//		
//		Integer minVal = Collections.min(a);
//		
//		System.out.println(minVal);
//		Integer maxVal = Collections.max(a);
//		System.out.println(maxVal);
//	     Collections.reverse(a);
//	     
//	     for(Integer x : a) {
//	    	 System.out.println(x);
//	     }
//	     
//	     Set<Integer> z = new TreeSet<>(a);
//	     System.out.println(z);
//		List<Integer>aa = new LinkedList<>(z);
//		
//		Collections.reverse(aa);
//		
//		
//		
//		for (Integer s : aa) {
//			System.out.println(s);
//		}
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Practice Program 
		
//		int a[] = {12,12,23,34,56,67,78,78};
//		
//		
//		Set<Integer> li =new TreeSet<>(Arrays.asList(12,12,23,34,56,67,78,78));
//		System.out.println(li);
//		
//		List<Integer>l = new LinkedList<>();
//		l.add(10);
//		l.add(20);
//		l.add(40);
//		l.add(20);
//		l.add(50);
//		l.add(20);
//		l.add(90);
//		l.add(20);
//		
//		
//		System.out.println(l);
//		
//		Set<Integer> lk =new TreeSet<>(l);
//		
		
	
		
		
		
		
		
		//Program 9
		//Remove duplicate without Set
//		
//		Integer a[]= {11,22,33,44,55,44,33,22,11};
//		
//		List<Integer> l = new ArrayList<>(Arrays.asList(a));
//		List z= new LinkedList<>();
//		for(Integer i:l) {
//			
//			
//			if(!z.contains(i)){
//					z.add(i);
//					
//			}
//				}
//			System.out.println(z);
		
		
		
		
		
		//Program 8
//		to remove duplicate word using Set
		
//		
//		String s = "has, had, have, has, had, ha, ha, haaaa";
//		String[] res = s.split(" ");
//		Set<String>t = new HashSet<>();
//		 
//		for(String output: res) {
//			t.add(output);
//			
//		}
//		
//		System.out.println(t);
		
			
		
		
		//Program 7
		//To remove duplicates in string using Set
		
//		String s = "malayalam";
//		
//		
//		Set<Character>m = new LinkedHashSet<>();
//		
//		for(int i =0; i<s.length(); i++ ) {
//			char res = s.charAt(i);
//			m.add(res);
//		}
//		
//		System.out.println();
//		
	
		
		
		
		//Program 6
		//to remove duplicates in array by converting to set
		
//		
//		int a[] = {10, 10,23, 23, 45, 56, 78, 89};
//		
//		Set<Integer> s = new LinkedHashSet<>();
//		
//		for(int x : a) {
//		    s.add(x);
//		}
//		System.out.println(s);
//		
		    
		    
		    
		    
		    
		    
		    
		    
		    	
		
		
		
		
		
		
		
		//incomplete
//		
//		Integer b[] = {10, 23, 45, 56, 78, 89};
//		
//		
//         //List<int[]> res = ;
//		
//		List<Integer> li = new ArrayList<>(Arrays.asList(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Program 5
//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		
//		int res = 1;
//		 for (int i = 1; i <= num; i++) {
//			 res= res*i;
//			 			
//		}
//		System.out.println(res);
//		
//		
		
		
		
		
		//Program 4
//		
//		String s = "Raamayanam";
//     StringBuffer a = new StringBuffer(s);
//    StringBuffer res= a.reverse();
//    System.out.println(res);
//     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//Program 3 to remove duplicates using set
//	List<Integer> l = new ArrayList<>();
//	l.add(10);
//	l.add(30);
//	l.add(90);
//	l.add(90);
//	l.add(null);
//	l.add(10);
//	l.add(null);
//	l.add(30);
//	
//System.out.println(l);
//for(int i = 0; i<l.size(); i++) {
//     Integer list = l.get(i);
//		
//     System.out.println(list);	
//		
//}
//Set<Integer> s = new LinkedHashSet<>(l);
//
//System.out.println(s);
//		

		// program 2 to check difference between == and equals method
//		String s = "abcd";
//		String e = new String("abcd");
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(e));
//		System.out.println(s==e);
//		System.out.println(s.equals(e));
//		

		// program 1
//		String s = "*********";
//		//To print string in reverse order w/o pre-defined methos
//		
//		String result = " ";
//		
//		for (int i = s.length()-1; i>=0; i--) {
//			char rem = s.charAt(i);
//			result = rem+result;
//			
//			
//			
//		}
//		System.out.println(result);
//		

	}

}
