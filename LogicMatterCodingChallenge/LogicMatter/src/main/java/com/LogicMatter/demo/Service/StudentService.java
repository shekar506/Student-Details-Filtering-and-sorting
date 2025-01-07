package com.LogicMatter.demo.Service;


import com.LogicMatter.demo.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    List<Student> filterStudents(String subject, String condition, int value1, Integer value2);
    Student addStudent(Student student);
    void deleteStudent(Long id);
}

