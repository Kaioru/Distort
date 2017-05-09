package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionBuilder
import co.kaioru.retort.reflection.impl.provider.primitiveProviders

class D4JReflectionBuilder : SimpleReflectionBuilder<D4JContext>() {
    init {
        registerProviders(primitiveProviders())
    }
}