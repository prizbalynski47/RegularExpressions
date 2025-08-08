class EmailValidState: ValidState() {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in "@. " -> InvalidState()
            else -> this
        }
}