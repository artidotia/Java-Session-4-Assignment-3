import java.util.Scanner;


public class Employee {
	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		Scanner sc = new Scanner(System.in);
		//get the employee details from the user
		System.out.println("Please enter the employee details");
		System.out.println("Employee Name: ");
		ed.seteName(sc.nextLine());
		System.out.println("Employee Age: ");
		int age = sc.nextInt();
		ed.seteAge(age);
		char gender;
		System.out.println("Employee Gender (M/F): ");
		gender = sc.next().charAt(0);
		ed.seteGender(gender);
		String addr;
		sc.nextLine();
		System.out.println("Employee Address: ");
		addr = sc.nextLine();
		ed.seteAddress(addr);
		String phone; 
		System.out.println("Employee Mobile Number: ");
		phone = sc.nextLine();
		ed.seteMobile(phone);
		
		System.out.println();
		System.out.println("Employee Details");
		System.out.println("Name: "  + ed.geteName());
		System.out.println("Address: "  + ed.geteAddress());
		System.out.println("Mobile Number: "  + ed.geteMobile());
		System.out.println("Age: "  + ed.geteAge());
		if (ed.geteGender() == 'M')
			System.out.println("Gender: Male");
		else 
			System.out.println("Gender: Female");
	}

}
