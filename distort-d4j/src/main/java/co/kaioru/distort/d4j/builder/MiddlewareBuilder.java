package co.kaioru.distort.d4j.builder;

import co.kaioru.distort.d4j.CommandContext;
import co.kaioru.retort.builder.BaseMiddlewareBuilder;

public class MiddlewareBuilder extends BaseMiddlewareBuilder<CommandContext> {

    public static MiddlewareBuilder create() {
        return new MiddlewareBuilder();
    }

}
