package com.hm.UserMicroservice.entity;

import jakarta.persistence.Entity;

import org.hibernate.validator.constraints.UniqueElements;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
 
@Entity
@Table(name = "users",  uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
    })
public class User {
		
	@Id
	@GeneratedValue
	    private Long id;

	 
	 private String name;

	    
	   
	   @Column(unique = true)
	    private String email;
	     
	    private Integer age;
	 
 //getters setters
		 
}
