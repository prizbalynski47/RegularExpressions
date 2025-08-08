class HasDigitsState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
        in DIGITS -> this
        "." -> HasDecimalState()
        else -> InvalidState()
    }
}