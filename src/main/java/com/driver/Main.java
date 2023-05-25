package com.driver;

public class Main {
    public Main(){
    }
    public static class A{
        public A(){

        }
        String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
        public B(){

        }
        @Override
        String meth(){
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.meth();
        b.meth();
    }
  
}