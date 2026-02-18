package com.pw.ioi;


public class testing {

	public static void main(String[] args) {
		char [][] arr = null;
		
	    int n=10;
	    
		for(int k=0;k<5;k++) {
			
			int i=k;
			int j=k;
			n--;
			int m=k;

			
			
//			******* TOP ROW *******
			while(j<n) {
//				arr[i][j]='a';
				System.out.println("( "+i +" , "+j+" )");
				
				j++;
			}
			
//			******* RIGHT COLUMN *******
			while(i<n) {
//				arr[i][j]='a';
				System.out.println("( "+i +" , "+j+" )");
				i++;
			}
			
//			******* BOTTOM ROW *******
			while(j>m) {
//				arr[i][j]='a';
				System.out.println("( "+i +" , "+j+" )");
				j--;
			}
			
//			******* LEFT COLUMN *******
			while(i>m){
//				arr[i][j]='a';
				System.out.println("( "+i +" , "+j+" )");
				i--;
				
			}
			System.out.println("********ROUND "+(k+1)+" IS DONE **********");
		}
		

		


	}

}
