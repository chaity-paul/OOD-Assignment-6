package com.company;

public class AuthorizedWebPage extends WebPageDecorator{
    int token;
    public AuthorizedWebPage(WebPage decoratedPage, int token) {
        super(decoratedPage);
        this.token = token;
    }
    public boolean authorizedUser() {
        if(this.token % 3 == 0){
            return  false;
        }
        System.out.println("Authorizing user");
        return true;
    }
    public void display() {
        if(this.authorizedUser()){
            super.display();
        }else{
            System.out.println("Not Authorized to view this page");
        }


    }
}
