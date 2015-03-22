/**
 * 
 */
package com.dgstack.dev.soap.rpc.impl;

import javax.jws.WebService;

import com.dgstack.dev.soap.rpc.HelloWorld;

@WebService(endpointInterface = "com.dgstack.dev.soap.rpc.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String name) {
		return "Hello! " + name;
	}

	
	
}
