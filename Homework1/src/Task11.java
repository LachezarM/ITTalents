/*Задача 11:
Съставете програма, която по дадено трицифренo число проверява
дали числото се дели на всяка своя цифра. Във въведеното число да
няма цифра 0.*/
import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Input 3 digits number without 0 in it : (I will know if u don't ;)  )");
		a=sc.nextInt();
		if(a%100/10==0 || a%10==0){
			System.out.println("Not going to happen !");
		}
		else{
			if(a%(a%10)==0 && a%((a%100)/10)==0 && a%(a/10)/10==0 ){
				System.out.println("The number is divisible by all his digits ");
			}
			else{
				System.out.println("Its not divisible by all his digits");
			}
		}
		sc.close();
	}

}