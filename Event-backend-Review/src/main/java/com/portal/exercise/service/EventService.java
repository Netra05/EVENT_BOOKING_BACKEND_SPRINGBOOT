package com.portal.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.exercise.model.EventModel;
import com.portal.exercise.repository.EventRepo;


@Service
public class EventService {

	@Autowired
    private EventRepo er;

	// post the data
		public EventModel saveuser(EventModel user) {
			return er.save(user);
		}

		// get the data
		public List<EventModel> getAllUsers() {
			return er.findAll();
		}
		
		// get the data using id
		public EventModel getUserid(Long id) {
			return er.findById(id).orElse(null);
		}
		// update the data
		public EventModel updateUser(EventModel user, Long id) {
			EventModel userx = er.findById(id).orElse(null);
					if(userx !=null) {
						userx.setEventname(user.getEventname());
						userx.setEventtype(user.getEventtype());
						userx.setEventcapacity(user.getEventcapacity());
						userx.setEventbudget(user.getEventbudget());
						
							return er.saveAndFlush(userx);
					}
					else {
						return null;
					}
		}

		// delete the data
		public void deleteUser(Long id) {
			er.deleteById(id);
		}
}