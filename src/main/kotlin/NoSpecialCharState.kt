class NoSpecialCharState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in SPECIAL_CHARS -> EndingWithSpecialCharState()
            else -> this
        }
}