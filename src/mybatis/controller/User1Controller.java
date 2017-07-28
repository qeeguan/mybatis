package mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mybatis.domain.User;

@Controller
public class User1Controller {

	@ModelAttribute
	public void userModel(String loginname, String password, Model model) {
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		model.addAttribute("user", user);
	}

	@RequestMapping("/user1")
	public String login(Model model) {
		User user = (User) model.asMap().get("user");
		user.setUsername("User1Controller≤‚ ‘");
		System.out.println(user);
		return "user1controller";
	}
}
