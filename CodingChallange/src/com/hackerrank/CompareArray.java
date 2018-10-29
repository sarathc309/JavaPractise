package com.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CompareArray {

	  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	        
	        int size=a.size();
	        int ai[]= new int[size];
	        int bi[]= new int[size];
	        int aa=0,bb=0; 
	        List<Integer> result= new ArrayList<Integer>();
	        
	       
	    for(int i=0;i<size;i++)
	        {
	            ai[i]=a.get(i);
	            bi[i]=b.get(i);
	            
	            if(ai[i]> bi[i])
	            {
	            	aa++;
	            	
	            }
	            
	            else if(ai[i]<bi[i])
	            {
	            	bb++;
	            }
	            
	           }
	        
	        result.add(aa);
	        result.add(bb);
			return result;
	        
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println((2/4));
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
		
		
		
		
		

	}

}
