package com.tasks.api.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasks.api.dto.TaskDto;
import com.tasks.api.entity.Task;
import com.tasks.api.mapper.TaskMapper;
import com.tasks.api.repository.TaskRepository;
import com.tasks.api.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskRepository taskRepo;

	@Override
	public List<TaskDto> getTasksList(Map<String, List<?>> filters) {
		final List<Task> taskList = taskRepo.findAll();
		return taskList.stream().map(taskElement -> TaskMapper.toDto(taskElement)).collect(Collectors.toList());
	}

}
