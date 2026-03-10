package com.spring.actuator.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class MethodReferenceDemo {
	
public static void main(String[] args) {

		
		List<String> names= new ArrayList<>(Arrays.asList("prs%^@#^ad","","chau#@#$@%#han","mo@#%@unika","sha#%@#%nvi","",null));
		
		MyDataFormatter fd= new MyDataFormatter();
		
		
		/*-> Given a List of employees name given:
			--> Exclude the empety strings
			-->Remover special characters if ny
			-->convert to upper case
			-->sort it alphabetical order
			-->create Employee object
		*/
		
		List<Employee> employees=names.stream()
		//.filter(e-> StringUtils.isNoneEmpty(e))
		.filter(StringUtils::isNotEmpty) //method reference using a static method
		
		//.map(e->fd.removeSplChars(e)) //Method reference using an instance method
		.map(fd::removeSplChars)
		
		//.map(e->e.toUpperCase())
		.map(String::toUpperCase) //method reference using instance method but an arbitory object
		
		//.sorted((e1, e2)-> e1.compareTo(e2))
		.sorted(String::compareTo) //2 parameters 1 as target :: other as argument
		
		
		//.map(e-> new Employee(e))
		.map(Employee :: new) //method reference using constructor.
		
		
		
		
		//.forEach(e->System.out.println(e));
		//.forEach(System.out::println);   
		
		.toList(); //printing into list
		
		System.out.println(employees);
		
		
		
	}

}
