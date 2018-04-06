package com.ds.practice;

public class Stack<T> {
    T[] arr;
    int top = -1;
    int size;
    public Stack(int size) {
        super();
        this.size = size;
        arr = (T[]) new Object[size];
    }
    
    public void push(T data) throws Exception{
        if(top == size-1){
            throw new Exception("Stack is full");
        }
        arr[++top] = data;
    }
    
    public void pop() throws Exception {
        if(top == -1){
            throw new Exception("Stack is empty");
        }
        arr[top--] = null;
    }
    
   

}
