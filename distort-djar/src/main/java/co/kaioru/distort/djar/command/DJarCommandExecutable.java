package co.kaioru.distort.djar.command;

import co.kaioru.retort.command.ICommandExecutable;
import discord.jar.UserChatEvent;

import java.util.LinkedList;

@FunctionalInterface
public interface DJarCommandExecutable extends ICommandExecutable {

	default void execute(LinkedList<String> args) throws Exception {
		return;
	}

	void execute(LinkedList<String> args, UserChatEvent event) throws Exception;

}
