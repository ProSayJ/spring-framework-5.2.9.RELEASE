package com.prosayj.basecode.thinkinginspring.overview.domain;

import com.prosayj.basecode.thinkinginspring.overview.annotation.Super;

/**
 * 超级用户
 *
 * @author yangjian@bubi.cn
 * @date 2020-04-16 下午 03:20
 * @since 1.0.0
 */
@Super
public class SuperUser extends User {
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SuperUser{" +
				"address='" + address + '\'' +
				"} " + super.toString();
	}
}
