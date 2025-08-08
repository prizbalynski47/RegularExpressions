import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.Test

class EmailTest {

    private val emailDetector = EmailDetector()

    @Test
    fun detectsValidEmails() {
        assertTrue(emailDetector.isValid("<part1>@<part2>.<part3>"))
        assertTrue(emailDetector.isValid("a@b.c"))
        assertTrue(emailDetector.isValid("joseph.ditton@usu.edu"))
        assertTrue(emailDetector.isValid("{}*$.&$*(@*$%&.*&*"))
        assertTrue(emailDetector.isValid("1@4.0"))
        assertTrue(emailDetector.isValid("a.b.c.d.e@asdf.co"))
    }

    @Test
    fun detectsInvalidEmails() {
        assertFalse(emailDetector.isValid("@b.c"))
        assertFalse(emailDetector.isValid("a@b@c.d"))
        assertFalse(emailDetector.isValid("1a@b.5.7"))
        assertFalse(emailDetector.isValid("asdf jkl@gmail.com"))
        assertFalse(emailDetector.isValid("booga@oas ssd.th"))
        assertFalse(emailDetector.isValid(""))
    }
}