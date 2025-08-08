fun main() {
    val myString = "{}*\\$.&\\$*(@*\\$%&.*&*"
    val floatDetector = FloatingPointDetector()
    val intDetector = IntegerDetector()
    val binaryDetector = Binary1And1Detector()
    val emailDetector = EmailDetector()

    println(emailDetector.isValid(myString))
}