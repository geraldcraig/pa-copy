package uk.ac.belfastmet.todo.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todo.domain.Task;
import uk.ac.belfastmet.todo.repository.TaskRepository;

@Service
public class ToDoService {

	// logger here for the array debugging
	Logger log = LoggerFactory.getLogger(ToDoService.class);

	@Autowired
	private TaskRepository taskRepository;

	public void getNumberOfTasks() {
		log .info("# of tasks: {}", taskRepository.count());
	}

	public ArrayList<Task> taskToDo;

	public ArrayList<Task> gettaskToDo() {

		this.taskToDo = new ArrayList<Task>();
		// Task(String task, String description, String date, Boolean status, String name, String
		// priority)
		/*this.taskToDo.add(new Task("1", "learn java", "23 Sep 19", true, "Gerald", "high"));
		this.taskToDo.add(new Task("2", "learn html", "24 Sep 19", false, "Gerald", "high"));
		this.taskToDo.add(new Task("3", "learn css", "25 Sep 19", false, "Gerald", "high"));
		this.taskToDo.add(new Task("4", "learn javascript", "26 Sep 19", false, "Gerald", "high"));
		this.taskToDo.add(new Task("5", "learn spring boot", "27 Sep 19", false, "Gerald", "high"));*/

		Iterable < Task > toDotasks = taskRepository.findAll();
		Iterator < Task > iterator = toDotasks.iterator();
		ArrayList<Task> todoList =  new ArrayList<Task>();
		while (iterator.hasNext()) {
			//log.info("{}", iterator.next().toString());
			todoList.add(iterator.next());
		}

		// log debug here for the debugger console to read to know if the array has been successfully read
		log.debug("if array shows its working correctly if not theres an issue");

		// returning the tasktodo array
		return todoList;

	}

}
