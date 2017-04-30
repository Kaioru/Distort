package co.kaioru.distort.d4j.annotation.builder;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.distort.d4j.builder.MiddlewareBuilder;
import co.kaioru.retort.ICommandContext;
import co.kaioru.retort.annotation.builder.BaseAnnotationFactoryBuilder;

public class AnnotationFactoryBuilder extends BaseAnnotationFactoryBuilder<CommandContext, Void> {

    public static AnnotationFactoryBuilder create() {
        return new AnnotationFactoryBuilder();
    }

}
