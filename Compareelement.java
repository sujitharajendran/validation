package guviproject;
import java.util.*;
public class Compareelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++){
	
			if(a[i]>a[i+1]){
				System.out.println(a[i+1]);
			}
			

			else if(a[i+1]>a[i]){
					System.out.println("-1");
			}
			
		}
		System.out.println("-1");
	}
	}
	


