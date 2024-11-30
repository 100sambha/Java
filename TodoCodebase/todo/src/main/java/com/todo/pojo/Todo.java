package com.todo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "todos")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private boolean status;
	private String time;
	private String note;
	
	private Todo(TodoBuilder builder) {
		this.id = builder.id;
		this.time = builder.time;
		this.note = builder.note;
		this.title = builder.title;
		this.status = builder.status;
	}
	
	public static class TodoBuilder{
		private Integer id;
		private String title;
		private boolean status;
		private String time;
		private String note;
		
		public TodoBuilder setTitle(String title) {
			this.title = title;
			return this;
		}
		
		public TodoBuilder setStatus(Boolean status) {
			this.status = status;
			return this;
		}
		
		public TodoBuilder setTime(String time) {
			this.time = time;
			return this;
		}
		
		public TodoBuilder setNote(String note) {
			this.note = note;
			return this;
		}
		
		public Todo build() {
			return new Todo(this);
		}
	}
}