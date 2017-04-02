package co.kaioru.distort.jda.command;

import co.kaioru.retort.command.ICommand;
import co.kaioru.retort.util.builder.CommandBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.LinkedList;
import java.util.List;

public class JDACommandBuilder extends CommandBuilder<JDACommandBuilder, JDACommand, JDACommandExecutable> {

	public JDACommandBuilder(String name) {
		super(name);
	}

	@Override
	public JDACommand build(JDACommandExecutable executor) {
		return new JDACommand() {

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
			public void execute(LinkedList<String> args, MessageReceivedEvent event) throws Exception {
				executor.execute(args, event);
			}

		};
	}

}
