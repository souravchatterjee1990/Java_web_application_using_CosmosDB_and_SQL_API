package com.microsoft.azure.cosmos.sample.model;

import lombok.Data;

//The TodoItem class defines the schema of an item along with the getter and setter methods

@Data
public class TodoItem {

	private String entityType;
    private String category;
    private boolean complete;
    private String id;
    private String name;
    
}
