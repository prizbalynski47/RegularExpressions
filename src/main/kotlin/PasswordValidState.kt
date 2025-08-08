class PasswordValidState: ValidState() {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in SPECIAL_CHARS -> EndingWithSpecialCharState()
            else -> this
        }
}