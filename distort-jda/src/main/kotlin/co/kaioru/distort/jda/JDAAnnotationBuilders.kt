package co.kaioru.distort.d4j

import co.kaioru.avoid.annotation.SimpleAnnotationBuilder
import co.kaioru.retort.annotation.impl.adapter.basicGenerators
import co.kaioru.retort.annotation.impl.adapter.basicProcessors

class JDAAnnotationBuilder : SimpleAnnotationBuilder<JDAContext>() {
    init {
        registerAdapters(basicGenerators(JDAContext::class.java, Void.TYPE))
        registerAdapters(basicProcessors())
    }
}