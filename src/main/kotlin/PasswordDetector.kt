class PasswordDetector: Detector {
    override var startState: State = NoCapitalNoSpecialCharState()

    override fun isValid(string: String): Boolean {
        return super.isValid(string) and (string.length > 7)
    }
}