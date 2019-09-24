package uk.ac.belfastmet.todo.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todo.domain.Task;

@Service
public class ToDoService {
	// logger here for the array debugging
	Logger log = LoggerFactory.getLogger(ToDoService.class);
	private ArrayList<Task> taskToDo;

	public ArrayList<Task> gettaskToDo() {

		this.taskToDo = new ArrayList<Task>();
		// Task(String description, String date, Boolean status, String name, String
		// priority)
		this.taskToDo.add(new Task("1", "learn java", "23 Sep 19", true, "Gerald", "high"));
		this.taskToDo.add(new Task("2", "learn html", "24 Sep 19", false, "Gerald", "high"));
		this.taskToDo.add(new Task("3", "learn css", "25 Sep 19", false, "Gerald", "high"));
		this.taskToDo.add(new Task("4", "learn javascript", "26 Sep 19", false, "Gerald", "high"));
		this.taskToDo.add(new Task("5", "learn spring boot", "27 Sep 19", false, "Gerald", "high"));


		
		// log debug here for the debugger console to read to know if the array has been successfully read
		log.debug("if array shows its working correctly if not theres an issue");
		
		// returning the tasktodo array
		return this.taskToDo;

	}

}
