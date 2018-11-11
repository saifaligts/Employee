
public class Employee {

	private String name;
	private double salary;
	private int age;
	private String designation;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public String getDesignation() {
		return designation;
	}
	
	public int paybonus(double salary) {
		if(salary < 5000)
			return 100;
		return 0;
	}
	
	public static void main(String[] args) {
		Employee empObj1 = new Employee();
		
		empObj1.setName("Jasmine");
		empObj1.setSalary(4000);
		empObj1.setAge(24);
		empObj1.setDesignation("Scientist");
		
		System.out.println("Hello " + empObj1.getName());
        System.out.println(empObj1.getSalary());
        System.out.println(empObj1.getAge());
        System.out.println(empObj1.getDesignation());
        System.out.println(empObj1.paybonus(empObj1.getSalary()));
	}

}
