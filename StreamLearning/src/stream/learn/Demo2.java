package stream.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Person> list= populateList();
		
		System.out.println("--------Obtain ids of all the persons from the US (using filter +map+forEach methords )-------------");
		list.stream().filter(person -> person.getCountry().equals("US")).map(person -> person.getId()+" : "+person.getCountry()).forEach(System.out::println);

		System.out.println("--------Obtain ids of all the persons not from the US (using filter +map+forEach methords )-------------");
		list.stream().filter(person -> !person.getCountry().equals("US")).map(person -> person.getId()+" : "+person.getCountry()).forEach(System.out::println);

		System.out.println("--------using <A> A[] toArray(IntFunction<A[]> generator) methord -------------");
		Person[] person =list.stream().toArray(Person[]::new);
		Arrays.asList(person).stream().forEach(System.out::println);

		System.out.println("--------using Object[] toArray() methord -------------");
		Object[] object =list.stream().toArray();
		Arrays.asList(object).stream().forEach(System.out::println);
	}
	
	private static List<Person> populateList(){
		List<Person> person = new ArrayList<>();
		person.addAll(Arrays.asList(new Person("person1","IND"),
									new Person("person2","US"),
									new Person("person3","US"),
									new Person("person4","PAK"),
									new Person("person5","IND"),
									new Person("person6","US")));
		return person;
		
	}

}
