package com.hcl.hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class Room {
	private String roomId;
	private String type;
	private String status;
	private int costPerDay;
	
	@Id
	@Column(name="roomId")
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		roomId = roomId;
	}
	
	@Column(name="type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		type = type;
	}
	
	@Column(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		status = status;
	}
	
	@Column(name="costPerDay")
	public int getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(int costPerDay) {
		costPerDay = costPerDay;
	}

}
