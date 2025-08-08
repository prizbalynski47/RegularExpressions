class Binary1And1FirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "1" -> Binary1And1ValidState()
            else -> InvalidState()
        }
}