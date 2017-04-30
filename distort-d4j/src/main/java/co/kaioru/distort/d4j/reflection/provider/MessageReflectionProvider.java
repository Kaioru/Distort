package co.kaioru.distort.d4j.reflection.provider;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.distort.d4j.reflection.ReflectionProvider;
import sx.blah.discord.handle.obj.IMessage;

public class MessageReflectionProvider extends ReflectionProvider<IMessage> {

    public MessageReflectionProvider() {
        super(IMessage.class);
    }

    @Override
    public IMessage provide(CommandContext context) {
        return context.getMessage();
    }

}
