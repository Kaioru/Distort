package co.kaioru.distort.d4j

import co.kaioru.avoid.annotation.SimpleAnnotationBuilder
import co.kaioru.retort.annotation.impl.adapter.basicGenerators
import co.kaioru.retort.annotation.impl.adapter.basicProcessors

class D4JAnnotationBuilder : SimpleAnnotationBuilder<D4JContext>() {
    init {
        registerAdapters(basicGenerators(D4JContext::class.java, Void::class.java))
        registerAdapters(basicProcessors())
    }
}