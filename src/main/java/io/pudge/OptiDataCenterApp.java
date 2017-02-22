package io.pudge;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * A Camel Application
 */
public class OptiDataCenterApp {

    private static final String SEPERATOR = " ";
    public static int ROW;
    public static int SLOT_ACCOUNT;
    public static int UNAVAILABLE_ACCOUNT;
    public static int POOL_ACCOUNT;
    public static int SERVER_ACCOUNT;
    public static List<Slot> slotList = new ArrayList<>();
    public static List<Slot> unavailableSlotList = new ArrayList<>();
    public static List<Slot> availableSlotList = new ArrayList<>();
    public static List<Server> serverList = new ArrayList<>();


    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        loadInput("example.in");
    }



    private static void loadInput(String inputFileName){
        try {
            InputStream fis = new FileInputStream(inputFileName);
            InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
            BufferedReader br = new BufferedReader(isr);

            String currentLine = br.readLine();
            String[] values = currentLine.split(SEPERATOR);
            ROW = Integer.parseInt(values[0]);
            SLOT_ACCOUNT = Integer.parseInt(values[1]);
            UNAVAILABLE_ACCOUNT = Integer.parseInt(values[2]);
            POOL_ACCOUNT = Integer.parseInt(values[3]);
            SERVER_ACCOUNT = Integer.parseInt(values[4]);

            for(int i = 0; i < ROW; i++){
                for(int j = 0; j < SLOT_ACCOUNT; j++){
                    Slot slot = new Slot(i, j);
                    slot.setId(i*SLOT_ACCOUNT+j);
                    slot.setAvailable(true);
                    slotList.add(slot);
                    availableSlotList.add(slot);
                }
            }

            int lineAccount = 0;
            while(lineAccount < UNAVAILABLE_ACCOUNT){
                currentLine = br.readLine();
                values = currentLine.split(SEPERATOR);
                int r = Integer.parseInt(values[0]);
                int c = Integer.parseInt(values[1]);
                Slot slot = slotList.get(r*SLOT_ACCOUNT + c);
                slot.setAvailable(false);
                unavailableSlotList.add(slot);
                availableSlotList.remove(slot);
                lineAccount ++;
            }

            lineAccount = 0;
            while(lineAccount < SERVER_ACCOUNT){
                currentLine = br.readLine();
                values = currentLine.split(SEPERATOR);
                Server server = new Server(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                server.setId(lineAccount);
                serverList.add(server);
                lineAccount ++;
            }

            Collections.sort(serverList);

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error while read line : " + e.getMessage());
        }
    }

}

