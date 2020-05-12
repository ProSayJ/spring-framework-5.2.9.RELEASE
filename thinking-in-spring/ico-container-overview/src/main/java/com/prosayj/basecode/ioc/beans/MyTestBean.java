package com.prosayj.basecode.ioc.beans;

/**
 * 自定义bean
 *
 * @author yangjian@bubi.cn
 * @date 2020-05-10 上午 12:28
 * @since 1.0.0
 */
public class MyTestBean {
	private String testStr;

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"testStr='" + testStr + '\'' +
				'}';
	}
}
