package com.entites;

import java.util.Date;

public class Todo {
	
	private String todoTottle;
	private String todoContent;
	private Date date;
	public Todo(String todoTottle, String todoContent, Date date) {
		super();
		this.todoTottle = todoTottle;
		this.todoContent = todoContent;
		this.date = date;
	}

	public Todo() {
		super();
	}

	public String getTodoTottle() {
		return todoTottle;
	}
	public void setTodoTottle(String todoTottle) {
		this.todoTottle = todoTottle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Todo [todoTottle=" + todoTottle + ", todoContent=" + todoContent + ", date=" + date + "]";
	}
}
