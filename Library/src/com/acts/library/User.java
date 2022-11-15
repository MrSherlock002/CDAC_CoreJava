package com.acts.library;

public class User {
private int uid;
private String name;

public User(int uid, String name) {
	super();
	this.uid = uid;
	this.name = name;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String toString() {
	return "User [uid=" + uid + ", name=" + name + "]";
}

}
