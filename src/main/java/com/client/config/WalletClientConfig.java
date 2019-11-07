package com.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.server.grpc.WalletServiceGrpc;
import com.server.grpc.WalletServiceGrpc.WalletServiceFutureStub;

import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;

@Configuration
public class WalletClientConfig {
	
	@GrpcClient("wallet-server")
	private Channel serverChannel;

	@Bean
	WalletServiceFutureStub getWalletServiceFutureStub() {
		return WalletServiceGrpc.newFutureStub(serverChannel);
	}

}
