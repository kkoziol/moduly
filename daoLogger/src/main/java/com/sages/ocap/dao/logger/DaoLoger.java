package com.sages.ocap.dao.logger;

import com.sages.ocap.dao.logs.DaoLogs;

public class DaoLoger implements DaoLogs {


    public void log(String what) {
        System.out.println("-----> " + what);
    }
}
