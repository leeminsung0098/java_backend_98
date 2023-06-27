package com.lms.demo.com.mysite.lms.question;


import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
        Question findBySubject(String subject);

}
