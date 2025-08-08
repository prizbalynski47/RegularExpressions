class LookingForAtState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            " " -> InvalidState()
            "@" -> LookingForPart2State()
            else -> this
        }
}