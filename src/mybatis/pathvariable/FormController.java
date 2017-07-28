package mybatis.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	// �÷���ӳ�������Ϊhttp://localhost:8080/ModelAttributeTest/{formName}
	@RequestMapping(value = "/{formName}")
	public String loginForm(@PathVariable String formName) {
		// ��̬��תҳ��
		return formName;
	}
}
