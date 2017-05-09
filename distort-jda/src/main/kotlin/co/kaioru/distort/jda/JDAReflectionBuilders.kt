package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionBuilder
import co.kaioru.retort.reflection.impl.provider.primitiveProviders

class JDAReflectionBuilder : SimpleReflectionBuilder<JDAContext>() {
    init {
        registerProviders(primitiveProviders())
    }
}