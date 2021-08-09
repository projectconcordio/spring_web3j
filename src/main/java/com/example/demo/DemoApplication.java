package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.EthBlockNumber; // xac+https://www.oodlestechnologies.com/blogs/configure-web3j-with-spring-boot-and-one-sample-api/
import org.web3j.protocol.core.methods.response.Web3ClientVersion; // xac+
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
@RestController // XAC+ // 24m59s
public class DemoApplication {

	public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {


		System.out.println("Hello Albert from DemoApplication!!");

		//Web3j web3 = Web3j.build(new HttpService("localhost:7545"));
		//EthBlockNumber result = web3.ethBlockNumber().sendAsync().get();
		//System.out.println(" The Block Number is: " + result.getBlockNumber().toString());

		Web3j web3 = Web3j.build(new HttpService("http://localhost:7545"));  // defaults to http://localhost:8545/
		Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().send();
		String clientVersion = web3ClientVersion.getWeb3ClientVersion();
		System.out.println("Ethereum client version: " + clientVersion);
		// Ethereum client version: EthereumJS TestRPC/v2.10.2/ethereum-js

		//15:57:26.768 [main] DEBUG org.web3j.protocol.http.HttpService -
		// {"id":0,"jsonrpc":"2.0","result":"EthereumJS TestRPC/v2.10.2/ethereum-js"}


		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Bye Albert from DemoApplication!!");
	}




	@GetMapping // makes this a REST endpoint
	public String hello() { // XAC+

		return "Hello ";
	}


}
