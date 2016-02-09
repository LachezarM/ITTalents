import java.util.Scanner;

/*
 * Задача 14:
Да се състави метод, който приема за стойност число N и връща
стойността на N! (N факториел).

 */
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int n = sc.nextInt();
		System.out.println(fact(n));
		sc.close();
	}
	static int fact(int n){
		if(n == 0){
			return 1;
		}
		return n * fact(n-1);
		
	}

}
