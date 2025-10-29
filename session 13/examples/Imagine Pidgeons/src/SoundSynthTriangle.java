public class SoundSynthTriangle extends SoundSynth{

    @Override
    public double generateFunction(double phase) {
        return 4 * Math.abs(phase - 0.5) - 1;
    }
}
