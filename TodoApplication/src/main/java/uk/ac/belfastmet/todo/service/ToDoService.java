package uk.ac.belfastmet.todo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todo.domain.Task;

@Service
public class ToDoService {
	
	private ArrayList<Task> taskToDo;
	
	
	public ArrayList <Task> gettaskToDo() {
		
		this.taskToDo = new ArrayList<Task>();
		//					  Task(String description, String date, Boolean status, String name, String priority)
		this.taskToDo.add(new Task("1", "learn java", "23 Sep 19", true , "Gerald", "high"));
		this.taskToDo.add(new Task("2", "learn html","24 Sep 19", false ,"Gerald", "high"));
		this.taskToDo.add(new Task("3", "learn css","25 Sep 19", false ,"Gerald", "high"));
		this.taskToDo.add(new Task("4", "learn javascript","26 Sep 19", false ,"Gerald", "high"));
		this.taskToDo.add(new Task("5", "learn spring boot","27 Sep 19", false ,"Gerald", "high"));
		
		
		
		return this.taskToDo;
		
	}
	
	

}
