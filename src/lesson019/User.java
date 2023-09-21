package lesson019;

public class User{
	private int id;
	private String name;
	private int salary;
	private EGender egender;
	



	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public User(int id, String name, int salary, EGender egender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.egender = egender;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public EGender getEgender() {
		return egender;
	}



	public void setEgender(EGender egender) {
		this.egender = egender;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + ", egender=" + egender + "]";
	}



	public void bilgileriGoster() {
		System.out.println(toString());
	}


}
