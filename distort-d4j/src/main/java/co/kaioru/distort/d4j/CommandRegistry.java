package co.kaioru.distort.d4j;

import co.kaioru.retort.BaseCommandRegistry;
import co.kaioru.retort.exception.CommandException;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.handle.obj.IUser;

public class CommandRegistry extends BaseCommandRegistry<CommandContext, Void> {

    public CommandRegistry() {
        super("registry");
    }

    public Void execute(IDiscordClient client, IMessage message, IUser user) throws CommandException {
        CommandContext context = new CommandContext(client, message, user);
        return execute(context, message.getContent());
    }

}
