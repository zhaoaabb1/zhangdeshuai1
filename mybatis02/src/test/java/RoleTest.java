import cn.yunhe.entily.Role;
import cn.yunhe.mapper.RoleMapper;
import cn.yunhe.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class RoleTest {
    @Test
    public void testFindAll(){
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> all = mapper.findAll();
        all.forEach(System.out::println);

    }
}
