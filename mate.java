/*
 * author: Nelson Eduardo García Bravatti
 * 22434
 * fecha: 28-9-2022.-.
 * clase mate, se encarga de la materia matemática
 */


import java.util.ArrayList;

public class mate {

    private int Progreso;
    private int Errores;
    private ArrayList<String> Ejercicios;
    private ArrayList<String> Respuestas; 

    public mate() {
    }

    public mate(int Progreso, int Errores, ArrayList<String> Ejercicios, ArrayList<String> Respuestas) {
        this.Progreso = Progreso;
        this.Errores = Errores;
        this.Ejercicios = Ejercicios;
        this.Respuestas = Respuestas;
    }

    public int getProgreso() {
        return this.Progreso;
    }

    public void setProgreso(int Progreso) {
        this.Progreso = Progreso;
    }

    public int getErrores() {
        return this.Errores;
    }

    public void setErrores(int Errores) {
        this.Errores = Errores;
    }

    public ArrayList<String> getEjercicios() {
        return this.Ejercicios;
    }

    public void setEjercicios(ArrayList<String> Ejercicios) {
        this.Ejercicios = Ejercicios;
    }

    public ArrayList<String> getRespuestas() {
        return this.Respuestas;
    }

    public void setRespuestas(ArrayList<String> Respuestas) {
        this.Respuestas = Respuestas;
    }

    public mate Progreso(int Progreso) {
        setProgreso(Progreso);
        return this;
    }

    public mate Errores(int Errores) {
        setErrores(Errores);
        return this;
    }

    public mate Ejercicios(ArrayList<String> Ejercicios) {
        setEjercicios(Ejercicios);
        return this;
    }

    public mate Respuestas(ArrayList<String> Respuestas) {
        setRespuestas(Respuestas);
        return this;
    }

       
    @Override
    public String toString() {
        return "{" +
            " Progreso='" + getProgreso() + "'" +
            ", Errores='" + getErrores() + "'" +
            ", Ejercicios='" + getEjercicios() + "'" +
            ", Respuestas='" + getRespuestas() + "'" +
            "}";
    }

    public void sumar(){

    }

    public void restar(){

    }


    
}
