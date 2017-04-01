package co.kaioru.distort.djar.listener;

import co.kaioru.retort.CommandRegistry;
import co.kaioru.retort.util.CommandUtil;
import discord.jar.EventListener;
import discord.jar.UserChatEvent;

public class DistortDjarListener implements EventListener {

	private final CommandRegistry registry;
	private String prefix = ".";

	public DistortDjarListener(CommandRegistry registry) {
		this.registry = registry;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void onUserChat(UserChatEvent event) {
		try {
			String content = event.getMsg().getMessage();

			if (content.startsWith(prefix))
				CommandUtil.executeCommand(registry, CommandUtil.getArgsFromText(content.substring(prefix.length(), content.length())), event);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
