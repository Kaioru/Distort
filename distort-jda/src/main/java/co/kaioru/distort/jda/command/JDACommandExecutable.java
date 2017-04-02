package co.kaioru.distort.jda.command;

import co.kaioru.retort.command.ICommandExecutable;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.LinkedList;

@FunctionalInterface
public interface JDACommandExecutable extends ICommandExecutable {

	default void execute(LinkedList<String> args) throws Exception {
		return;
	}

	void execute(LinkedList<String> args, MessageReceivedEvent event) throws Exception;

}
