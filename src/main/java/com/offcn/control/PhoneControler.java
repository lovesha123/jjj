package com.offcn.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.offcn.po.Phone;
import com.offcn.service.PhoneService;

@Controller
public class PhoneControler {

	@Resource
	PhoneService phoneService;
	
	@RequestMapping(value="/getphone")
	public String getPhoneByNumber(Model model,@RequestParam(value="number") String number){
		Phone phone=phoneService.findByNumber(number);
		
		if(phone!=null){
			model.addAttribute("msg", number+":����  "+phone.getArea()+"--"+phone.getType());
		}else{
			model.addAttribute("msg", number+":�����ںŶο���ʱ������");
			
		}
		
		return "phone";
		
		
	}
}
