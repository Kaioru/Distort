package co.kaioru.distort.d4j.module;

import co.kaioru.distort.d4j.listener.DistortD4JListener;
import co.kaioru.retort.CommandRegistry;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.modules.IModule;

public class DistortD4JModule implements IModule {

	private IDiscordClient client;
	private static CommandRegistry registry;
	private static DistortD4JListener listener;

	@Override
	public boolean enable(IDiscordClient client) {
		this.client = client;
		this.registry = new CommandRegistry();
		this.listener = new DistortD4JListener(registry);

		client.getDispatcher().registerListener(listener);
		return true;
	}

	@Override
	public void disable() {
		client.getDispatcher().unregisterListener(listener);
	}

	@Override
	public String getAuthor() {
		return "Kaioru";
	}

	@Override
	public String getName() {
		return getClass().getPackage().getImplementationTitle();
	}

	@Override
	public String getVersion() {
		return getClass().getPackage().getImplementationVersion();
	}

	@Override
	public String getMinimumDiscord4JVersion() {
		return "2.4.0";
	}

	public static CommandRegistry getRegistry() {
		return registry;
	}

	public static DistortD4JListener getListener() {
		return listener;
	}

}
