package io.pudge;

import java.util.List;

/**
 * Created by xq on 20/02/2017.
 */
public class Pool {
    int id;
    List<Server> serverList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Server> getServerList() {
        return serverList;
    }

    public void setServerList(List<Server> serverList) {
        this.serverList = serverList;
    }
}
