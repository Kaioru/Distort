package co.kaioru.distort.d4j;

import co.kaioru.retort.AbstractCommand;
import co.kaioru.retort.ICommandContext;

public abstract class Command extends AbstractCommand<CommandContext, Void> {

    public Command(String name) {
        super(name);
    }

}
