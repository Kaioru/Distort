package co.kaioru.distort.jc.command;

import co.kaioru.retort.command.ICommandExecutable;
import de.btobastian.javacord.entities.message.Message;

import java.util.LinkedList;

@FunctionalInterface
public interface JCCommandExecutable extends ICommandExecutable {

	default void execute(LinkedList<String> args) throws Exception {
		return;
	}

	void execute(LinkedList<String> args, Message message) throws Exception;

}
