package mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mybatis.domain.User;

@Controller
public class User2Controller {

	@ModelAttribute
	public void userModel(String loginname, String password, ModelMap modelmap) {
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		modelmap.addAttribute("user", user);
	}

	@RequestMapping("/user2")
	public String login(ModelMap modelmap) {
		User user = (User) modelmap.get("user");
		user.setUsername("User2Controller≤‚ ‘");
		System.out.println(user);
		return "user1controller";
	}
}
