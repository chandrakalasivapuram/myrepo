package com.olx.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	@GetMapping(value="/api/contact/v1",produces=MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact()
	{
		return new Contact("tom",123);
	}
	@GetMapping(value="/api/contact/v2",produces=MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact2()
	{
		return new Contact("tom",1234);
	}
	@GetMapping(value="/api/contact/v2",produces=MediaType.APPLICATION_JSON_VALUE,params="version=v1")
	
	
	public Contact getContactQueryV1()
	{
		return new Contact("tom",12345);
	}
	@GetMapping(value="/api/contact/v2",produces=MediaType.APPLICATION_JSON_VALUE,params="version=v2")
	public Contact getContactQueryV2()
	{
		return new Contact("tom",12345);
	}
	
	
	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE, headers="version=v1")
	public Contact getContactHeaderV1()
	{
		return new Contact("tom",12345);
	}
	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE, headers="version=v2")
	public Contact getContactHeaderV2()
	{
		return new Contact("tom",12345);
	}

	
	
	@GetMapping(value="/api/contact",produces="application/contact.v1+json")
	public Contact getContactContentNegoV1()
	{
		return new Contact("tom",12345);
	}
	@GetMapping(value="/api/contact",produces="application/contact.v2+json")
	public Contact getContactContentNegoV2()
	{
		return new Contact("tom",12345);
	}
}

class  Contact{
	private String name;
	private int mobile;
	public Contact(String name, int mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	public Contact() {
		super();
	}
	
}