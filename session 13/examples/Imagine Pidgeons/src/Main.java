public class Main {
    public static void main(String[] args) {

        SoundSynth sS = new SoundSynthSinus();
        SoundSynth sT = new SoundSynthTriangle();
        SoundSynth sQ = new SoundSynthSquare();
        SoundSynth sSaw = new SoundSynthSaw();

        try{
            sS.makeSound(440, 1_000);
            sT.makeSound(440, 1_000);
            sQ.makeSound(440, 1_000);
            sSaw.makeSound(440, 1_000);
        }catch (Exception e){
            IO.print(e.getMessage());
        }
    }
}