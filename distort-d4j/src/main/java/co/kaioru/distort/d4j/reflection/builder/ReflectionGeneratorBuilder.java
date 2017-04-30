package co.kaioru.distort.d4j.reflection.builder;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.distort.d4j.reflection.provider.MessageReflectionProvider;
import co.kaioru.retort.reflection.builder.BaseReflectionGeneratorBuilder;
import co.kaioru.retort.reflection.builder.IReflectionGeneratorBuilder;
import co.kaioru.retort.reflection.provider.*;

public class ReflectionGeneratorBuilder extends BaseReflectionGeneratorBuilder<CommandContext, Void> {

    public ReflectionGeneratorBuilder(Class<Void> outputClass) {
        super(outputClass);
    }

    public static IReflectionGeneratorBuilder<CommandContext, Void> create() {
        ReflectionGeneratorBuilder builder = new ReflectionGeneratorBuilder(Void.TYPE);

        builder.withProvider(new ContextReflectionProvider<>(CommandContext.class))
                .withProvider(new BooleanReflectionProvider<>())
                .withProvider(new StringReflectionProvider<>())
                .withProvider(new IntegerReflectionProvider<>())
                .withProvider(new DoubleReflectionProvider<>())
                .withProvider(new FloatReflectionProvider<>())
                .withProvider(new MessageReflectionProvider());
        return builder;
    }

}
