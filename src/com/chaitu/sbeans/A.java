package com.chaitu.sbeans;

public class A {

	private B b;

	public A() {
		System.out.println("A :: 0 param Constructor");
	}

	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [ getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", From object A" + "]";
	}

}
