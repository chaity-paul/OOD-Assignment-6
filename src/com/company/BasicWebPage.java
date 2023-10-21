package com.company;

public class BasicWebPage implements WebPage{
    public String html = "";
    public String styleSheet = "";
    public String script = "";
    @Override
    public void display() {
        System.out.println("This is a basic web page");
    }
}
