class LookingForPart1State: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in " @" -> InvalidState()
            else -> LookingForAtState()
        }
}