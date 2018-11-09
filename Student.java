public class Student{
	public String name;
	public String surname;

	private int age;

	@Transient
	public String realAddress;
	@Transient
	public String ipAddress;

	Student(String name,String surname,int age,String realAddress,String ipAddress){
	    this.name = name;
		this.surname = surname;
		this.age = age;
		this.realAddress = realAddress;
		this.ipAddress = ipAddress;
	}
}