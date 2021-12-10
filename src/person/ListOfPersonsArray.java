package person;

/**
 * The application shows a class dealing with a list of persons(objects of
 * the class Person) that manages the size of the array dynamically.
 * 
 * @author Cristina
 *
 */

public class ListOfPersonsArray {
	private Person[] aPerson;
	private int size;
	
	public ListOfPersonsArray() {
		aPerson = new Person[10];
		size = 0;
	}
	
	//add a person to the list of Persons in the last position
	public void add(Person x) {
		if (size == aPerson.length) {  //the array is full
			//create a new, bigger array and copy all elements
			Person[] a = new Person[aPerson.length*2];
			for(int i=0; i<aPerson.length; i++)
				a[i] = aPerson[i];
			aPerson = a;
		} 
	}

}
