package uk.ac.belfastmet.todo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	// initialising the variables
	private long id;
	private String task;
	private String description;
	private Boolean status;
	private String name;
	private String priority;

	// Constructors
	public Task() {

	}

	public Task(String task, String description, String date, Boolean status, String name, String priority) {

		this.task = task;
		this.description = description;
		this.date = date;
		this.status = status;
		this.name = name;
		this.priority = priority;
	}

	// End of Constructors

	// Getters and Setters for all the variables
	@Id
	@GeneratedValue(strategy = GenerationType.Auto)
	public long getId() {
		return id;
	}
	
	@Column(name = "name")
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "date")
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "user")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	// End of the Getters and Setters

}
