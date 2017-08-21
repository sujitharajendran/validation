package guviproject;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ip=sc.next();
		char ch=ip.charAt(0);
		int d=ip.indexOf('@');
		int lk=ip.indexOf('.');
		int ml=ip.indexOf(':');
		int count=0;
		int count2=0;
		if((ch>='a'&& ch<='z')||(ch>='A' &&ch<='B')||(Character.isDigit(ch))||(ch>=0 &&ch<=47)||(ch>=58 &&ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=127)){
			for(int i=d+1;i<lk;i++){
				char c1=ip.charAt(i);
				if((c1>='a' &&c1<='z') ||(c1>='A'&&c1<='z')){
					count++;
				}
			}
			if(count==4){
			for(int j=0;j<d;j++){
				char c2=ip.charAt(j);
				if((c2>='a' &&c2<='z') ||(c2>='A'&&c2<='z')){
					count2++;
				}
			}
			String s=ip.substring(ip.length()-3,ip.length());
			if(s.equals("com")){
				if(count2==3){
					System.out.println("valid");
			}	
			}
				else{
				System.out.println("invalid");
			}
			}	else{
				System.out.println("invalid");
			}
		}	else{
			System.out.println("invalid");
		}
		
			}
		}
