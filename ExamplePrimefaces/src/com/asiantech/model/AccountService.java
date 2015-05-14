package com.asiantech.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
@ManagedBean(name="accountService" )
@ApplicationScoped
public class AccountService {
	private List<Account> Accounts;
	 
	@PostConstruct
	public void init(){
		Accounts = new ArrayList<Account>();
        Accounts.add(new Account("Th Tue", new Date("Fri May 13 09:51:52 CDT 2015"), "Dang SD", true));
        Accounts.add(new Account("Kh Khiem", new Date("Fri May 13 09:51:52 CDT 2015"), "Tam khoa", true));
        Accounts.add(new Account("Th Duc", new Date("Fri May 13 09:51:52 CDT 2015"), "Het han", false));
        Accounts.add(new Account("Vu Hai", new Date("Fri May 13 09:51:52 CDT 2015"), "Dang SD", true)); 
    }
	public List<Account> getAccounts(){
		return Accounts;
	}
	
}
