package com.asiantech.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.asiantech.model.Account;
@ManagedBean(name="accountService" )
@ApplicationScoped
public class AccountService {
	private List<Account> Accounts;
	 
	@PostConstruct
	public void init(){
		Accounts = new ArrayList<Account>();
        Accounts.add(new Account("Tran Thanh Tue", new Date("Fri May 15 15:44:36 CDT 2015"), "Dang su dung", true));
        Accounts.add(new Account("Phan Van Khiem", new Date("Tue May 12 00:00:00 CDT 2015"), "Tam khoa", true));
        Accounts.add(new Account("Duong Anh Duc", new Date("Wed May 13 04:00:00 CDT 2015"), "Het han", false));
        Accounts.add(new Account("Vu Ngoc Hai", new Date("Wed May 13 21:00:00 CDT 2015"), "Dang su dung", true)); 
    }
	public List<Account> getAccounts(){
		return Accounts;
	}
	
}
