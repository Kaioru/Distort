package co.kaioru.distort.d4j.reflection;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.retort.reflection.AbstractReflectionGenerator;

public abstract class ReflectionGenerator extends AbstractReflectionGenerator<CommandContext, Void> {

    public ReflectionGenerator(Class<Void> outputClass) {
        super(outputClass);
    }

}
