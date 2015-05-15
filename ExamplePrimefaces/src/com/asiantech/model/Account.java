package com.asiantech.model;
 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class Account{
	
	
	private String name;
	private Date modiferTime;
	private String status;
	private Boolean isPublic;
	public Account(String Name, Date ModiferTime, String Status, Boolean IsPublic){
		this.name = Name;
		
		this.modiferTime = ModiferTime;
		this.status = Status;
		this.isPublic = IsPublic;
	}
	public Account(String Name){
		this.name = Name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getModiferTime() {
		return modiferTime;
	}
	public void setModiferTime(Date modiferTime) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.print(dateFormat);
		   //get current date time with Date()
		   Date date = new Date();
		this.modiferTime = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}
	
}
