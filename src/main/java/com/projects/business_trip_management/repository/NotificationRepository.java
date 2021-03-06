package com.projects.business_trip_management.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.projects.business_trip_management.entity.Notification;

public interface NotificationRepository extends Repository<Notification, Integer>{
	
	void save(Notification notification);
	
	@Query("FROM Notification n ORDER BY n.id DESC")
	Page<Notification> findAllByIdDesc(Pageable pageRequest);
}
