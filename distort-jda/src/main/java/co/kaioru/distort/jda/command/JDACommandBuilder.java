package co.kaioru.distort.jda.command;

import co.kaioru.retort.util.builder.CommandBuilder;
import net.dv8tion.jda.entities.Message;

import java.util.LinkedList;

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
			public void execute(LinkedList<String> args, Message message) throws Exception {
				executor.execute(args, message);
			}

		};
	}

}
