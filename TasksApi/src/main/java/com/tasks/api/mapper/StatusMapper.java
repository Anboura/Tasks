package com.tasks.api.mapper;

import com.tasks.api.dto.StatusDto;
import com.tasks.api.entity.Status;
import com.tasks.api.entity.TaskStatus;
import com.tasks.api.utils.PostgresDateTransform;

public class StatusMapper {
	public static StatusDto toDto(final Status input) {
		StatusDto output = null;
		if(input != null) {
			output = new StatusDto();
			output.setId(input.getId());
			output.setLabel(input.getLabel());
		}
		return output;
	}
	
	public static StatusDto taskStatustoDto(final TaskStatus input) {
		StatusDto output = null;
		if(input != null) {
			output = toDto(input.getStatus());
			output.setDate(PostgresDateTransform.toFrontDate(input.getDate()));
		}
		return output;
	}
	
	public static  Status toEntity(final StatusDto input) {
		Status output = null;
		if(input != null) {
			output = new Status();
			output.setId(input.getId());
			output.setLabel(input.getLabel());
		}
		return output;
	}
	

}
