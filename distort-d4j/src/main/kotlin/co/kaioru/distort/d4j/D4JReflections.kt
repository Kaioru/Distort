package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionGenerator
import co.kaioru.avoid.reflection.SimpleReflectionProvider
import co.kaioru.retort.reflection.impl.provider.primitiveProviders

class D4JReflectionGenerator<O : Any> : SimpleReflectionGenerator<D4JContext, O>() {
    init {
        registerProviders(primitiveProviders())
    }
}

abstract class D4JReflectionProvider<O : Any> : SimpleReflectionProvider<D4JContext, O>()