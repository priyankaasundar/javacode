package myProject;
class sensitive
{
	private int age=34;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
public class Encapsulation 
{
public static void main(String[] args) 
{
	sensitive v=new sensitive();
	v.setAge(25);
	System.out.println(v.getAge());
}
}
