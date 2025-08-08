class PasswordDetector: Detector {
    override var state: State = NoCapitalNoSpecialCharState()

    override fun isValid(string: String): Boolean {
        for (letter in string) {
            state = state.consumeLetter(letter.toString())
        }
        return (state is ValidState) and (string.length > 7)
    }
}