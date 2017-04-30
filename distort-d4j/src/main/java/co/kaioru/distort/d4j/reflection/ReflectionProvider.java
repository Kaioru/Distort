package co.kaioru.distort.d4j.reflection;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.retort.reflection.AbstractReflectionProvider;

public abstract class ReflectionProvider extends AbstractReflectionProvider<CommandContext, Void> {

    public ReflectionProvider(Class<Void> type) {
        super(type);
    }

}
