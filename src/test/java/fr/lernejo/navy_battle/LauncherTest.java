package fr.lernejo.navy_battle;

import org.junit.jupiter.api.Test;

import java.io.IOException;


class LauncherTest {

    @Test
    void LauncherServ() throws IOException, InterruptedException {
        Launcher launch = new Launcher();
        launch.main(new String[]{"10000"});
    }

    @Test
    void LauncherClient() throws IOException, InterruptedException {
        Launcher launch = new Launcher();
        launch.main(new String[]{"10001"});
        Launcher launch2 = new Launcher();
        launch2.main(new String[]{"10002", "http://localhost:10001"});
    }
}
