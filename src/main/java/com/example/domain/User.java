package com.example.domain;

import java.sql.Date;

public class User {
	/**
	 * ユーザーid
	 */
	private Integer id;
	/**
	 * ユーザー名
	 */
	private String name;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * 権限
	 */
	private Integer authority;
	/**
	 * ？
	 */
	private String uuid;
	/**
	 * 登録日
	 */
	private Date registerDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAuthority() {
		return authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
}
