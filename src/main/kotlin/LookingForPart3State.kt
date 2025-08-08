class LookingForPart3State: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in " @." -> InvalidState()
            else -> EmailValidState()
        }
}