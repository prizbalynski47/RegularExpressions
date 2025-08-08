class WaitingForTrailing1State: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "0" -> this
            "1" -> Binary1And1ValidState()
            else -> InvalidState()
        }
}