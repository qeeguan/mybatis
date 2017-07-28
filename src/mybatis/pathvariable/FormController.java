package mybatis.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	// 该方法映射的请求为http://localhost:8080/ModelAttributeTest/{formName}
	@RequestMapping(value = "/{formName}")
	public String loginForm(@PathVariable String formName) {
		// 动态跳转页面
		return formName;
	}
}
