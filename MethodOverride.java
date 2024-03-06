class Parent
{
	void show()
	{
	System.out.println("It is parent class show");
	}
}

class Child extends Parent
{
	void show(){
	System.out.println("It is child class show");
	}
}

class MethodOverride
{
	public static void main(String[] args) {
		Child o=new Child();
		o.show();
		Parent p=new Parent();
		p.show();
	}
}