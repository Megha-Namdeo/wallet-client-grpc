package com.client.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ClientApplication.class, args);

//		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
//
//		userBlockingStub stub = userGrpc.newBlockingStub(channel);
//
//		LoginRequest request = LoginRequest.newBuilder().setUsername("Megha").setPassword("Megha123").build();
//
//		APIResponse res = stub.login(request);
//
//		System.out.println(res.getResponsemessage());

	}

}
