class FirstDigit0State: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "." -> HasDecimalState()
            else -> InvalidState()
        }
}