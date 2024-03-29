package com.hcl.exception.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_db")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String studentName;
	private Integer marks;
}
