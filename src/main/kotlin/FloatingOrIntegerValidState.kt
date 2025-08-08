class FloatingOrIntegerValidState: ValidState() {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in DIGITS -> this
            else -> InvalidState()
        }
}