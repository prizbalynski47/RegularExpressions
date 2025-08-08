import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.Test

class Binary1And1Test {

    private val binaryDetector = Binary1And1Detector()

    @Test
    fun detectsValidBinary() {
        assertTrue(binaryDetector.isValid("101"))
        assertTrue(binaryDetector.isValid("1"))
        assertTrue(binaryDetector.isValid("111111"))
        assertTrue(binaryDetector.isValid("100001"))
        assertTrue(binaryDetector.isValid("10101011"))
        assertTrue(binaryDetector.isValid("110011001011010010100111011"))
    }

    @Test
    fun detectsInvalidBinary() {
        assertFalse(binaryDetector.isValid("101.01"))
        assertFalse(binaryDetector.isValid("0"))
        assertFalse(binaryDetector.isValid("011"))
        assertFalse(binaryDetector.isValid("1001010"))
        assertFalse(binaryDetector.isValid("125"))
        assertFalse(binaryDetector.isValid(""))
    }
}