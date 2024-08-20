import  java.util.*;

// In this we have to make a Stack in whichwe have to add element in the bottom of the Stack.
public class StackClass {
    public static void addToBottom(int data , Stack<Integer> s){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        addToBottom(data ,s);
        s.push(top);
    }





    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        addToBottom(4,s);

        while (!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
