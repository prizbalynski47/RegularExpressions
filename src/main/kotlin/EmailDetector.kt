class EmailDetector: Detector {
    override val startState: State = LookingForPart1State()
}