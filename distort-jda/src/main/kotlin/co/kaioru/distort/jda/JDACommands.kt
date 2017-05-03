package co.kaioru.distort.d4j

import co.kaioru.avoid.SimpleCommand
import co.kaioru.avoid.SimpleCommandRegistry
import co.kaioru.avoid.SimpleContext
import co.kaioru.avoid.SimpleMiddleware
import net.dv8tion.jda.core.entities.Message

class JDAContext(val message: Message) : SimpleContext()

abstract class JDACommand(name: String) : SimpleCommand<JDAContext>(name)

abstract class JDAMiddleware : SimpleMiddleware<JDAContext>()

class JDACommandRegistry : SimpleCommandRegistry<JDAContext>() {
    fun process(message: Message, text: String): Void {
        return process(JDAContext(message), text)
    }
}