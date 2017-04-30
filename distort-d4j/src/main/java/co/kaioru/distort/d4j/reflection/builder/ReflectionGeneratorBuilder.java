package co.kaioru.distort.d4j.reflection.builder;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.retort.reflection.builder.BaseReflectionGeneratorBuilder;

public class ReflectionGeneratorBuilder extends BaseReflectionGeneratorBuilder<CommandContext, Void> {

    public ReflectionGeneratorBuilder(Class<Void> outputClass) {
        super(outputClass);
    }

    public static ReflectionGeneratorBuilder create() {
        return new ReflectionGeneratorBuilder(Void.class);
    }

}
