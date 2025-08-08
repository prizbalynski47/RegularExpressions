class HasDecimalState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in DIGITS -> FloatingOrIntegerValidState()
            else -> InvalidState()
        }
}