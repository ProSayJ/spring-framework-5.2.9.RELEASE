package com.prosayj.basecode.thinkinginspring.overview.domain;

/**
 * 用户
 *
 * @author yangjian@bubi.cn
 * @date 2020-04-16 上午 02:08
 * @since 1.0.0
 */
public class User {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
