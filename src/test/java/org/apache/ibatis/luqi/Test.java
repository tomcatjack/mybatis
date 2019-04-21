package org.apache.ibatis.luqi;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class Test {

  public static void main(String[] args) throws Exception{
    String resource = "resources\\mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory =
        new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session = sqlSessionFactory.openSession();
    try {
      Course course = session.selectOne(
          "luqi.selectCourse", 1);
      System.out.println("course:"+course.toString());
    } finally {
      session.close();
    }
  }

}
