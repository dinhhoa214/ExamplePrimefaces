package com.asiantech.model;

import java.io.Serializable; 
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean; 
import javax.annotation.PostConstruct; 
import javax.faces.bean.ManagedProperty;
 

@ManagedBean(name="bank") 
public class BankBean implements Serializable{
	
	private String name;
	private Date modiferTime;
	private String status;
	private Boolean isPublic;  
	private Account account;
	private List<Account> accounts;
	
	@ManagedProperty("#{accountService}")
    private AccountService service;
	
	@PostConstruct
    public void init() {
        accounts = service.getAccounts();
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
		this.modiferTime = modiferTime;
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



	public Account getAccount() {
		return account;
	} 
	public void setAccount(Account account) {
		this.account = account;
	} 
	public List<Account> getAccounts() {
		return accounts;
	} 
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	} 
	public AccountService getService() {
		return service;
	} 
	public void setService(AccountService service) {
		this.service = service;
	}  
	public void addAccount() { 
		account = new Account(this.name,this.modiferTime,this.status,this.isPublic );
		accounts.add(account); 
	}
 
	public void deleteAccount(Account account){ 
		accounts.remove(account); 
	}
}
