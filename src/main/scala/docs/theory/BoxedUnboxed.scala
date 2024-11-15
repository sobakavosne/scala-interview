package docs.theory

trait F {}

object BoxedUnboxed {

  def boxedUnboxed = {
    lazy val x = { println("Evaluated!"); 42 }

    println("Print `x` before accessing the `x` value: ")
    println(x)                                            // This triggers the evaluation, prints "Evaluated!" and "42"
    println("Print `x` after `x` value was evaluated: ")
    println(x)                                            // This uses the already evaluated result, prints "42" only}
  }

  lazy val a: scala.math.Numeric[F]              = null // Scala package specific type
  lazy val b: scala.math.Integral[F]             = null // Scala package specific type
  lazy val c: scala.collection.immutable.List[F] = null // Scala package specific type
  lazy val d: scala.util.Either[F, F]            = null // Scala package specific type
  lazy val e: Option[Int]                        = null // or None // Scala type
  lazy val f: Option[F]                          = null // or None // Scala type

  lazy val g: java.lang.Byte  = null
  lazy val h: java.lang.Short = null
  lazy val i: java.lang.Float = null
  lazy val j: java.lang.Long  = null
  // ... other Java types

  lazy val k: BigDecimal = null // `java.math.BigDecimal` alias
  lazy val l: String     = null // `java.lang.String` alias
  lazy val m: BigInt     = null // link to `java.math.BigInteger`
  lazy val n: Character  = null // link to `java.lang.Character`
  lazy val o: Integer    = null // link to `java.lang.Integer`
  lazy val p: AnyRef     = null // `java.lang.Object` alias
  lazy val q: Object     = null // link to `java.lang.Object`
  lazy val r: Dynamic    = null // Scala type (Oh, God)
  lazy val s: Symbol     = null // Scala type
  lazy val t: Any        = null // Scala type
  lazy val u: Tuple      = null // Scala type
  lazy val v: Product    = null // Scala type
  lazy val w: Null       = null // Scala type

  // lazy val error: AnyVal   = null // Scala unboxed type
  // lazy val error: Byte     = null // Scala unboxed type
  // lazy val error: Boolean  = null // Scala unboxed type
  // lazy val error: Char     = null // Scala unboxed type
  // lazy val error: Double   = null // Scala unboxed type
  // lazy val error: Float    = null // Scala unboxed type
  // lazy val error: Short    = null // Scala unboxed type
  // lazy val error: Long     = null // Scala unboxed type
  // lazy val error: Int      = null // Scala unboxed type
  // lazy val error: Unit     = null // pure expression error/warn

// List of unboxed types
  lazy val unboxedTypes: List[String] = List(
    "Byte",
    "Short",
    "Int",
    "Long",
    "Float",
    "Double",
    "Char",
    "Boolean",
    "Unit",
    "AnyVal"
  )

// List of boxed types
  lazy val boxedTypes: List[String] = List(
    // Standard Scala types
    "Option",
    "Some",
    "None",
    "Either",
    "List",
    "Seq",
    "IndexedSeq",
    "Set",
    "Map",
    "Tuple",
    "Symbol",
    "Dynamic",
    "Product",
    "AnyRef",
    "Null",
    "StringContext",
    "Stream",

    // Java-linked types
    "java.lang.Byte",
    "java.lang.Short",
    "java.lang.Integer",
    "java.lang.Long",
    "java.lang.Float",
    "java.lang.Double",
    "java.lang.Character",
    "java.lang.Boolean",
    "java.lang.String",
    "java.math.BigDecimal",
    "java.math.BigInteger",
    "java.util.Optional",
    "java.lang.Object"
  )

}
