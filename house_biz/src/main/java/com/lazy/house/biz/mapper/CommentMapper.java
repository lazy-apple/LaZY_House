package com.lazy.house.biz.mapper;

import java.util.List;

import com.lazy.house.common.model.Comment;
import com.lazy.house.common.model.Community;
import com.lazy.house.common.model.House;
import com.lazy.house.common.model.UserMsg;
import com.lazy.house.common.page.PageParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CommentMapper {

  List<House> selectHouse(@Param("house") House query, @Param("pageParams") PageParams pageParams);

  Long selectHouseCount(@Param("house") House query);

  List<Community> selectCommunity(Community community);

  int insertUserMsg(UserMsg userMsg);

  int updateHouse(House house);

  int insert(Comment comment);

  List<Comment> selectComments(@Param("houseId") long houseId, @Param("size") int size);

  List<Comment> selectBlogComments(@Param("blogId") long blogId, @Param("size") int size);
  
}

