package department_management_system.com.app.driver;

import department_management_system.com.app.domain.AdminDepartment;
import department_management_system.com.app.domain.HrDepartment;
import department_management_system.com.app.domain.TechDepartment;

public class Driver {

	public static void main(String[] args) {

		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();

		printDepartment(adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		
		System.out.println();
		
		printDepartment(hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());

		System.out.println();

		printDepartment(techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());

	}
	
	public static void printDepartment(String dept) {
		System.out.println(" Welcome to" + dept);
	}

}
