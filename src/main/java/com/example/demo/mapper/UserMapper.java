package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.Dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ChuYang
 * @version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
