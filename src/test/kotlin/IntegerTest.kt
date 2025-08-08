import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.Test

class IntegerTest {

    private val integerDetector = IntegerDetector()

    @Test
    fun detectsValidIntegers() {
        assertTrue(integerDetector.isValid("15"))
        assertTrue(integerDetector.isValid("150483"))
        assertTrue(integerDetector.isValid("3"))
        assertTrue(integerDetector.isValid("99999"))
        assertTrue(integerDetector.isValid("4"))
        assertTrue(integerDetector.isValid("9000"))
    }

    @Test
    fun detectsInvalidIntegers() {
        assertFalse(integerDetector.isValid("015"))
        assertFalse(integerDetector.isValid("150.483"))
        assertFalse(integerDetector.isValid("0"))
        assertFalse(integerDetector.isValid("99a999"))
        assertFalse(integerDetector.isValid("$25"))
        assertFalse(integerDetector.isValid(""))
    }
}