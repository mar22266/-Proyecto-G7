public class geografia{

    private String [][] ensena;

    public geografia(){
        ensena = new String[7][2]; 
    }


public String[][] asignar(){
    ensena [0][0] = "DEPARTAMENTOS";
    ensena [0][1] = "CABECERAS";
    ensena [1][0] = "El Progreso";
    ensena [1][1] = "Guastatoya";
    ensena [2][0] = "Peten";
    ensena [2][1] = "Flores";
    ensena [3][0] = "Alta Verapaz";
    ensena [3][1] = "Coban";
    ensena [4][0] = "Escuintla";
    ensena [4][1] = "Escuintla";
    ensena [5][0] = "Santa Rosa";
    ensena [5][1] = "Cuilapa";
    ensena [6][0] = "Zacapa";
    ensena [6][1] = "Zacapa";
    ensena [7][0] = "Guatemala";
    ensena [7][1] = "Guatemala";

    return ensena;
}



    public String[][] getEnsena() {
        return this.ensena;
    }

    public void setEnsena(String[][] ensena) {
        this.ensena = ensena;
    }


    @Override
    public String toString() {

        return "{" +
            " ensena='" + getEnsena() + "'" +
            "}";
        
    }
 

}