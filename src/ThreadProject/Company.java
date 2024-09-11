//Que:- A company has 2 mechine produce and consume if produce mechine produce then consume sleep than then after consume mechine works and consume at that time produce mechine wait
package ThreadProject;

public class Company {
    int n;

    boolean f = false; //this is for one by one doing work like when producer produce that time consumer wait and vice versa.

    //f=false (producer produce c wait) . if f=true (consumer consume p wait)
    synchronized public void produceItem(int n) throws Exception {
        if(f){
            wait();
        }
        this.n =n;
        System.out.println("Produce: " + this.n);
        f=true;
        notify();
    }


    synchronized public int consumeItem() throws Exception {
        if(!f){
            wait();
        }
        System.out.println("Consumed: " + this.n);
        f=false;
        notify();
        return this.n;
    }
}
