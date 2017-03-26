package com.felipe.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {
	
	@RequestMapping("irHola")
	public ModelAndView irHola() {
		ModelAndView mv = new ModelAndView("hola","mensagem","OI HEHEHE");
		return mv;
	}
}
