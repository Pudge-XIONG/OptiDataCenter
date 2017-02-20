package io.pudge;

/**
 * Created by xq on 20/02/2017.
 */
public class Server {
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
}
