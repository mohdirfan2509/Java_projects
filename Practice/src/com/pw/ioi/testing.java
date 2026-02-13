package com.pw.ioi;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class testing {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		
		int [] arr = {2,3,2,4,4,4,3};
		
		for(int i=0;i<7;i++) {
			
		     hm.putIfAbsent(arr[i],0);
		     Integer x=hm.get(arr[i]);
		     hm.replace(arr[i], x, ++x);
		     
		     
		
			
			
//			if(hm.containsKey(arr[i])) {
//				
//				Integer x=hm.get(arr[i]);
//			
//				hm.replace(arr[i],x,++x);
//				
//				
//			}else {
//				hm.put(arr[i], 1);
//			
//			}
			
		}
		Iterable<Integer> arr2= hm.values();
		Object[] arr3=hm.values().toArray();
		System.out.println(arr3);
		
//		LinkedHashMap<Integer,Integer> lhm= new LinkedHashMap<Integer,Integer>();
//		
//		lhm.put(1, 2);
//		lhm.put(2, 4);
//		lhm.put(3, 6);
//		
//		System.out.println(lhm);
		
		

	}

}
