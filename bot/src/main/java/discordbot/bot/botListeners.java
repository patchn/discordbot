package discordbot.bot;

import org.jetbrains.annotations.NotNull;

import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class botListeners extends ListenerAdapter{
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) { 
        if (!event.getAuthor().isBot()) {
            String sentMessage = event.getMessage().getContentRaw();
            event.getChannel().sendMessage("lol").queue();
        }
    }

    @Override
    public void autoGiveRole(@NotNull GuildMemberJoinEvent event) {
        
    }
}