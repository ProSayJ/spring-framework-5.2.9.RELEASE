package com.prosayj.analysis.springsource;

/**
 * ItBean
 *
 * @author yangjian
 * @date 2021-05-18
 */
public class ItBean {

	private MyBean myBean;

	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}

	/**
	 * 构造函数
	 */
	public ItBean(){
		System.out.println("ItBean 构造器...");
	}
}
