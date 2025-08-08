class IntegerFirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in NON_ZERO_DIGITS -> FloatingOrIntegerValidState()
            else -> InvalidState()
        }
}