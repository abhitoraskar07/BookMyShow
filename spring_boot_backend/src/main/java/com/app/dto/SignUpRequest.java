package com.app.dto;

import java.time.LocalDate;

import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SignUpRequest {
	/*
	 * Validation rules : first name n last name : non blank email : valid n not
	 * blank password : string password
	 */
		@NotBlank(message = "first name can't be blank")
		private String firstName;
		@NotBlank(message = "last name can't be blank")
		private String lastName;
		@Email
		private String email;		
		@NotNull
		@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})",message = "invalid password format!!!!")
		private String password;
		
}
