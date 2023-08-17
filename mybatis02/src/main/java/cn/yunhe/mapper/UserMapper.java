package cn.yunhe.mapper;

import cn.yunhe.entily.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface UserMapper {
    List<User> findAll();

    void addUser(User user);
    void updateUser(User user);
    List<User> findAllBy(@Param("username")String username,@Param("address")String address);
    List<User> findAllLike(String username);
    void addUser1(User user);
    List<User> findAllLikeSelect(User user);
    void updateUser1(User user);
    void deleteAll(ArrayList<Integer> ids);
    List<User> findAll2(ArrayList<Integer> ids);
}
