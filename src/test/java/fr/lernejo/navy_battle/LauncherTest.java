package fr.lernejo.navy_battle;

import org.junit.jupiter.api.Test;

import java.io.IOException;


class LauncherTest {

    @Test
    void LauncherClient() throws IOException, InterruptedException {
        Launcher launch = new Launcher();
        launch.main(new String[]{"10003"});
        Launcher launch2 = new Launcher();
        launch2.main(new String[]{"10004", "http://localhost:10003"});
    }

    @Test
    void LauncherServ() throws IOException, InterruptedException {
        Launcher launch = new Launcher();
        launch.main(new String[]{"10000"});
    }

    
}
