package com.demoproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.Entity.Student;
import com.demoproject.repo.StudentRepo;
@Service
public class ServiceImpl implements StudentService{
  @Autowired
  private StudentRepo studentRepo;

@Override
public Student SaveStudent(Student student) {
	Student s1 = null;
	if(student!=null) {
     s1=studentRepo.save(student);
	}
	return s1;
}

@Override
public List<Student> getAllStudent() {// TODO Auto-generated method stub
	return studentRepo.findAll();
}
  
  
}
