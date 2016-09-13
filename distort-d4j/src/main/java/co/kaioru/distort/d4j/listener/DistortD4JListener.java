package co.kaioru.distort.d4j.listener;

import co.kaioru.retort.CommandRegistry;
import co.kaioru.retort.util.CommandUtil;
import sx.blah.discord.api.events.IListener;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IMessage;

public class DistortD4JListener implements IListener<MessageReceivedEvent> {

    private final CommandRegistry registry;
    private String prefix = ".";

    public DistortD4JListener(CommandRegistry registry) {
        this.registry = registry;
    }

    @Override
    public void handle(MessageReceivedEvent event) {
        try {
            IMessage message = event.getMessage();
            String content = message.getContent();

            if (content.startsWith(prefix))
                CommandUtil.executeCommand(registry, CommandUtil.getArgsFromText(content.substring(prefix.length(), content.length())), message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

}
