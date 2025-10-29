public class SoundSynthSinus extends SoundSynth {

    @Override
    public double generateFunction(double phase) {
        return Math.sin(2 * Math.PI * phase);
    }
}
