package com.offcn.mapper;

import com.offcn.po.Phone;

public interface PhoneDAO {

	public Phone findByNumber(String number);
	
}
