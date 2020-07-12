package com.tan.myspring.ioc.test;

public class HelloWorld {

  private String text;

  void say() {
    System.out.println(text);
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
