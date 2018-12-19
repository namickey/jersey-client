package com;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProjectDto {

    @JsonProperty
	private int id;

    @JsonProperty
    private String name;

    @Override
    public String toString(){
        return "id:" + id + ", name:" + name;
    }
}
