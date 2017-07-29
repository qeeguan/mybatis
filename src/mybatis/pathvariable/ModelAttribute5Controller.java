package mybatis.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mybatis.domain.User;

@Controller
public class ModelAttribute5Controller {

	@ModelAttribute(value = "user")
	public User userModel5(@RequestParam("loginname") String loginname, @RequestParam("password") String password) {
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		return user;
	}

	@RequestMapping("/login5")
	public String login5(@ModelAttribute("user") User user) {
		user.setUsername("userGG");
		return "result5";
	}

}
