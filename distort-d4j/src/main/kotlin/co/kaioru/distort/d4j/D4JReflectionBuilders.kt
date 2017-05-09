package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionBuilder
import co.kaioru.retort.reflection.impl.provider.primitiveProviders
import sx.blah.discord.handle.obj.IMessage

class D4JReflectionBuilder : SimpleReflectionBuilder<D4JContext>() {
    init {
        registerProviders(primitiveProviders())
        registerProviders(listOf(
                ContextProvider(),
                MessageProvider()
        ))
    }
}

class ContextProvider : D4JReflectionProvider<D4JContext>() {
    override val type: Class<D4JContext> = D4JContext::class.java

    override fun provide(input: D4JContext): D4JContext {
        return input
    }
}

class MessageProvider : D4JReflectionProvider<IMessage>() {
    override val type: Class<IMessage> = IMessage::class.java

    override fun provide(input: D4JContext): IMessage {
        return input.message
    }
}