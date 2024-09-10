package Threads;

public class ThreadOprations {
    public static void main(String[] args) {
        System.out.println("Program Start...");
        int x = 45+245;
        System.out.println("The sum is: " + x);

        // Find The Current Running Thread
        Thread t = Thread.currentThread(); //here t is variable of thread type
        String name = t.getName();
        System.out.println("Current Thread name is: " + name);



        // Change the name of the Thread
         t.setName("MyMain");
        System.out.println("New Thread name is: " + t.getName());

        //Sleep (this is static method so this will call by its class & also this show exception , must use try catch)
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }


        //Get I'd of thread
        System.out.println(t.threadId());  //or we can  use getid()


        System.out.println("Program Terminated...");
    }
}
