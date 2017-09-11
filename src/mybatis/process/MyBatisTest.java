package mybatis.process;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.domain.Person;

public class MyBatisTest {
	/**
	 * 根据id查询Person
	 * 方法名和参数必须和XML中<select...>元素的id属性和parametertype属性一致
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		Person person = new Person("admin", "��", 26);
		// ����ִ��SQL���Ӱ�������
		int a = session.insert("mybatis.domain.PersonMapper.save", person);
		session.commit();
		session.close();

	}

}
