package com.example.week8a;

import java.util.List;
public interface StudentService {
 public List<Student> Display();
 public Student addStudent( Student st);
 public Student updateStudent(Student st);
 public void deleteStudent(int studentregno);
} 

