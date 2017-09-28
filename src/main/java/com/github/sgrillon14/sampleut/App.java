package com.github.sgrillon14.sampleut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        int a = 0;
        if (args == null) {
            logger.debug("args is null!");
            a = a + 3;
        } else {
            logger.debug("a = {}", a);
            a = a + 4;
        }
        logger.info("Hello World!" + a);
    }

}
