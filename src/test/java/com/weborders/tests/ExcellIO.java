package com.weborders.tests;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExcellIO {
    @Test
    public void createExcellTest() throws IOException {
        //we created File and give path to excell file (where new file will be created)
        File file=new File(System.getProperty("user.dir")+"/regression_test_results.xls");
        file.createNewFile(); //if there is no file before will create the file you put
        
    }
}
