package com.mainacad;

import com.mainacad.model.ConectionInfo;
import com.mainacad.service.ConnectionInfoService;

import java.util.Queue;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        Queue<ConectionInfo> connections = ConnectionInfoService.generationConnectionInfoQueue(5);

        logger.info("My sistem generation " + connections.size() + " connections. ");
        for (ConectionInfo connectionInfo : connections) {
            logger.info(connectionInfo.toString());
        }
    }

}

