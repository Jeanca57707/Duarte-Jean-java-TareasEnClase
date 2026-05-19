import java.util.*;

public class Paciente {

    private String nombre;
    private double altura;
    private double peso;
    
    public Paciente(){
        
        setNombre("");
        setAltura(0);
        setPeso(0);

    }

    public Paciente(String nombre, double altura, double peso){

        setNombre(nombre);
        setAltura(altura);
        setPeso(peso);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getNombre(){
        return nombre;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }

    public void Registrar(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        setNombre(nombre);
        setAltura(altura);
        setPeso(peso);

    }

    public void imprimir(){

        System.out.println("Nombre: " + getNombre());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("IMC: " + IMC());

        double imc = IMC();
        System.out.println("Estado: " + imc);

    }

    public double IMC(){

        return peso / (altura * altura);

    }

    public void MostrarIMC(){

        System.out.println("Su IMC es de: "+ IMC());
    }

    public void EstadoPac(){

        double imc = IMC();

        if(imc < 18.5){
            System.out.println("Bajo peso.");

        }
        else if (imc >= 18.5 && imc  < 24.9){
            System.out.println("Peso normal");

        }
        else if( imc >24.9 && imc < 29.9){
            System.out.println("Sobre peso");

        }
        else{
            System.out.println("Obesidad");
        }
    }

    
}