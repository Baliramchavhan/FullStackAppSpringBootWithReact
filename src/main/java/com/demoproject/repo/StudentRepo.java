package com.demoproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demoproject.Entity.Student;
public interface StudentRepo extends JpaRepository<Student, Long>{

}
