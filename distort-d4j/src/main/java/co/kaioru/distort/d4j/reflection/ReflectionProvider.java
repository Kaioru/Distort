package co.kaioru.distort.d4j.reflection;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.retort.reflection.AbstractReflectionProvider;

public abstract class ReflectionProvider<O> extends AbstractReflectionProvider<CommandContext, O> {

    public ReflectionProvider(Class<O> type) {
        super(type);
    }

}
