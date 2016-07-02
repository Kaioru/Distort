package co.kaioru.distort.d4j.command;

import co.kaioru.retort.command.ICommandExecutable;
import sx.blah.discord.handle.obj.IMessage;

import java.util.LinkedList;

@FunctionalInterface
public interface D4JCommandExecutable extends ICommandExecutable {

	default void execute(LinkedList<String> args) throws Exception {
		return;
	}

	void execute(LinkedList<String> args, IMessage message) throws Exception;

}
