public class Person	{
	private String first_name;
	private String last_name;
	private int age;
	private char gender;
	
	public static void main(String[] args)	{
		Person personA = new Person();
		System.out.println(personA);
		personA.talk("Howdy!");
		personA.walk(35, "north");
	}
	
	private Person()	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getFirst_name()	{
		return first_name;
	}
	
	public void setFirst_name(String first_name)	{
		this.first_name = first_name;
	}
	
	public String getLast_name()	{
		return last_name;
	}
	
	public void setLast_name(String last_name)	{
		this.last_name = last_name;
	}
	
	public int getAge()	{
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender()	{
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void talk(String message)	{
		System.out.println(message);
	}
	
	public void walk(int distance, String direction)	{
		System.out.println("You have walked " + distance + " meters " + direction + ".");
	}
	
	@Override
	public String toString()	{
		return "{ Name: " + first_name + " " + last_name + ", Age: " + age + ", Gender: " + gender + "}";
	}
}
