package com.example;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloWorld extends WebPage {
    public HelloWorld() {
        System.out.println("com.example.HelloWorld.HelloWorld()");
        add(new Label("message", "Hello World!"));
    }
}
