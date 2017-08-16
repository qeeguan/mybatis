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
		Person person = new Person("admin", "男", 26);
		// 返回执行SQL语句影响的行数
		int a = session.insert("mybatis.domain.PersonMapper.save", person);
		session.commit();
		session.close();

	}

}
