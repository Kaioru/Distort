package co.kaioru.distort.d4j

import co.kaioru.avoid.SimpleCommandBuilder
import co.kaioru.avoid.SimpleMiddlewareBuilder

class JDACommandBuilder(name: String) : SimpleCommandBuilder<JDAContext>(name)

class JDAMiddlewareBuilder : SimpleMiddlewareBuilder<JDAContext>()