class LookingForPeriodState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in " @" -> InvalidState()
            "." -> LookingForPart3State()
            else -> this
        }
}