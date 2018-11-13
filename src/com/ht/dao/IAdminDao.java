package com.ht.dao;

import com.ht.entity.Admin;
import com.ht.entity.Course;
import com.ht.entity.Student;
import com.ht.entity.StudyInfo;

import java.util.List;

/**
 * 功能描述:
 *
 * @Author ht
 * @Date 16/7/8.
 */
public interface IAdminDao {

    public Admin selectById(String id);

    public List<Student> selectAllStudents();

    public List<Course> selectAllCourses();

    public void updateStudent(Student student);

    public Student selectStuById(String id);

    public void addStudent(Student student);

    public void delStudent(String id);

    public void addCourse(Course course);

    public void delCourse(Integer id);

    public List<StudyInfo> selectAllStudyInfo();

    public void addStudyInfo(StudyInfo studyInfo);

    public void delStudyInfo(Integer id);

    public StudyInfo selectById(Integer id);

    public void delStudyInfoByCId(Integer id);

    public void delStudyInfoBySId(String id);
}
