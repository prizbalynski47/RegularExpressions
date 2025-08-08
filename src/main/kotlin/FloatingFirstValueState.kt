class FloatingFirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "0" -> FirstDigit0State()
            in NON_ZERO_DIGITS -> HasDigitsState()
            "." -> HasDecimalState()
            else -> InvalidState()
        }
}