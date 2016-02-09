/*адача 13:
Да се състави програма, която да отгатне колко е студено/топло по
въведената температура t в градус Целзий.
Температурните интервали са:
под -20 ледено студено;
между 0 и -20 - студено;
между 15 и 0 - хладно;
между 25 и 15 - топло;
над 25 – горещо.
Входни данни: цяло число от интервала [-100..100].
Пример: 12
Изход: хладно*/
import java.util.Scanner;

public class Task13 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the temperature");
		int a=sc.nextInt();
		if(a<-100 || a>100){
			System.out.println("Not valid");
		}
		else{
			if(a<-20){
				System.out.println("ледено студено");
			}
			else if(a<0 && a>=-20){
				System.out.println("студено");
			}
			else if(a>=0 && a<15){
				System.out.println("хладно");
			}
			else if(a>=15 && a<25){
				System.out.println("топло");
			}
			else{
				System.out.println("горещо");
			}
		}
		sc.close();
	}

}
