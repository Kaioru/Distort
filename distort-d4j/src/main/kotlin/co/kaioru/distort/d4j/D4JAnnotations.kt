package co.kaioru.distort.d4j

import co.kaioru.avoid.annotation.SimpleAnnotationFactory
import co.kaioru.avoid.annotation.SimpleAnnotationGenerator
import co.kaioru.avoid.annotation.SimpleAnnotationProcessor
import co.kaioru.retort.annotation.impl.adapter.basicGenerators
import co.kaioru.retort.annotation.impl.adapter.basicProcessors

class D4JAnnotationFactory : SimpleAnnotationFactory<D4JContext>() {
    init {
        registerAdapters(basicGenerators(D4JContext::class.java, Void::class.java))
        registerAdapters(basicProcessors())
    }
}

abstract class D4JAnnotationGenerator : SimpleAnnotationGenerator<D4JContext>()

abstract class D4JAnnotationProcessor : SimpleAnnotationProcessor<D4JContext>()