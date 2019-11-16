package com.tasks.api.mapper;

import com.tasks.api.dto.PriorityDto;
import com.tasks.api.entity.Priority;

public class PriorityMapper {
	public static PriorityDto toDto(final Priority input) {
		PriorityDto output = null;
		if(input != null) {
			output = new PriorityDto();
			output.setId(input.getId());
			output.setLabel(input.getLabel());
			output.setLevel(input.getLevel());
		}
		return output;
	}
	
	public static  Priority toEntity(final PriorityDto input) {
		Priority output = null;
		if(input != null) {
			output = new Priority();
			output.setId(input.getId());
			output.setLabel(input.getLabel());
			output.setLevel(input.getLevel());
		}
		return output;
	}
}
