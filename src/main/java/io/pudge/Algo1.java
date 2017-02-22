package io.pudge;

import java.util.*;
/**
 * Created by zjyju on 20/02/2017.
 */
public class Algo1 {

    //  capacity sort z->a
    //  slots length




    //  maxime gc

    // print result
    public void printResult(List<Server> servers) {
        for (int i=0; i<OptiDataCenterApp.SERVER_ACCOUNT; i++) {
            Server s;
            int j=0;
            s=servers.get(j);
            while (s.getId() !=i ) {
                j++;
                s=servers.get(j);
            }

            s.printServer();
            servers.remove(s);
        }
    }

}
