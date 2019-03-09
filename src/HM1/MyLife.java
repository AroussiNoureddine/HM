package HM1;

import java.util.Date;
public class MyLife 
		{
	         
	         public void wikeUp() {
	        	 System.out.println("Its Time To sike Up");
	        	 
	         }
	         
	         public void printDate() {
	        	 System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());
	        	 System.out.println();
	         }
	         public void printTime() {
	        	System.out.printf("%s  %tr", "Due time:", new Date());
	        	System.out.println();
	         }
	         public int add(int N1,int N2){
	        	 int Total =N1 + N2;	        	 
	        	 return Total;
	         }   
	         public int sub(int N1,int N2){
	        	 int Total =N1 - N2;	        	 
	        	 return Total;
	         } 
	         
	        
		}
