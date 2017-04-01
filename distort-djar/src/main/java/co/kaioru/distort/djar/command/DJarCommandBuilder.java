package co.kaioru.distort.djar.command;

import co.kaioru.retort.util.builder.CommandBuilder;
import discord.jar.UserChatEvent;

import java.util.LinkedList;

public class DJarCommandBuilder extends CommandBuilder<DJarCommandBuilder, DJarCommand, DJarCommandExecutable> {

	public DJarCommandBuilder(String name) {
		super(name);
	}

	@Override
	public DJarCommand build(DJarCommandExecutable dJarCommandExecutable) {
		return new DJarCommand() {

			@Override
			public String getName() {
				return name;
			}

			@Override
			public String getDesc() {
				return desc;
			}

			@Override
			public void execute(LinkedList<String> args, UserChatEvent event) throws Exception {
				dJarCommandExecutable.execute(args, event);
			}

		};
	}

}
