package co.kaioru.distort.d4j.command;

import co.kaioru.retort.command.ICommand;
import co.kaioru.retort.util.builder.CommandBuilder;
import sx.blah.discord.handle.obj.IMessage;

import java.util.LinkedList;
import java.util.List;

public class D4JCommandBuilder extends CommandBuilder<D4JCommandBuilder, D4JCommand, D4JCommandExecutable> {

	public D4JCommandBuilder(String name) {
		super(name);
	}

	@Override
	public D4JCommand build(D4JCommandExecutable executor) {
		return new D4JCommand() {

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
			public void execute(LinkedList<String> args, IMessage message) throws Exception {
				executor.execute(args, message);
			}

		};
	}

}
