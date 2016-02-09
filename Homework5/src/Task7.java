import java.util.Scanner;

/*
 * Задача 7:
Да се състави програма, която чете набор от думи разделени с
интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа
 */
public class Task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input sentance: ");
		int wordCount = 0;
		int countMax = 0;
		int countCurr = 0;
		String text = sc.nextLine();
		for(int i = 0;i < text.length();i++){
			
			if(text.charAt(i) == ' ' || i == text.length()-1){
				if(i != 0 && text.charAt(i-1) != ' '){
					wordCount++;
				}
				if(text.charAt(i) != ' '){
					countCurr++;
				}
				if(countCurr > countMax){
					countMax = countCurr;
				}
				countCurr = 0;
			}
			else{
				countCurr++;
			}
			
			
		}
		
		
		System.out.println(wordCount + " words " + " Longest word :" + countMax + " symbols");
		sc.close();
	}

}
