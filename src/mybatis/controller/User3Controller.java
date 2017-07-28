package mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mybatis.domain.User;

@Controller
public class User3Controller {

	@ModelAttribute
	public void userModel(String loginname, String password, ModelAndView mv) {
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		mv.addObject("user", user);
	}

	@RequestMapping("/user3")
	public ModelAndView login(ModelAndView mv) {
		User user = (User) mv.getModel().get("user");
		user.setUsername("User3Controller≤‚ ‘");
		System.out.println(user);
		mv.setViewName("user1controller");
		return mv;
	}
}
