package mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "hello!");
		mv.setViewName("/controller/index.jsp");
		return mv;
	}

	@RequestMapping(value = "/world")
	public ModelAndView world() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "world!");
		mv.setViewName("/controller/index.jsp");
		return mv;
	}
}
