package com.hcl.hotel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	private String bookId;
	private String roomId;
	private String custName;
	private String city;
	private Date bookDate;
	private Date chkDate;
	
	@Id
	@Column(name="bookId")
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		bookId = bookId;
	}
	
	@Column(name="roomId")
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		roomId = roomId;
	}
	
	@Column(name="custName")
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		custName = custName;
	}
	
	@Column(name="city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	
	@Column(name="bookDate")
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		bookDate = bookDate;
	}
	
	@Column(name="chkDate")
	public Date getChkDate() {
		return chkDate;
	}
	public void setChkDate(Date chkDate) {
		chkDate = chkDate;
	}
	
}
