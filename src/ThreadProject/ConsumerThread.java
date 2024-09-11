package ThreadProject;

public class ConsumerThread extends Thread{

    //we have to consume item by calling consumeItem method (this method is call by macking the class of company )

    Company c;
    ConsumerThread(Company c){
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            try {
                this.c.consumeItem();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }

        }
    }
}
