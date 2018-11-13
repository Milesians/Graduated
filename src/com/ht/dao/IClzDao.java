package com.ht.dao;

import com.ht.entity.Course;

import java.util.List;

/**
 * 功能描述:
 *
 * @Author ht
 * @Date 16/7/6.
 */
public interface IClzDao {

    public List<Course> selectAll();

    public Course selectById(Integer id);

    public void update(Course course);


}
