import cn.yunhe.entily.User;
import cn.yunhe.mapper.UserMapper;
import cn.yunhe.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserTest {
    @Test
    public void UserDemoTest() {
        //可以获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //得到会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口  基于动态代理形式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.findAll();
        list.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void addUser() {
        //可以获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //得到会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口  基于动态代理形式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAddress("郑州");
        user.setBirthday("2011-5-5");
        user.setSex("男");
        user.setUsername("任已虚");
        userMapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void update() {
        //获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //获取会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口，基于动态代理形式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAddress("zz");
        user.setBirthday("2011-11-11");
        user.setSex("男");
        user.setUsername("任已虚11");
        user.setId(53);
        mapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void UserDemoTest1() {
        //可以获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //得到会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口  基于动态代理形式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.findAllBy("任已虚", "郑州");
        list.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testUserFindLike() {
        //可以获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //得到会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口  基于动态代理形式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.findAllLike("任");
        list.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void addUser1() {
        //可以获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //得到会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口  基于动态代理形式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAddress("郑州");
        user.setBirthday("2011-5-5");
        user.setSex("男");
        user.setUsername("任已虚111222");
        userMapper.addUser1(user);
        System.out.println("刚刚插入的id为" + user.getId());
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testFindAllLikeSelect() {
        //可以获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //得到会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口  基于动态代理形式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("王");
        user.setSex("男");
        List<User> list = userMapper.findAllLikeSelect(user);
        list.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void update1() {
        //获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //获取会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口，基于动态代理形式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAddress("山东东营");

        user.setUsername("aaaabbbb");
        user.setId(56);
        mapper.updateUser1(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteAll1() {
        //获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //获取会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口，基于动态代理形式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,54,55,56);
        mapper.deleteAll(list);
        sqlSession.commit();
        sqlSession.close();
}
    @Test
    public void UserDemoTest2() {
        //可以获取会话工厂
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        //得到会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理接口  基于动态代理形式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,43,44,45);
        List<User> list1 = userMapper.findAll2(list);
        list1.forEach(System.out::println);
        sqlSession.close();
    }
}