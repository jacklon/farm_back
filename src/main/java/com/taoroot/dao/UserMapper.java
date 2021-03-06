package com.taoroot.dao;

import com.taoroot.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String name);

    int checkEmail(String email);

    int checkPhone(String email);

    int selectRole(int userId);

    int selectStatus(int userId);

    User selectLogin(@Param("username") String username, @Param("password") String password);

    List<User> selectList();

    List<User> search(String str);

    int getNewUserCountByWeek(int type);
}