/*Високосни години са всички години кратни на 4 с изключения
столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
но 1600 и 2000 са високосни.
Съставете програма, която по дадени ден, месец, година отпечатва
следващата дата.
Входни данни: три числа за ден, месец, година.
Пример: 28, 2, 2000
Изход: 1,3,2000
*/

import java.util.Scanner;

public class Task12 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int date,month,year;
		System.out.println("Input date,month and year : ");
		date=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		if(date<1 || month<1 || month>12 || date>31){
			
			System.out.println("Invalid date/month");
		}
		else if(month==2 && (!((year%4==0 && year%100!=0) || (year%400==0))) && date>28){
			System.out.println("Invalide date/month");
		}
		else if(month==2 && ((year%4==0 && year%100!=0) || (year%400==0)) && date>29){
			System.out.println("Invalid date/month");
			
		}
		else if((month==9 || month==4 || month==6 || month==11) && date>30){
			System.out.println("Invalid date/month");
		}
		else{
			if(month==2){
				if(date==28){
					if((year%4==0 && year%100!=0) || (year%400==0)){
						date++;
					}
					else{
						date=1;
						month++;
					}
				
				}
				else if(date==29){
					date=1;
					month++;
				}
			}
			else if((month==4 || month==6 || month==9 || month==11) && date==30){
				date=1;
				month++;
			}
			else if(date==31){
				if(month==12){
					date=1;
					month=1;
					year++;
				}
				else{
					date=1;
					month++;
				}
			}
			else{
				date++;
			}
			System.out.println(date + " " + month + " " + year);
			
		}
		
		sc.close();
	}

}