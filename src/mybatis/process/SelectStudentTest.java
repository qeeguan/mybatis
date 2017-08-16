package mybatis.process;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.domain.Student;

public class SelectStudentTest {

	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		List<Student> list = session.selectList("mybatis.domain.PersonMapper.selectStudent");
		for (Student student : list) {
			System.out.println(student.getName());
		}
		session.commit();
		session.close();
	}

}
