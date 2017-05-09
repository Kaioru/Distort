package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionBuilder
import co.kaioru.retort.reflection.impl.provider.primitiveProviders
import net.dv8tion.jda.core.entities.Message

class JDAReflectionBuilder : SimpleReflectionBuilder<JDAContext>() {
    init {
        registerProviders(primitiveProviders())
        registerProviders(listOf(
                ContextProvider(),
                MessageProvider()
        ))
    }
}

class ContextProvider : JDAReflectionProvider<JDAContext>() {
    override val type: Class<JDAContext> = JDAContext::class.java

    override fun provide(input: JDAContext): JDAContext {
        return input
    }
}

class MessageProvider : JDAReflectionProvider<Message>() {
    override val type: Class<Message> = Message::class.java

    override fun provide(input: JDAContext): Message {
        return input.message
    }
}