package com.hq.bean;

import java.util.Date;

public class SysMaster {
	//表字段的描述
	private String sys_id;
	private String account;
	private String password;
	private String name;
	private String sex;
	private Date enter_time;
	
	
	public SysMaster(String sys_id, String account, String password, String name, String sex, Date enter_time) {
		
		this.sys_id = sys_id;
		this.account = account;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.enter_time = enter_time;
	}
	public SysMaster() {
	
	}
	//提供 get   set 
	public String getSys_id() {
		return sys_id;
	}
	public void setSys_id(String sys_id) {
		this.sys_id = sys_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getEnter_time() {
		return enter_time;
	}
	public void setEnter_time(Date enter_time) {
		this.enter_time = enter_time;
	}
	@Override
	public String toString() {
		return "SysMaster [sys_id=" + sys_id + ", account=" + account + ", password=" + password + ", name=" + name
				+ ", sex=" + sex + ", enter_time=" + enter_time + "]";
	}
	
	

	
	

}
