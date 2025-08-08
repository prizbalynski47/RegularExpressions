interface Detector {
    var state: State

    fun isValid(string: String): Boolean {
        for (letter in string) {
            state = state.consumeLetter(letter.toString())
        }
        return state is ValidState
    }
}