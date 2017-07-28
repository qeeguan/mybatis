package mybatis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mybatis.domain.User;

@Controller
@RequestMapping(value = "/user")
public class User4Controller {

	private static List<User> list;

	public User4Controller() {
		list = new ArrayList<User>();
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm() {
		return "registerForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
			@RequestParam("username") String username) {
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		user.setUsername(username);
		list.add(user);
		return "loginForm";
	}

	@RequestMapping("/login")
	public String login(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
			Model model) {
		for (User user : list) {
			if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)) {
				model.addAttribute("user", user);
				return "welcome";
			}
		}
		return "loginForm";
	}
}
