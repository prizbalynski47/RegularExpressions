class FloatingPointDetector: Detector {
    override val startState: State = FloatingFirstValueState()
}