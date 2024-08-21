import java.util.Scanner;
public class CheckPrime {
    
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count=0,num=sc.nextInt();
		for(int i=1;i*i <=num;i++){
			if(num%i==0){ count++;
			if(num/i !=0)count++;}}
		 if(count==2) System.out.println("true");
		else  System.out.println("false");
}}

