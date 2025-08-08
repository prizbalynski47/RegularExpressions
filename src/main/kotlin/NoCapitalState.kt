class NoCapitalState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in CAPITAL_LETTERS -> PasswordValidState()
            else -> this
        }
}