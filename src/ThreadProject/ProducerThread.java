package ThreadProject;

public class ProducerThread extends Thread{

    //we have to produce item by calling produceItem method (this method is call by macking the class of company )
    Company c;
    ProducerThread(Company c){
        this.c = c;
    }
    public void run(){
        int i = 1;
        while (true){
            try {
                this.c.produceItem(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            i++;
        }
    }
}
