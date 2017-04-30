package co.kaioru.distort.d4j.builder;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.retort.ICommandContext;
import co.kaioru.retort.builder.BaseCommandBuilder;

public class CommandBuilder extends BaseCommandBuilder<CommandContext, Void> {

    private CommandBuilder(String name) {
        super(name);
    }

    public static CommandBuilder create(String name) {
        return new CommandBuilder(name);
    }

}
