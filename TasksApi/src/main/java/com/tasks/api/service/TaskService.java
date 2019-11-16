package com.tasks.api.service;

import java.util.List;
import java.util.Map;

import com.tasks.api.dto.TaskDto;

public interface TaskService {
	public List<TaskDto>getTasksList(Map<String, List<?>>filters);
	
	
}
