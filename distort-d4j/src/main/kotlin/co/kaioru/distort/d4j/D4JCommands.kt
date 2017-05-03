package co.kaioru.distort.d4j

import co.kaioru.avoid.SimpleCommand
import co.kaioru.avoid.SimpleCommandRegistry
import co.kaioru.avoid.SimpleContext
import co.kaioru.avoid.SimpleMiddleware
import sx.blah.discord.handle.obj.IMessage

class D4JContext(val message: IMessage) : SimpleContext()

abstract class D4JCommand(name: String) : SimpleCommand<D4JContext>(name)

abstract class D4JMiddleware : SimpleMiddleware<D4JContext>()

class D4JCommandRegistry : SimpleCommandRegistry<D4JContext>() {
    fun process(message: IMessage, text: String): Void {
        return process(D4JContext(message), text)
    }
}