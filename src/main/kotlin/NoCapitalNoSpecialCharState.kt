class NoCapitalNoSpecialCharState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in SPECIAL_CHARS -> NoCapitalState()
            in CAPITAL_LETTERS -> NoSpecialCharState()
            else -> this
        }
}