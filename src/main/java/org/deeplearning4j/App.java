package org.deeplearning4j;


import org.deeplearning4j.iterativereduce.irunit.IRUnitDriver;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

/**
 *  Basic hadoop app
 *  @author Adam Gibson
 */
public class App {
    public static void main( String[] args ) throws Exception {
        File path = new ClassPathResource("ir.properties").getFile();
        IRUnitDriver driver = new IRUnitDriver(path.getAbsolutePath());
        driver.setup();
        driver.simulateRun();

    }
}
