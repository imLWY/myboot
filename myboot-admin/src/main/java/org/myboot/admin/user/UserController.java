package org.myboot.admin.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("user")
public class UserController {

	
	@RequestMapping("userList")
	public ModelAndView userList(Model model){
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "我是姓名");
		model.addAttribute("user",map);
		
		return new ModelAndView("index","userModel",model);
	}
	
	
	
}
