package discordbot.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class discordBot {
    public static void main(String[] args) {
        
        JDA bot = JDABuilder.createDefault("MTE2MzY1NzAyNTgyMjE0MjU4Nw.Gqs1_E.1rlVgWFYzDKBpVMZd1JQRU8VeGtvj9VcLS4GU4")
        .setActivity(Activity.playing("test"))
        .enableIntents(GatewayIntent.GUILD_MEMBERS)
        .addEventListeners(new botListeners())
        .build();
    }
}
