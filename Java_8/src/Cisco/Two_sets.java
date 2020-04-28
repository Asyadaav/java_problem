package Cisco;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
	
		 public static int getTotalX(List<Integer> a, List<Integer> b) 
		    {
	       // Write your code here
	       int arr1[]=new int[a.size()];
	       int arr2[]=new int[b.size()];
	      for(int i=0;i<a.size();i++)
	     {
	      arr1[i]=a.get(i);
	      //System.out.println(arr1[i]);
	      }
	     for(int i=0;i<b.size();i++)
	       {
	        arr2[i]=b.get(i); 
	         //System.out.println(arr1[i]); 
	      }
	      Arrays.sort(arr1);
	       Arrays.sort(arr2);

	int lcm=0;
	int num1;
	int num2;
	int num3;

	if(arr1.length==3)
	{
	    num1=arr1[0];
	    num2=arr1[1];
	    num3=arr1[2];
	    lcm=((num1<num2)?(num1<num3?num1:num3):(num2<num3?num2:num3));
	   while(lcm%num1!=0 || lcm%num2!=0 || lcm%num3!=0)
	   {
	    lcm++;
	    }
	}
	   else if(arr1.length==2)
	   {
	        num1=arr1[0];
	       num2=arr1[1];
	        lcm=(num1<num2?num1:num2);
	       while(lcm%num1!=0 || lcm%num2!=0 )
	       {
	        lcm++;
	        }
	    }
	    else 
	    {
	        num1=arr1[0];
	        lcm=num1;
	    }
	    

	     int count=0;
	     int count1=0;
	      int j=1;
	     for(int i=lcm;i<=arr2[(arr2.length)-1];i=lcm*j)
	       // for(int i=4;i<=96;i=4*j)
	     {
	        int m=0;
	            
	        for(int k=0;k<arr2.length;k++)
	        {
	          if(arr2[k]%i==0)
	          {
	              count++;
	          }
	        }
	        count=count/arr2.length;
	        count1=count+count1;
	        j++; 
	          
	         
	     }
	      //return arr2[arr2.length-1];
	      return count1;
	    }

	}

	public class Two_sets {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int n = Integer.parseInt(firstMultipleInput[0]);

	        int m = Integer.parseInt(firstMultipleInput[1]);

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int total = Result.getTotalX(arr, brr);

	        bufferedWriter.write(String.valueOf(total));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

