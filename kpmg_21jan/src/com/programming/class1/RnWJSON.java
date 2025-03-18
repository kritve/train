package com.programming.class1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class RnWJSON {
	
	public static void main(String[] args) throws IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode jsonNode = objectMapper.createObjectNode();
		jsonNode.put("Name","ABC");
		jsonNode.put("Age","25");
		jsonNode.put("City","Bengaluru");
		jsonNode.put("State","Karnataka");
		jsonNode.put("Country","India");
		
		objectMapper.writeValue(new File("mydata.json"), jsonNode );
		
		JsonNode jsonNode2 = objectMapper.readTree(new File("mydata.json"));
		String name = jsonNode2.get("name").asText();
		int age = jsonNode2.get("age").asInt();
		String city = jsonNode2.get("city").asText();
		System.out.println(name + age + city);
	}
	
}