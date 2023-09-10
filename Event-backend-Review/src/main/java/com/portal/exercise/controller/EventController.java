package com.portal.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.exercise.model.EventModel;
import com.portal.exercise.service.EventService;

@RestController
@RequestMapping("/api/v1/event")
@CrossOrigin("*")

public class EventController {

	@Autowired
    private EventService es;

    @GetMapping
	public List<EventModel> getAllUsers() {
		return es.getAllUsers();
	}
	@GetMapping("/{id}")
	public EventModel getUserID(@PathVariable Long id) {
		return es.getUserid(id);
	}

	@PostMapping
	public EventModel createStudent(@RequestBody EventModel user) {
		return es.saveuser(user);
	}

	 @PutMapping("/{id}")
	public EventModel updateUser(@RequestBody EventModel user ,@PathVariable Long id) {

		return es.updateUser(user,id);
	}
    
	 @DeleteMapping("/{id}")
	 public void deleteUser(@PathVariable Long id)
	 {
		 es.deleteUser(id);
	 }
}
