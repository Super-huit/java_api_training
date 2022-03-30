package fr.lernejo.navy_battle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class ClientTest {

    @Test
    void startgameValid() throws IOException, InterruptedException {
        Server server = new Server(9898, "localhost");
        server.init();
        Server client = new Server(9897, "localhost","http://localhost:9898");
        client.init();
        int res = client.getClt().startGame();
        Assertions.assertEquals(202, res);
    }
}
