class EndingWithSpecialCharState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in SPECIAL_CHARS -> this
            else -> PasswordValidState()
        }
}