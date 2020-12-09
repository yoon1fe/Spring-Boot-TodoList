package com.yoon1fe.todo.repository.dto;

import lombok.Data;

@Data
public class Member {
	private String member_id;
	private String password;
	private String email;
}
