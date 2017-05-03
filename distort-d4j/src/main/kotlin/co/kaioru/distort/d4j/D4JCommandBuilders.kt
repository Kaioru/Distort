package co.kaioru.distort.d4j

import co.kaioru.avoid.SimpleCommandBuilder
import co.kaioru.avoid.SimpleMiddlewareBuilder

class D4JCommandBuilder(name: String) : SimpleCommandBuilder<D4JContext>(name)

class D4JMiddlewareBuilder : SimpleMiddlewareBuilder<D4JContext>()