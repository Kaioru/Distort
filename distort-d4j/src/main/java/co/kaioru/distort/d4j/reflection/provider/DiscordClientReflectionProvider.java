package co.kaioru.distort.d4j.reflection.provider;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.distort.d4j.reflection.ReflectionProvider;
import sx.blah.discord.api.IDiscordClient;

public class DiscordClientReflectionProvider extends ReflectionProvider<IDiscordClient> {

    public DiscordClientReflectionProvider() {
        super(IDiscordClient.class);
    }

    @Override
    public IDiscordClient provide(CommandContext context) {
        return context.getClient();
    }

}
