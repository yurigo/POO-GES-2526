public class SoundSynthSquare extends SoundSynth {

    @Override
    public double generateFunction(double phase) {
        return (phase < 0.5)
                ? 1.0
                : -1.0;

//        if (phase < 0.5){
//            return 1.0;
//        }
//        else{
//            return -1.0;
//        }
    }
}
