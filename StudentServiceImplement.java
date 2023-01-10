package com.example.week8a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImplement implements StudentService {
@Autowired
private final StudentDao StudentDao;
StudentServiceImplement(StudentDao studentDao) {
this.StudentDao = studentDao;
}@Override
public List< Student>Display(){
return StudentDao.findAll();
}
@Override
public Student addStudent(Student st){
	StudentDao.save(st);
return st;
}@Override
public Student updateStudent(Student st){
	StudentDao.save(st);
return st;
}
@Override
public void deleteStudent(int regno){
Student entity= StudentDao.getReferenceById(regno);
StudentDao.delete(entity);
}
}