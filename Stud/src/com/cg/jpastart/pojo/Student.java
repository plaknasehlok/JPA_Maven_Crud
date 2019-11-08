package com.cg.jpastart.pojo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student implements Serializable{
	
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
    private String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
