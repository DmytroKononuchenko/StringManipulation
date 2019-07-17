package com.mainacad.service;

import com.mainacad.model.ConectionInfo;
import com.mainacad.model.User;
import com.mainacad.util.Randomizer;

import java.util.Date;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConnectionInfoService {


    public static Queue<ConectionInfo> generationConnectionInfoQueue(int amount) {
        Queue<ConectionInfo> connections = new PriorityQueue<>();

        for (int i = 0; i < amount; i++) {
            Integer sessionId = Randomizer.getRandomNymber(1_000_000, 9_999_999);
            String userIp = Randomizer.getRandomNymber(100, 255) + "." +
                    Randomizer.getRandomNymber(100, 255) + "." +
                    Randomizer.getRandomNymber(100, 255) + "." +
                    Randomizer.getRandomNymber(100, 255) + "." +
                    Randomizer.getRandomNymber(100, 255);

            Long time = new Date().getTime() - Randomizer.getRandomNymber(0, 1000 * 60 * 60 * 24 * 3);

            User user = new User(Randomizer.getRandomNymber(10000, 99999),
                    Randomizer.getRandomString(10),
                    Randomizer.getRandomString(12));

            ConectionInfo conectionInfo = new ConectionInfo(sessionId, userIp, time, user);
            connections.add(conectionInfo);
        }

        return connections;
    }

}
