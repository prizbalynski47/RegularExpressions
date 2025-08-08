interface Detector {
    val startState: State

    fun isValid(string: String): Boolean {
        var state = startState
        for (letter in string) {
            state = state.consumeLetter(letter.toString())
        }
        return state is ValidState
    }
}