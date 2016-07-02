package co.kaioru.distort.jc.command;

import co.kaioru.retort.command.ICommand;
import co.kaioru.retort.util.builder.CommandBuilder;
import de.btobastian.javacord.entities.message.Message;

import java.util.LinkedList;
import java.util.List;

public class JCCommandBuilder extends CommandBuilder<JCCommandBuilder, JCCommand, JCCommandExecutable> {

	public JCCommandBuilder(String name) {
		super(name);
	}

	@Override
	public JCCommand build(JCCommandExecutable executor) {
		return new JCCommand() {

			@Override
			public String getName() {
				return name;
			}

			@Override
			public String getDesc() {
				return desc;
			}

			@Override
			public List<String> getAliases() {
				return aliases;
			}

			@Override
			public List<ICommand> getCommands() {
				return commands;
			}

			@Override
			public void execute(LinkedList<String> args, Message message) throws Exception {
				executor.execute(args, message);
			}

		};
	}

}
