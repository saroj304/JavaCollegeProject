package connection.java.model;

import java.sql.Date;

public class Form {
 private int id;
 private String fname;
 private String mname;
 private String lname;
 private String p_address;
 private String t_address;
 private String email;
 private String phone;
 private String username;
 private String password;
 private String gender;
 private Date dob;
 private String status;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getP_address() {
	return p_address;
}
public void setP_address(String p_address) {
	this.p_address = p_address;
}
public String getT_address() {
	return t_address;
}
public void setT_address(String t_address) {
	this.t_address = t_address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
 
}
