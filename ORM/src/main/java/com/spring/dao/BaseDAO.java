package com.spring.dao;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * (基本)通用DAO接口
 * @param <T>
 */
public interface BaseDAO<T> extends Mapper<T>, MySqlMapper<T> {
}
