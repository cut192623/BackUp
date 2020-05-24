package test.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
    private static SqlSessionFactory factory = null;
    //保存sqlSession的线程局部变量
    private static ThreadLocal<SqlSession> threadlocal = new ThreadLocal<SqlSession>();

    static {
        //初始化工厂
        factory = new SqlSessionFactoryBuilder().
                        build(MyBatisUtil.class.
                                getClassLoader().
                                getResourceAsStream("mybatis.xml"));


    }

    //    获得当前进程中的SqlSession
    public static SqlSession getsession() {
//        读取当前线程中的SqlSession
        SqlSession sqlSession = threadlocal.get();
        if (sqlSession == null) {
//            如果为空，就创建SqlSession
            sqlSession = factory.openSession();
//            保存在当前线程中
            threadlocal.set(sqlSession);

        }
        return sqlSession;
    }

    public static void closesession() {

        //读取当前线程中的SqlSession
        SqlSession sqlSession = threadlocal.get();
        if (sqlSession != null) {
//            如果为空，就关闭SqlSession
            sqlSession.close();
            sqlSession = null;
//            线程局部变量中的SqlSession设置为null
            threadlocal.set(null);

        }
    }
}