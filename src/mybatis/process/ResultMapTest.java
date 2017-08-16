package mybatis.process;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.domain.Person;

public class ResultMapTest {

	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		List<Person> list = session.selectList("mybatis.domain.PersonMapper.select");
		for (Person person : list) {
			System.out.println(person.getName());
		}
		session.commit();
		session.close();
	}

}
