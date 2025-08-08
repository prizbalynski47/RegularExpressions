class Binary1And1ValidState: ValidState() {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "1" -> this
            "0" -> WaitingForTrailing1State()
            else -> InvalidState()
        }
}