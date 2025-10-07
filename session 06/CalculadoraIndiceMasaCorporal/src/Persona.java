public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String nacionalidad;
    private Float peso;
    private Float estatura;

    private Float indiceDeMasaCorporal;

//    public Persona() {
//        this.nombre = "";
//        this.apellido = "";
//        this.edad = 0;
//        this.nacionalidad = "";
//        this.peso = 0.0F;
//        this.estatura = 0.0F;
//    }

    public Persona(
            String nombreYApellido,
            Integer edad,
            String nacionalidad,
            Float peso,
            Float estatura
    ){
        this.nombre = nombreYApellido.split(" ")[0];
        this.apellido = nombreYApellido.split(" ")[1];
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.estatura = estatura;
        // this.indiceDeMasaCorporal = this.calculaIMC();
    }

    public void calculaIMC(){
        // this.indiceDeMasaCorporal = );
    }

    public void showIMC(){

        if (this.indiceDeMasaCorporal == null){
            // calcula
            this.indiceDeMasaCorporal = new Float(CalculadoraIMC.calcula(new Double(this.peso), new Double(this.estatura)));
        }
        System.out.println("IMC: " + this.indiceDeMasaCorporal);


        // System.out.println("IMC: " + this.indiceDeMasaCorporal);
        // System.out.println("IMC: " + new Float(CalculadoraIMC.calcula(new Double(this.peso), new Double(this.estatura))));
    }
}
