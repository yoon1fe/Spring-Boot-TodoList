package com.yoon1fe.todo.repository.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Todo {
	private int todo_id;
	private String member_id;
	private String content;
	private Date regDate;
	private boolean isDone;
	private String type;
}
