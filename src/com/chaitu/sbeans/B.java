package com.chaitu.sbeans;

public class B {

	private A a;

	public B() {
		System.out.println("B :: 0 param Constructor");
	}

	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [ getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", From object B" + "]";
	}

}
