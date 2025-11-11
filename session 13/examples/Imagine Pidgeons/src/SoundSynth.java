import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

abstract public class SoundSynth {

    abstract public double generateFunction(double phase);

//    public void makeSound(double numberOfTimesFullPerSec, double durationMs) throws LineUnavailableException {
//        System.out.println(String.format("Starting to make sound %f at %f ms", numberOfTimesFullPerSec, durationMs));
//        byte[] buf = new byte[2];
//        int frequency = 44100; //44100 sample points per 1 second
//        AudioFormat af = new AudioFormat((float) frequency, 16, 1, true, false);
//        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
//        sdl.open();
//        sdl.start();
//        // int durationMs = 1000;
//        // int numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
//        for (int i = 0; i < durationMs * (double) 44100 / 1000; i++) { //1000 ms in 1 second
//            double numberOfSamplesToRepresentFullFunc= (double) frequency / numberOfTimesFullPerSec;
//            double phase = i % numberOfTimesFullPerSec / numberOfSamplesToRepresentFullFunc;
//
//            double value = generateFunction(phase);
//
//            short a = (short) (value * 32767);  //32767 - max value for sample to take (-32767 to 32767)
//            buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
//            buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
//            sdl.write(buf, 0, 2);
//        }
//        sdl.drain();
//        sdl.stop();
//    }

    public void makeSound(double freqHz, double durationMs) throws LineUnavailableException {
        makeSound(freqHz, durationMs, 5.0, 5.0); // fade-in/out por defecto: 5 ms
    }

    public void makeSound(double freqHz, double durationMs, double fadeInMs, double fadeOutMs)
            throws LineUnavailableException {

        System.out.printf("Starting to make sound %.2f Hz at %.0f ms (fadeIn=%.1f ms, fadeOut=%.1f ms)%n",
                freqHz, durationMs, fadeInMs, fadeOutMs);

        byte[] buf = new byte[2];
        final int sampleRate = 44100;
        AudioFormat af = new AudioFormat(sampleRate, 16, 1, true, false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();

        int totalSamples = (int) Math.round(durationMs / 1000.0 * sampleRate);
        int fadeInSamples  = (int) Math.max(0, Math.round(fadeInMs  / 1000.0 * sampleRate));
        int fadeOutSamples = (int) Math.max(0, Math.round(fadeOutMs / 1000.0 * sampleRate));

        // -3 dB para evitar picos inter-muestra
        final double gain = Math.pow(10.0, -3.0 / 20.0);

        for (int i = 0; i < totalSamples; i++) {
            double t = i / (double) sampleRate;     // tiempo (s)
            double phase = (t * freqHz) % 1.0;      // [0,1)
            double value = generateFunction(phase); // -1..1

            // --- envolvente lineal ---
            double in  = fadeInSamples  > 0 ? clamp01(i / (double) fadeInSamples) : 1.0;
            double out = fadeOutSamples > 0 ? clamp01((totalSamples - 1 - i) / (double) fadeOutSamples) : 1.0;
            double env = Math.min(in, out);         // triángulo: sube al principio, baja al final

            // aplica ganancia global + envolvente
            double sample = value * env * gain;

            short a = (short) Math.round(sample * 32767.0);
            buf[0] = (byte) (a & 0xFF);
            buf[1] = (byte) (a >> 8);
            sdl.write(buf, 0, 2);
        }

        sdl.drain();
        sdl.stop();
        // sdl.close();
    }

    private static double clamp01(double x) {
        if (x < 0) return 0;
        if (x > 1) return 1;
        return x;
    }

}