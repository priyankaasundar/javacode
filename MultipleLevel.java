package myProject;
interface Add1
{
	void sub();
}
interface Add2 
{
	void add();
}

public  class MultipleLevel implements Add2,Add1
{
public static void main(String[] args) 
{
	MultipleLevel m= new MultipleLevel();
	m.add();
}

public void add() {
	System.out.println("This is add");
	
}
public void sub() {
	System.out.println("This is sub");
	
}

}
