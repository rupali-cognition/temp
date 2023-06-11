package com.grocery.dealer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DealerModel {
	
	@JsonIgnore
	 private int dealerid;
	    private String fname;
	    private String lname;
	    private String mobile;
	    private String email;
	    private String adhaarno;
	    private String panno;
	    private String address;
	    private String pincode;
	    private String accountno;
	    private String username;
	    private String password;
	    @JsonIgnore
	    private int roleid;
	    
	    private String rolename;
		public String getRolename() {
			return rolename;
		}
		public void setRolename(String rolename) {
			this.rolename = rolename;
		}
		public int getDealerid() {
			return dealerid;
		}
		public void setDealerid(int dealerid) {
			this.dealerid = dealerid;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAdhaarno() {
			return adhaarno;
		}
		public void setAdhaarno(String adhaarno) {
			this.adhaarno = adhaarno;
		}
		public String getPanno() {
			return panno;
		}
		public void setPanno(String panno) {
			this.panno = panno;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getAccountno() {
			return accountno;
		}
		public void setAccountno(String accountno) {
			this.accountno = accountno;
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
		public int getRoleid() {
			return roleid;
		}
		public void setRoleid(int roleid) {
			this.roleid = roleid;
		}
	    
	    
		
}
