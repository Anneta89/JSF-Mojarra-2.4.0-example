package ru.annblog.bean;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("helloBean")
@SessionScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1094801825228386364L;

    private String name;

    private String message;

    public void createMessage() {
        this.message = "Hello, " + name + "!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }
}
