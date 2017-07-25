package stream.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		List<Person> list= populateList();
		
		System.out.println("-------- Obtain US and non US based persons usin partitioninBY and groupingBy -------------");
		System.out.println(list.stream().collect(Collectors.partitioningBy(person -> person.getCountry().equals("US"))));
		System.out.println(list.stream().collect(Collectors.groupingBy(person -> person.getCountry().equals("US"))));
		
		System.out.println("-------- Count US and non US based persons usin partitioninBY and groupingBy -------------");
		System.out.println(list.stream().collect(Collectors.partitioningBy(person -> person.getCountry().equals("US"),Collectors.counting())));
		System.out.println(list.stream().collect(Collectors.groupingBy(person -> person.getCountry().equals("US"),Collectors.counting())));
		
		System.out.println("-------- Obtain the person in each country and count them using groupingBy -------------");
		System.out.println(list.stream().collect(Collectors.groupingBy(person -> person.getCountry())));
		System.out.println(list.stream().collect(Collectors.groupingBy(person -> person.getCountry(),Collectors.counting())));
		System.out.println("-------- Obtain US and non US based persons usin partitioninBy and map names to upercase using mapping -------------");
		System.out.println(list.stream().collect(Collectors.partitioningBy(person -> person.getCountry().equals("US"),Collectors.mapping(person -> person.getId().toUpperCase(), Collectors.toList()))));
		System.out.println("-------- Obtain the person in each country and count them using groupingBy and map names to upercase using mapping -------------");
		System.out.println(list.stream().collect(Collectors.groupingBy(person -> person.getCountry(),Collectors.mapping(person -> person.getId().toUpperCase(), Collectors.toList()))));
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
