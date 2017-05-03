package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionBuilder
import co.kaioru.avoid.reflection.SimpleReflectionProvider

class JDAReflectionGenerator : SimpleReflectionBuilder<JDAContext>()

abstract class JDAReflectionProvider<O : Any> : SimpleReflectionProvider<JDAContext, O>()