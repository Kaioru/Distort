package co.kaioru.distort.jda.command;

import co.kaioru.retort.command.ICommandExecutable;
import net.dv8tion.jda.entities.Message;

import java.util.LinkedList;

@FunctionalInterface
public interface JDACommandExecutable extends ICommandExecutable {

	default void execute(LinkedList<String> args) throws Exception {
		return;
	}

	void execute(LinkedList<String> args, Message message) throws Exception;

}
