package co.kaioru.distort.d4j

import co.kaioru.avoid.annotation.SimpleAnnotationFactory
import co.kaioru.avoid.annotation.SimpleAnnotationGenerator
import co.kaioru.avoid.annotation.SimpleAnnotationProcessor

class D4JAnnotationFactory : SimpleAnnotationFactory<D4JContext>()

abstract class D4JAnnotationGenerator : SimpleAnnotationGenerator<D4JContext>()

abstract class D4JAnnotationProcessor : SimpleAnnotationProcessor<D4JContext>()