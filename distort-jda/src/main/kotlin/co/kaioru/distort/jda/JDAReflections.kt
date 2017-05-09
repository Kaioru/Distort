package co.kaioru.distort.d4j

import co.kaioru.avoid.reflection.SimpleReflectionGenerator
import co.kaioru.avoid.reflection.SimpleReflectionProvider

class JDAReflectionGenerator<O : Any> : SimpleReflectionGenerator<JDAContext, O>()

abstract class JDAReflectionProvider<O : Any> : SimpleReflectionProvider<JDAContext, O>()