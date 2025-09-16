package com.example.todo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.todo.dao.TodoDao;
import com.example.todo.model.Todo;

@Controller
public class TodoController {
	
	private final TodoDao todoDao;
	
	public TodoController(TodoDao todoDao) {
		this.todoDao = todoDao;
	}
	
	@GetMapping("/")
	public String listTodos(Model model) {
		List<Todo> todos = todoDao.findAll();
		
//		Todo todo = new Todo();
//		todo.setTitle("독서");
//		List<Todo> todos = new ArrayList<Todo>();
//		todos.add(todo);
		model.addAttribute("todos",todos);
		return "list";
	}
	@GetMapping("/add")
	public String addForm() {
		return "add";
	}
	
	@PostMapping("/add")
	public String addTodo(@RequestParam("title") String title) {
		todoDao.add(title);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteTodo(@PathVariable int id) {
		todoDao.delete(id);
		return "redirect:/";
	}
	
	@GetMapping("/toggle/{id}")
	public String toggleCompleted(@PathVariable int id) {
		todoDao.toggleCompleted(id);
		return "redirect:/";
	}
	
	  @GetMapping("/update/{id}")
	    public String showUpdateForm(@PathVariable("id") int id, Model model) {
	        Todo todo = todoDao.findById(id); // id로 조회
	        model.addAttribute("todo", todo); // JSP에 넘김
	        return "update"; // update.jsp 로 이동
	    }
	
	
	@PostMapping("/update")
	public String updateTodo(Todo todo){
		todoDao.update(todo);
		return "redirect:/";
	}
	
}
