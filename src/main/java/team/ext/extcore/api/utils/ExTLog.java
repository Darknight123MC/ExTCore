package team.ext.extcore.api.utils;

import org.apache.logging.log4j.Logger;

public class ExTLog {

    public static Logger logger;

    public ExTLog() {
    }

    public static void init(Logger modLogger) {
        logger = modLogger;
    }

}
