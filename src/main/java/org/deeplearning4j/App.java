package org.deeplearning4j;


import org.deeplearning4j.iterativereduce.irunit.IRUnitDriver;

import java.io.File;

/**
 *  Basic hadoop app
 *  @author Adam Gibson
 */
public class App {
    public static void main( String[] args ) throws Exception {
        File path = new File(args[0]);
        IRUnitDriver driver = new IRUnitDriver(path.getAbsolutePath());
        driver.setup();
        driver.simulateRun();

    }
}
