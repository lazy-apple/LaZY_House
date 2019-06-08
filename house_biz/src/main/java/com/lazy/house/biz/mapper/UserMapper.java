package com.lazy.house.biz.mapper;


import com.lazy.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author LaZY(李志一)
 * @create 2019-06-05 21:48
 */
@Mapper
public interface UserMapper {

    public List<User> selectUsers();

}
