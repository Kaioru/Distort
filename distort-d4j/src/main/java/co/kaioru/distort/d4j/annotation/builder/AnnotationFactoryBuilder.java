package co.kaioru.distort.d4j.annotation.builder;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.distort.d4j.reflection.builder.ReflectionGeneratorBuilder;
import co.kaioru.retort.annotation.adapter.AliasAnnotationProcessor;
import co.kaioru.retort.annotation.adapter.CommandAnnotationGenerator;
import co.kaioru.retort.annotation.adapter.DescriptionAnnotationProcessor;
import co.kaioru.retort.annotation.adapter.ReferenceAnnotationGenerator;
import co.kaioru.retort.annotation.builder.BaseAnnotationFactoryBuilder;

public class AnnotationFactoryBuilder extends BaseAnnotationFactoryBuilder<CommandContext, Void> {

    public static AnnotationFactoryBuilder create() {
        AnnotationFactoryBuilder builder = new AnnotationFactoryBuilder();

        builder.withAdapter(ReflectionGeneratorBuilder.create().build())
                .withAdapter(new CommandAnnotationGenerator<>(CommandContext.class, Void.TYPE))
                .withAdapter(new ReferenceAnnotationGenerator<>())
                .withAdapter(new AliasAnnotationProcessor<>())
                .withAdapter(new DescriptionAnnotationProcessor<>());
        return builder;
    }

}
