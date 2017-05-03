package co.kaioru.distort.jda.compat;

import co.kaioru.distort.d4j.JDACommandRegistry;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CommandListener extends ListenerAdapter {

    private final JDACommandRegistry registry;
    private String prefix = ".";

    public CommandListener(JDACommandRegistry registry) {
        this.registry = registry;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
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
