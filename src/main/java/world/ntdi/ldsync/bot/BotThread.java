package world.ntdi.ldsync.bot;

import javax.security.auth.login.LoginException;

public class BotThread extends Thread {
    public void run() {
        try {
            DiscordBot.main(null);
        } catch (LoginException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
