package work;

public class Demo {

	public static void main(String[] args) {
		
		Person[] persons = new Person[10];
		persons[0] = new Person("Ivan Georgiev Georgiev" , 25,true);
		persons[1] = new Person("Vania Maneva Maneva",24,false);
		persons[2] = new Student("Georgi Ivanov Manev",22,true,4.5);
		persons[3] = new Student("Aleks Kostova Rasheva",21,false,5.20);
		persons[4] = new Employee("Krustio Ivanov Vanev", 30, true, 40);
		persons[5] = new Employee("Kostadin Angelov Vulev",17,true,20);
		for(int  i = 0; i < persons.length; i++){
			if(persons[i] != null){
				persons[i].getShow();
			}
		}
		for(int i = 0; i < persons.length; i++){
			if(persons[i] != null && persons[i] instanceof Employee){
				System.out.println((((Employee) persons[i]).calculateOvertime(2.00)));   
			}
			
		}
		/*
		 * И един въпрос, какво ще стане ако дефинирате конструктор без
параметри Student() в класа Student ??? Възможно ли е, и ако не защо.
Как може да се оправи това?

Отговор:Няма да бъде възможно компилирането,понеже за да се извика конструктор в даден клас наследник,трябва да се извика съответният
в base класът(constructor chaining).В случаят ако имплементираме default конструктор в Person	програмата няма да има проблем при компилацията	 */
	}

}
