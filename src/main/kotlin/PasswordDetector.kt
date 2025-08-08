class PasswordDetector: Detector {
    override var startState: State = NoCapitalNoSpecialCharState()

    override fun isValid(string: String): Boolean {
//        var state = startState
//        for (letter in string) {
//            state = state.consumeLetter(letter.toString())
//        }
//        return (state is ValidState) and (string.length > 7)
        return super.isValid(string) and (string.length > 7)
    }
}