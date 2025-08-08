import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.Test

class PasswordTest {

    private val passwordDetector = PasswordDetector()

    @Test
    fun detectsValidPasswords() {
        assertTrue(passwordDetector.isValid("aaaaH!aa"))
        assertTrue(passwordDetector.isValid("@#$123ABC"))
        assertTrue(passwordDetector.isValid("1234567*9J"))
        assertTrue(passwordDetector.isValid("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))
        assertTrue(passwordDetector.isValid("@AAAAAAA"))
        assertTrue(passwordDetector.isValid("a.b.c.d.e@aSdf.co"))
    }

    @Test
    fun detectsInvalidPasswords() {
        assertFalse(passwordDetector.isValid("a"))
        assertFalse(passwordDetector.isValid("aaaaaa!a"))
        assertFalse(passwordDetector.isValid("Heelllo!"))
        assertFalse(passwordDetector.isValid("aaaaahaaaaa"))
        assertFalse(passwordDetector.isValid("V#a"))
        assertFalse(passwordDetector.isValid(""))
    }
}