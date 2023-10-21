package com.company;

public class Program {
    public static void main(String[] args) {
        WebPage myPage = new BasicWebPage();
        myPage = new AuthorizedWebPage(myPage, 4);
        myPage = new AuthenticatedWebPage(myPage, 2);
        myPage.display();
    }
}
