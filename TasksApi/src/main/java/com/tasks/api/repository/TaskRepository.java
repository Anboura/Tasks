package com.tasks.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tasks.api.entity.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{

}
