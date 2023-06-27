package com.lms.demo.com.mysite.lms.question;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Question {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(length = 200)
   private String subject;

   @Column(columnDefinition = "TEXT")
   private String content;

   private LocalDateTime createDate;
}
