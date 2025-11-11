public enum Notes {
    C(16.35),
    C_SHARP(17.32),
    D(18.35), D_SHARP(19.45),
    E(20.60), F(21.83), F_SHARP(23.12), G(24.50),
    G_SHARP(25.96), A(27.50), A_SHARP(29.14), B(30.87);

    private final double baseFreq; // frecuencia en la octava 0

    Notes(double baseFreq) {
        this.baseFreq = baseFreq;
    }

    public double getFrequency(int octave) {
        return baseFreq * Math.pow(2, octave);
    }
}