package com.prosayj.analysis.springsource.bean.circularreference;

/**
 * TODO
 *
 * @author yangjian
 * @date 2021-05-18
 */
public class B {
	private A a;

	public B() {
	}

	public B(A a) {
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B{" +
				"a=" + a +
				'}';
	}
}
