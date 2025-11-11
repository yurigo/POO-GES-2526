public class Main {
    public static void main(String[] args) {
        SoundSynth synth = new SoundSynthSinus();
        try {
            int bpm = 120;
            double beat = 60000.0 / bpm; // 1 negra = 500 ms

            // Duraciones relativas (en beats)
            double Q = 1.0;    // negra
            double E = 0.5;    // corchea
            double H = 2.0;    // blanca

            // ---- CUMPLEAÑOS FELIZ ----
            // En tonalidad de DO mayor (C4 = DO)
            play(synth, Notes.C, 4, Q, beat);   // Cum-
            play(synth, Notes.C, 4, E, beat);   // -
            play(synth, Notes.D, 4, Q, beat);   // ple-
            play(synth, Notes.C, 4, Q, beat);   // a-
            play(synth, Notes.F, 4, Q, beat);   // ños
            play(synth, Notes.E, 4, H, beat);   // fe-liz

            play(synth, Notes.C, 4, Q, beat);
            play(synth, Notes.C, 4, E, beat);
            play(synth, Notes.D, 4, Q, beat);
            play(synth, Notes.C, 4, Q, beat);
            play(synth, Notes.G, 4, Q, beat);
            play(synth, Notes.F, 4, H, beat);

            play(synth, Notes.C, 4, Q, beat);
            play(synth, Notes.C, 4, E, beat);
            play(synth, Notes.C, 5, Q, beat);  // (sube a DO5)
            play(synth, Notes.A, 4, Q, beat);
            play(synth, Notes.F, 4, Q, beat);
            play(synth, Notes.E, 4, Q, beat);
            play(synth, Notes.D, 4, H, beat);

            play(synth, Notes.A_SHARP, 4, Q, beat);
            play(synth, Notes.A_SHARP, 4, E, beat);
            play(synth, Notes.A, 4, Q, beat);
            play(synth, Notes.F, 4, Q, beat);
            play(synth, Notes.G, 4, Q, beat);
            play(synth, Notes.F, 4, H, beat);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void play(SoundSynth synth, Notes note, int octave, double beats, double beatMs)
            throws Exception {
        double duration = beats * beatMs;
        synth.makeSound(note.getFrequency(octave), duration);
    }
}
