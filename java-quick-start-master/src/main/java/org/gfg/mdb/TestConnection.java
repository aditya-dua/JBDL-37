package org.gfg.mdb;

import java.util.ArrayList;
import java.util.Iterator;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String connectionString = "mongodb+srv://<User-Name>:<Password>@firstmdbcluster.koycnz3.mongodb.net/aditya?retryWrites=true&w=majority";
        
        MongoClient mongo = MongoClients.create(connectionString);
        
        ArrayList<Document> dbList = mongo.listDatabases().into(new ArrayList<>());
        
        for (Iterator iterator = dbList.iterator(); iterator.hasNext();) {
			Document document = (Document) iterator.next();
			System.out.println(document);		
		}
        
        MongoDatabase sampleTrainingDB = mongo.getDatabase("sample_training");
        MongoCollection<Document> gradesColl = sampleTrainingDB.getCollection("grades");
        
        
        Document student1 = gradesColl.find(new Document("student_id",2)).first();
        
        System.out.println("Student 1 :"+student1.toJson());
	}
}