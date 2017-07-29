package mybatis.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttribute4Controller {

	@ModelAttribute(value = "loginname")
	@RequestMapping("/login4")
	public String login4() {
		return "admin";
	}

}
