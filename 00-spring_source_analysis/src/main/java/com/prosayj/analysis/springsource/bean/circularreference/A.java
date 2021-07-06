package com.prosayj.analysis.springsource.bean.circularreference;

/**
 * TODO
 *
 * @author yangjian
 * @date 2021-05-18
 */
public class A {
	private B b;

	public A(B b) {
		this.b = b;
	}

	public A() {
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				'}';
	}
}
