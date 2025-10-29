public class SoundSynthSaw extends SoundSynth {

    @Override
    public double generateFunction(double phase) {
        return 2 * phase - 1;
    }
}
