package mybatis.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import mybatis.domain.User;

@Controller
@SessionAttributes("user")
public class PathVariableTest {


	@RequestMapping("/login")
	public String login(@RequestParam String loginname, @RequestParam String password, Model model) {
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		user.setUsername("GG");
		model.addAttribute("user", user);
		return "welcome";
	}
}
