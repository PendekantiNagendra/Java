package com.hcl.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FbCount")
public class FbCount { 
	
	private String fbvalue;
    private int count;
    
    @Id
    @Column(name="fbvalue")
	public String getFbvalue() {
		return fbvalue;
	}
	public void setFbvalue(String fbvalue) {
		this.fbvalue = fbvalue;
	}
	
	@Column(name="count")
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
