package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthenticateResponse {
 private String firstName;
 private String lastName;
@Override
public String toString() {
	return "AuthenticateResponse [firstName=" + firstName + ", lastName=" + lastName + "]";
}
 
}
