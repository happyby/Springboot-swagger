package com.example.swagger.pojo;

import java.io.Serializable;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
@Data
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private String realName;
	private int level;
}
