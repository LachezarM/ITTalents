import java.util.Scanner;

/*
 * Задача 18:
Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви
индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Да се изведе съдържанието и на трите масива
Пример:
18,19,32,1,3, 4, 5, 6, 7, 8
1, 2, 3,4,5,16,17,18,27,11
Изход:
18,19,32 ,4,5,16,17,18,27,11
 */
public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array lengths: ");
		int len1 = sc.nextInt();
		int len2 = sc.nextInt();
		int[] array1 = new int[len1];
		int[] array2 = new int[len2];
		System.out.println( "Inputting first array: ");
		for(int i = 0;i < array1.length;i++){
            System.out.println("Array[" + i + "]");
            array1[i] = sc.nextInt();
        }
        System.out.println("Inputting 2nd array: ");
        for(int i = 0;i < array2.length;i++){
            System.out.println("Array[" + i + "]");
            array2[i] = sc.nextInt();
        }
        if(len1 < len2){
            int tmp = len1;
            len1 = len2;
            len2 = tmp;
        }
        int[] array3 = new int[len2];
        for(int i = 0;i < array3.length;i++){
            if(array1[i] > array2[i]){
                array3[i] = array1[i];
            }
            else{
                array3[i] = array2[i];
            }
        }
        
        for(int i = 0;i < array1.length;i++){
            System.out.println("Array[" + i + "] = " + array1[i]);
        }
        System.out.println();
        
        for(int i = 0;i < array2.length;i++){
            System.out.println("Array[" + i + "] = " + array2[i]);
        }
        System.out.println();
        
        for(int i = 0;i < array3.length;i++){
            System.out.println("Array[" + i + "] = " +array3[i]);
         }
        sc.close();
		
	}
}
