import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.Test

class FloatTest {

    private val floatDetector = FloatingPointDetector()

    @Test
    fun detectsValidFloats() {
        assertTrue(floatDetector.isValid("1.5"))
        assertTrue(floatDetector.isValid("0.20000"))
        assertTrue(floatDetector.isValid(".3"))
        assertTrue(floatDetector.isValid("99.999"))
        assertTrue(floatDetector.isValid("4.0"))
        assertTrue(floatDetector.isValid("12349871234.12340981234098"))
    }

    @Test
    fun detectsInvalidFloats() {
        assertFalse(floatDetector.isValid("01.5"))
        assertFalse(floatDetector.isValid("150483"))
        assertFalse(floatDetector.isValid("1a.57"))
        assertFalse(floatDetector.isValid("99.99.9"))
        assertFalse(floatDetector.isValid("$25."))
        assertFalse(floatDetector.isValid(""))
    }
}