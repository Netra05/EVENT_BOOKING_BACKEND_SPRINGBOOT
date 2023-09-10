package com.portal.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.exercise.model.EventModel;

public interface EventRepo extends JpaRepository<EventModel,Long> {

}
