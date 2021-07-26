package com.techleads.app;
/*Immutable class
 * 1. make your class final so that other classes cannot extend it
 * 2. Make all your fields final, so that they are initialized only once inside the constructor and never 
 *  modified afterward
 * 3. Don't expose setter methods
 * 4. when exposing methods which modify the state of the class, you must always return a new instance of the class
 * 5. If the class holds a mutable object:
 *  i) Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable
 *  field to the real instance passed through constructor, this is to prevent clients who pass the object from modifying
 *  it afterwards
 *  ii) Make sure to always return a clone copy of the field and never return the real object instance
 * 
 * 
 * 
 * 
 * */


final public class MyUser {
	private final  Integer id;
	private final  String name;
	private final Age age;

	

	public MyUser(Integer id, String name, Age age) {
		super();
		this.id = id;
		this.name = name;
		Age clonedAge=new Age();
		clonedAge.setDay(age.getDay());
		clonedAge.setMonth(age.getMonth());
		clonedAge.setYear(age.getYear());
		this.age=clonedAge;
		
	}



	public Integer getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public Age getAge() {
		Age clonedAge=new Age();
		clonedAge.setDay(this.age.getDay());
		clonedAge.setMonth(this.age.getMonth());
		clonedAge.setYear(this.age.getYear());
		return clonedAge;
	}



	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	

}
