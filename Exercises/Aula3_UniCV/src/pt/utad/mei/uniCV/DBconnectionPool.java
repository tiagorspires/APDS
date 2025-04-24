/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

import java.util.ArrayList;

/**
 *
 * @author hparedes
 */
public class DBconnectionPool {
    private static final int POOLSIZE=5;
    private static ArrayList<DBConnection> free;
    private static ArrayList<DBConnection> inUse;

    private static DBconnectionPool singleton;

    private DBconnectionPool() {
        free = new ArrayList<DBConnection>();
        inUse = new ArrayList<DBConnection>();
        createConnection();
    }

    public static DBconnectionPool getInstance() {
        if (singleton == null) {
            singleton = new DBconnectionPool();
        }
        return singleton;
    }

    public DBConnection get() {
        if (free.isEmpty()) {
            createConnection();
        }
        DBConnection res = free.iterator().next();
        free.remove(res);
        inUse.add(res);
        return res;

    }

    public void release(DBConnection c) {
        if (inUse.contains(c)) {
            inUse.remove(c);
            free.add(c);
        }
    }

    private void createConnection() {
        for (int i = 0; i < POOLSIZE; i++) {
            free.add(new DBConnection());
        }
    }

}
