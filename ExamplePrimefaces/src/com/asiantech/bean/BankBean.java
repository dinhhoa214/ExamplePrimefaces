package com.asiantech.bean;

import java.io.Serializable; 
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean; 
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct; 
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.RowEditEvent;

import com.asiantech.model.Account; 
import com.asiantech.service.AccountService;
 

@ManagedBean(name="bank")
@ViewScoped
public class BankBean implements Serializable{
	
	 
	private static final long serialVersionUID = 1L;
	private String name;
	private Date modiferTime;
	private String status;
	private Boolean isPublic;  
	private Account account;
	private List<Account> accounts;
	private List<Account> accountsFiller;
	
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
	
	public List<Account> getAccountsFiller() {
		return accountsFiller;
	}



	public void setAccountsFiller(List<Account> accountsFiller) {
		this.accountsFiller = accountsFiller;
	}



	public void addAccount() { 
		account = new Account(this.name,this.modiferTime,this.status,this.isPublic );
		accounts.add(account); 
		FacesMessage msg = new FacesMessage("Account Added", (account.getName()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
	}
 
	public void deleteAccount(Account account){ 
		accounts.remove(account); 
		FacesMessage msg = new FacesMessage("Account Deleted", (account.getName()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Account Edited", ((Account) event.getObject()).getName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Account) event.getObject()).getName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    } 
 
}
