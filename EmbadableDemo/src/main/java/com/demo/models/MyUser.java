package com.demo.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Myuser121")

public class MyUser {
	@Id
	private int uid;
	private String uname;
	@Embedded
	private Address addr;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public MyUser() {
		super();
	}

	public MyUser(int uid, String uname, Address addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [uid=" + uid + ", uname=" + uname + ", addr=" + addr + "]";
	}

}
