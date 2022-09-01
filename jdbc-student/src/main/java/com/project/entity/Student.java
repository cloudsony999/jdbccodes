package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//lombok helps us to remove boilerplate code makes the source code neat and clean
public class Student {

	private int id;
	private String name;
	private String address;
	private String email;

}
