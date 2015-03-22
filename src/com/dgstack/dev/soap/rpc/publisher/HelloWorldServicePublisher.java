package com.dgstack.dev.soap.rpc.publisher;

import javax.xml.ws.Endpoint;

import com.dgstack.dev.soap.rpc.impl.HelloWorldImpl;

public class HelloWorldServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}
	
}
