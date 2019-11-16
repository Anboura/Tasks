package com.tasks.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.CollectionUtils;

import com.tasks.api.dto.StatusDto;
import com.tasks.api.dto.TaskDto;
import com.tasks.api.entity.Task;
import com.tasks.api.entity.TaskStatus;
import com.tasks.api.utils.PostgresDateTransform;

public class TaskMapper {
	
	public static TaskDto toDto(final Task input) {
		TaskDto output = null;
		if (input != null) {
			output = new TaskDto();
			output.setId(input.getId());
			output.setLabel(input.getLabel());
			output.setPriority(PriorityMapper.toDto(input.getPriority()));
			output.setStartDate(PostgresDateTransform.toFrontDate(input.getStartDate()));
			output.setEndDate(PostgresDateTransform.toFrontDate(input.getEndDate()));
			final List<TaskStatus> taskStatusList = input.getTaskStatusList();
			if (!CollectionUtils.isEmpty(taskStatusList)) {

				final List<StatusDto> statusDtoList = taskStatusList.stream()
						.map(taskStatusElement -> StatusMapper.taskStatustoDto(taskStatusElement))
						.collect(Collectors.toList());
				output.setStatusList(statusDtoList);
			}

		}
		return output;
	}
	
	public static  Task toEntity(final TaskDto input) {
		Task output = null;
		if (input != null) {
			output = new Task();
			output.setId(input.getId());
			output.setLabel(input.getLabel());
			output.setPriority(PriorityMapper.toEntity(input.getPriority()));
			output.setStartDate(PostgresDateTransform.toBackDate(input.getStartDate()));
			output.setEndDate(PostgresDateTransform.toBackDate(input.getEndDate()));
			
		}
		return output;
	}


}
