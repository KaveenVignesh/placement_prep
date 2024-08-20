import java.util.Scanner; 
public class Main { 	 
    	public static void main(String[] args) { 	
            	Scanner sc=new Scanner(System.in); 
                int x=sc.nextInt(), rev=0;
             while(x>0){          
                 int  r=x%10;     
                 x=x/10;  
                  rev=rev*10+r;
                }      
                  System.out.print(rev); 	
                } }