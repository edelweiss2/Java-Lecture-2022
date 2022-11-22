package java_과제1_김윤호;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;




public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		Employee employee1 = new Employee(133, "강자바", "부장", LocalDate.parse("2000-08-01"));
		Employee employee2 = new Employee(143, "은전기", "차장", LocalDate.parse("2003-01-01"));
		Employee employee3 = new Employee(163, "노전자", "과장", LocalDate.parse("2018-08-01"));
		Employee employee4 = new Employee(173, "권표준", "대리", LocalDate.parse("2022-01-01"));
		Employee employee5 = new Employee(213, "홍정부", "사원", LocalDate.parse("2019-01-01"));
		
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		set.add(employee4);
		set.add(employee5);
		System.out.println();
		
		set.add(new Employee(123, "김자바", "부장", LocalDate.parse("1998-01-01")));
		set.add(new Employee(163, "노전자", "사원", LocalDate.parse("2008-08-01")));
		
		System.out.println("사원 출력");
		Iterator it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
