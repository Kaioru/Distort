package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionBuilder
import co.kaioru.avoid.reflection.SimpleReflectionProvider

class D4JReflectionGenerator : SimpleReflectionBuilder<D4JContext>()

abstract class D4JReflectionProvider<O : Any> : SimpleReflectionProvider<D4JContext, O>()