package com.offcn.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.offcn.po.Phone;

@WebService
public interface PhoneService {
	@WebMethod
	public Phone findByNumber(String number);
}
