package com.example;

import org.apache.wicket.protocol.http.WebApplication;

public class HelloWorldApplication extends WebApplication {
    public HelloWorldApplication() {
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class getHomePage() {
        System.out.println("com.example.HelloWorldApplication.getHomePage()");
        return HelloWorld.class;
    }
}
