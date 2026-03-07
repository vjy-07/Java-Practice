class Employee{
	String empName;
	int empId;
	double empSalary;

	Employee(String empName, int empId, double empSalary){
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}

	static void display(Employee obj){

		System.out.println(obj.empName);
		System.out.println(obj.empId);
		System.out.println(obj.empSalary);
	}

	public static void main(String[] args){
		Employee emp1 = new Employee("Vijay",1 , 10000);
		Employee emp2 = new Employee("Kishore", 2, 15000);
		emp1.display(emp1);
		emp2.display(emp2);
	}
}
