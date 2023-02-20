package com.hibernatepractical1.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	    @Id
	    @Column(name = "id")
	    private int id;

	    @Column(name = "roll_no")
	    private int rollNo;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "address")
	    private String address;

	    @Column(name = "phone_no")
	    private String phoneNo;

	    @Column(name = "degree")
	    private String degree;

		public Student() {
			
		}

		public Student(int id, int rollNo, String name, String address, String phoneNo, String degree) {
			this.id = id;
			this.rollNo = rollNo;
			this.name = name;
			this.address = address;
			this.phoneNo = phoneNo;
			this.degree = degree;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getDegree() {
			return degree;
		}

		public void setDegree(String degree) {
			this.degree = degree;
		}
		
	    
	    
	}
