package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionBuilder
import co.kaioru.avoid.reflection.SimpleReflectionProvider
import co.kaioru.retort.reflection.impl.provider.primitiveProviders

class D4JReflectionGenerator : SimpleReflectionBuilder<D4JContext>() {
    init {
        registerProviders(primitiveProviders())
    }
}

abstract class D4JReflectionProvider<O : Any> : SimpleReflectionProvider<D4JContext, O>()