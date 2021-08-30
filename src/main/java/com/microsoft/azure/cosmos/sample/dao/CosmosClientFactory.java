package com.microsoft.azure.cosmos.sample.dao;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

/* 
 * To invoke the Azure Cosmos DB service, you must instantiate a new cosmosClient object. In general, it is best to reuse the cosmosClient object rather than constructing 
 * a new client for each subsequent request. You can reuse the client by defining it within the cosmosClientFactory class.
 * Replace the HOST variable with with your URI and replace the MASTER_KEY with your PRIMARY KEY.
*/
public class CosmosClientFactory {

	private static final String HOST = ""; // [ACCOUNT HOST NAME]
    private static final String MASTER_KEY = ""; // [ACCOUNT KEY]

    private static CosmosClient cosmosClient = new CosmosClientBuilder()
            .endpoint(HOST)
            .key(MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.EVENTUAL)
            .buildClient();

    public static CosmosClient getCosmosClient() {
        return cosmosClient;
    }
    
}
