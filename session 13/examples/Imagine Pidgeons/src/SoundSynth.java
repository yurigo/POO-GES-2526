import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

abstract public class SoundSynth {

    abstract public double generateFunction(double phase);

    public void makeSound(int numberOfTimesFullPerSec, int durationMs) throws LineUnavailableException {
        System.out.println(String.format("Starting to make sound %d at %d ms", numberOfTimesFullPerSec, durationMs));
        byte[] buf = new byte[2];
        int frequency = 44100; //44100 sample points per 1 second
        AudioFormat af = new AudioFormat((float) frequency, 16, 1, true, false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open();
        sdl.start();
        // int durationMs = 1000;
        // int numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
        for (int i = 0; i < durationMs * (float) 44100 / 1000; i++) { //1000 ms in 1 second
            float numberOfSamplesToRepresentFullFunc= (float) frequency / numberOfTimesFullPerSec;
            double phase = i % numberOfTimesFullPerSec / numberOfSamplesToRepresentFullFunc;

            double value = 0.0;
//            if (timbre == Timbre.SINUS){
//                value = Math.sin(2 * Math.PI * phase);
//            }
//            else if (timbre == Timbre.TRIANGLE){
//                value =  4 * Math.abs(phase - 0.5) - 1;
//            }
//            else if (timbre == Timbre.SQUARE){
//                value = (phase < 0.5) ? 1.0 : -1.0;
//            }
//            else if (timbre == Timbre.SAW){
//                value = 2 * phase - 1;
//            }

            value = generateFunction(phase);

            short a = (short) (value * 32767);  //32767 - max value for sample to take (-32767 to 32767)
            buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
            buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
            sdl.write(buf, 0, 2);
        }
        sdl.drain();
        sdl.stop();
    }
}