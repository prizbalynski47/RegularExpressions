class LookingForPart2State: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in " @." -> InvalidState()
            else -> LookingForPeriodState()
        }
}