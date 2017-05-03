package co.kaioru.distort.d4j.compat;

import co.kaioru.distort.d4j.D4JCommandRegistry;
import sx.blah.discord.api.events.IListener;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IMessage;

public class CommandListener implements IListener<MessageReceivedEvent> {

    private final D4JCommandRegistry registry;
    private String prefix = ".";

    public CommandListener(D4JCommandRegistry registry) {
        this.registry = registry;
    }

    @Override
    public void handle(MessageReceivedEvent event) {
        IMessage message = event.getMessage();
        String content = message.getContent();

        if (content.startsWith(prefix)) {
            content = content.substring(prefix.length(), content.length());
            registry.process(message, content);
        }
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

}
