package uk.ac.belfastmet.todo.domain;

public class Task {
	// initialising the variables
	private String task;
	private String description;
	private String date;
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
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	// End of the Getters and Setters

}
