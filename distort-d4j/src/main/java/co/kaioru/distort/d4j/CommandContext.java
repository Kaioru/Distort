package co.kaioru.distort.d4j;

import co.kaioru.retort.BaseCommandContext;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.handle.obj.IUser;

public class CommandContext extends BaseCommandContext {

    private final IDiscordClient client;
    private final IMessage message;
    private final IUser user;

    public CommandContext(IDiscordClient client, IMessage message, IUser user) {
        this.client = client;
        this.message = message;
        this.user = user;
    }

    public IDiscordClient getClient() {
        return client;
    }

    public IMessage getMessage() {
        return message;
    }

    public IUser getUser() {
        return user;
    }

}
