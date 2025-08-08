class EmailDetector: Detector {
    override var state: State = LookingForPart1State()
}