package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionBuilder
import co.kaioru.avoid.reflection.SimpleReflectionProvider

class D4JReflectionGenerator<O : Any> : SimpleReflectionBuilder<D4JContext, O>()

abstract class D4JReflectionProvider<O : Any> : SimpleReflectionProvider<D4JContext, O>()