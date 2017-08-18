package mybatis;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static SqlSessionFactory sqlSessionFactory;
	
	static{
		try {
			String str = "mybatis/config.xml";
			InputStream is = Resources.getResourceAsStream(str);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSqlSession(boolean autocommit){
		return sqlSessionFactory.openSession(autocommit);
	}
}
