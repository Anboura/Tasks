package com.tasks.api.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tasks.api.dto.TaskDto;
import com.tasks.api.service.TaskService;

@Controller
public class TaskController {
	@Autowired
	private TaskService taskService;
	@GetMapping("/tasks")
	public ResponseEntity<List<TaskDto>> getTasksList(
			@RequestParam(required = false) final List<Integer> priorityIdsList,
			@RequestParam(required = false) final List<Integer> statusIdsList,
			@RequestParam(required = false) final List<Integer> categoryIdsList,
			@RequestParam(required = false) final String startDate,
			@RequestParam(required = false) final String endDate,
			@RequestParam(required = false) final String effectiveEndDate) {
		final Map<String, List<?>> filtersMap = new HashMap<>();
		if (!CollectionUtils.isEmpty(priorityIdsList)) {
			filtersMap.put("priority", priorityIdsList);
		}
		if (!CollectionUtils.isEmpty(statusIdsList)) {
			filtersMap.put("status", statusIdsList);
		}
		if (!CollectionUtils.isEmpty(categoryIdsList)) {
			filtersMap.put("category", categoryIdsList);
		}
		if (startDate != null) {
			filtersMap.put("startDate", Arrays.asList(startDate));
		}
		if (endDate != null) {
			filtersMap.put("startDate", Arrays.asList(endDate));
		}
		if (effectiveEndDate != null) {
			filtersMap.put("startDate", Arrays.asList(effectiveEndDate));
		}
		final List<TaskDto> taskDtoList  = taskService.getTasksList(filtersMap);
		return ResponseEntity.ok(taskDtoList);
	}
//
//	@GetMapping
//	public ResponseEntity<List<TaskDto>> getTasksListByPrioritiesId(@PathVariable final List<Integer> priorityIdsList)
//			throws ApiResourceNotFoundException {
//		return null;
//	}
//	@GetMapping
//	public ResponseEntity<List<TaskDto>> getTasksListByStatus(@PathVariable final List<Integer> priorityIdsList)
//			throws ApiResourceNotFoundException {
//		return null;
//	}

}
