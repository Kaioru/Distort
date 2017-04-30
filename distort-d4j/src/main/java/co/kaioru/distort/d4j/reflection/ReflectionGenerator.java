package co.kaioru.distort.d4j.reflection;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.distort.d4j.reflection.provider.MessageReflectionProvider;
import co.kaioru.retort.reflection.AbstractReflectionGenerator;
import co.kaioru.retort.reflection.provider.*;

public abstract class ReflectionGenerator extends AbstractReflectionGenerator<CommandContext, Void> {

    public ReflectionGenerator(Class<Void> outputClass) {
        super(outputClass);

        registerProvider(new ContextReflectionProvider<>(CommandContext.class));
        registerProvider(new BooleanReflectionProvider<>());
        registerProvider(new StringReflectionProvider<>());
        registerProvider(new IntegerReflectionProvider<>());
        registerProvider(new DoubleReflectionProvider<>());
        registerProvider(new FloatReflectionProvider<>());

        registerProvider(new MessageReflectionProvider());
    }

}
