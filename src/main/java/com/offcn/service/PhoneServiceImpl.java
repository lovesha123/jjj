package com.offcn.service;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.offcn.mapper.PhoneDAO;
import com.offcn.po.Phone;

@Service
@WebService
public class PhoneServiceImpl implements PhoneService {

	@Resource
	PhoneDAO phoneDAO;
	
	@Override
	@WebMethod
	public Phone findByNumber(String number) {
		String num=number.substring(0,7);
		return phoneDAO.findByNumber(num);
	}

}
