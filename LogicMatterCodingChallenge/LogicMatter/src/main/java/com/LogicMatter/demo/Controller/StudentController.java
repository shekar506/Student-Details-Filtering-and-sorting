package com.LogicMatter.demo.Controller;

import com.LogicMatter.demo.Entity.Student;
import com.LogicMatter.demo.Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students=studentService.getAllStudents();
        return students;
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Student>> filterStudents(
            @RequestParam String subject,
            @RequestParam String condition,
            @RequestParam int value1,
            @RequestParam(required = false) Integer value2) {
        return ResponseEntity.ok(studentService.filterStudents(subject, condition, value1, value2));
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.addStudent(student));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}

