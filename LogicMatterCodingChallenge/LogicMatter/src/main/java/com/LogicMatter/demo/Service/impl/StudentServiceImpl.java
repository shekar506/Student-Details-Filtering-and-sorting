package com.LogicMatter.demo.Service.impl;

import com.LogicMatter.demo.Entity.Student;
import com.LogicMatter.demo.Repository.StudentRepository;
import com.LogicMatter.demo.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> filterStudents(String subject, String condition, int value1, Integer value2) {
        List<Student> students = studentRepository.findAll();
        List<Student> filteredStudents = new ArrayList<>();

        for (Student student : students) {
            int marks = 0;

            // getting the marks
            if ("english".equalsIgnoreCase(subject)) {
                marks = student.getEnglishMarks();
            } else if ("maths".equalsIgnoreCase(subject)) {
                marks = student.getMathMarks();
            } else if ("science".equalsIgnoreCase(subject)) {
                marks = student.getScienceMarks();
            } else if ("social science".equalsIgnoreCase(subject)) {
                marks = student.getSocialScienceMarks();
            }

            // filtering the condition
            boolean matchesCondition = false;
            if ("above".equalsIgnoreCase(condition)) {
                matchesCondition = marks > value1;
            } else if ("below".equalsIgnoreCase(condition)) {
                matchesCondition = marks < value1;
            } else if ("between".equalsIgnoreCase(condition) && value2 != null) {
                matchesCondition = marks >= value1 && marks <= value2;
            }

            if (matchesCondition) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

// deleting student from database
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

