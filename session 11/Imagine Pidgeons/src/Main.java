public class Main {
    public static void main(String[] args) {
        SoundSynth synth = new SoundSynth();

        try{
            synth.makeSound(441, 1000);
            synth.makeSound(440, 1000);
            synth.makeSound(700, 1000);
            synth.makeSound(200, 1000);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}