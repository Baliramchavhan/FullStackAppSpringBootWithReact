package com.demoproject.service;
import java.util.List;
import com.demoproject.Entity.Student;
public  interface StudentService {
   public Student SaveStudent(Student studen);
   public List<Student> getAllStudent();
}
