package com.example;

import java.util.Date;

import org.apache.wicket.markup.html.WebPage;

public class HelloWorld extends WebPage {
	public HelloWorld() {
		System.out.println("com.example.HelloWorld " + new Date());
		// add(new Label("message", "Hello World!"));
	}
}
