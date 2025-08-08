fun main() {
    val myString = "10000101"
    val floatDetector = FloatingPointDetector()
    val intDetector = IntegerDetector()
    val binaryDetector = Binary1And1Detector()

    println(binaryDetector.isValid(myString))
}