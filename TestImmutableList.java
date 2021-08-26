package com.techleads.app.test;

import java.util.ArrayList;
import java.util.List;
final public class TestImmutableList {
	@Override
	public String toString() {
		return "TestImmutable [name=" + name + ", connections=" + connections + "]";
	}




	final private String name;
	final private List<String> connections;
	
	

	public TestImmutableList(String name, List<String> connections) {
		super();
		this.name = name;
		List<String> cloned=new ArrayList<>();
		cloned.addAll(connections);
		this.connections = cloned;
	}

	


//	private TestImmutable(String name, List<String> connections) {
//		super();
//		this.name = name;
//		this.connections = connections;
//	}




	public String getName() {
		return name;
	}




	public List<String> getConnections() {
		List<String> cloned=new ArrayList<>();
		cloned.addAll(connections);
		return cloned;
	}




//	public List<String> getConnections() {
//		return connections;
//	}




	public static void main(String[] args) {
		List<String> c1=new ArrayList<>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		
		TestImmutableList t1=new TestImmutableList("teja", c1);
		
		System.out.println(t1);
		TestImmutableList t2=new TestImmutableList("teja", c1);
		c1.add("D");
		System.out.println(t2);

	}

}
