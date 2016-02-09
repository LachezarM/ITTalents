/*
 * Задача 5:
Да се състави програма, чрез която се въвеждат 2 редици от знаци
(думи).
Ако в двете редици участва един и същи знак, да се изведе на екрана
първата редица хоризонтално, а втората вертикално, така че да се
пресичат в общия си знак.
Ако редиците нямат общ знак да се изведе само уведомително
съобщение.
Пример :
м
а
шапка
и
н
а

 */
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input two words: ");
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		int rows = word1.length();
		int cows = word2.length();
		char[][] mergeWords = new char[rows][cows];
		int cowWord1 = 0;
		int rowWord2 = 0;
		boolean isFound = false;
		for(int i = 0;i < word2.length();i++){
			for(int j = 0;j < word1.length();j++){
				if(word1.charAt(j) == word2.charAt(i)){
					cowWord1 = i;
					rowWord2 = j;
					isFound = true;
					break;
				}
			}
			if(isFound){
				break;
			}
		}
		for(int k = 0;k < word1.length();k++){
			mergeWords[k][cowWord1] = word1.charAt(k);
		}
		for(int k = 0;k < word2.length();k++){
			mergeWords[rowWord2][k] = word2.charAt(k);
		}
		for(int i = 0;i < mergeWords.length;i++){
			for(int j = 0;j < mergeWords[i].length;j++){
				System.out.print(mergeWords[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
