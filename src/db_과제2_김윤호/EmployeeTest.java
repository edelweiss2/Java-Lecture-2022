package db_과제2_김윤호;

import java.time.LocalDate;
import java.util.List;


public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
//		dao.createTable();
//		dao.insertEmployee(new Employee(133, "강자바", "부장", LocalDate.parse("2000-08-01")));
//		dao.insertEmployee(new Employee(143, "은전기", "차장", LocalDate.parse("2003-01-01")));
//		dao.insertEmployee(new Employee(163, "노전자", "과장", LocalDate.parse("2018-08-01")));
//		dao.insertEmployee(new Employee(173, "권표준", "대리", LocalDate.parse("2022-01-01")));
//		dao.insertEmployee(new Employee(213, "홍정부", "사원", LocalDate.parse("2019-01-01")));
	
		List<Employee> list = dao.printAllEmployee();
		for (Employee e : list) {
			System.out.println(e);
		}
	}

}
