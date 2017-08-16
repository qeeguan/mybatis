package mybatis.process;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.domain.Person;

public class MyBatisTest {

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
