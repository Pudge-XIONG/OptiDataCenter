package io.pudge;

/**
 * Created by xq on 20/02/2017.
 */
public class Server implements Comparable<Server> {
    private int id;
    private int slotsAccount;
    private int capacity;

    public Server(int slotsAccount, int capacity) {
        this.slotsAccount = slotsAccount;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlotsAccount() {
        return slotsAccount;
    }

    public void setSlotsAccount(int slotsAccount) {
        this.slotsAccount = slotsAccount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Server s){
        float a = capacity/slotsAccount;
        float b = s.getCapacity()/s.getSlotsAccount();
        if(a > b){
            return -1;
        } else if(a == b){
            return 0;
        } else{
            return 1;
        }
    }
}
