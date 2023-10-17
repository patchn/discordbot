package discordbot.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class discordBot {
    public static void main(String[] args) {
        
        JDA bot = JDABuilder.createDefault("MTE2MzY1NzAyNTgyMjE0MjU4Nw.Gqs1_E.1rlVgWFYzDKBpVMZd1JQRU8VeGtvj9VcLS4GU4")
        .setActivity(Activity.playing("test"))
        .addEventListeners(new botListeners())
        .build();
    }
}
