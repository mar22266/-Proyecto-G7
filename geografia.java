public class geografia{

    private String [][] ensena;

    public geografia(){
        ensena = new String[8][2]; 

    }


public void asignarValores(){
    ensena [0][0] = "\nDEPARTAMENTOS" + " ";
    ensena [0][1] = "\tCABECERAS" + "\n\n";
    ensena [1][0] = "-El Progreso" + " ";
    ensena [1][1] = "\tGuastatoya"+ "\n";
    ensena [2][0] = "-Peten"+ " ";
    ensena [2][1] = "\t\t-Flores"+ "\n";
    ensena [3][0] = "-Alta Verapaz"+ " ";
    ensena [3][1] = "\t-Coban"+ "\n";
    ensena [4][0] = "-Escuintla"+ " ";
    ensena [4][1] = "\t-Escuintla"+ "\n";
    ensena [5][0] = "-Santa Rosa"+ " ";
    ensena [5][1] = "\t-Cuilapa"+ "\n";
    ensena [6][0] = "-Zacapa"+" ";
    ensena [6][1] = "\t-Zacapa"+ "\n";
    ensena [7][0] = "-Guatemala"+ " ";
    ensena [7][1] = "\t-Guatemala"+ "\n";


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