package co.kaioru.distort.d4j.listener;

import co.kaioru.retort.CommandRegistry;
import co.kaioru.retort.util.CommandUtil;
import sx.blah.discord.api.IListener;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IMessage;

public class DistortD4JListener implements IListener<MessageReceivedEvent> {

	private final CommandRegistry registry;

	public DistortD4JListener(CommandRegistry registry) {
		this.registry = registry;
	}

	@Override
	public void handle(MessageReceivedEvent event) {
		try {
			IMessage message = event.getMessage();

			CommandUtil.executeCommand(registry, CommandUtil.getArgsFromText(message.getContent()), message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
