package co.kaioru.distort.d4j

import co.kaioru.avoid.annotation.SimpleAnnotationFactory
import co.kaioru.avoid.annotation.SimpleAnnotationGenerator
import co.kaioru.avoid.annotation.SimpleAnnotationProcessor

class JDAAnnotationFactory : SimpleAnnotationFactory<JDAContext>()

abstract class JDAAnnotationGenerator : SimpleAnnotationGenerator<JDAContext>()

abstract class JDAAnnotationProcessor : SimpleAnnotationProcessor<JDAContext>()