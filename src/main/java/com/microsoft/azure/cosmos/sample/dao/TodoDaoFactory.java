package com.microsoft.azure.cosmos.sample.dao;

// TodoDaoFactory class creates a new DocDbDao object
public class TodoDaoFactory {

	private static TodoDao myTodoDao = new DocDbDao();

    public static TodoDao getDao() {
        return myTodoDao;
    }
    
}
