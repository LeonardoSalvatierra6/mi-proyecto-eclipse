package ejerciciouno;

import java.util.ArrayList;


public class SistemaTrenes {
    public static void main(String[] args) {
        ArrayList<Tren> listaTrenes = new ArrayList();
        
        try {
            Tren tren1 = new TrenPasajeros("1234", "AVE", 180, 10, 60);
            Tren tren2 = new TrenCarga("1010", "MARKS", 150, 20);
            Tren tren3 = new TrenPasajeros("2020", "AVLO", 80, 15, 50);
            

            listaTrenes.add(tren1);
            listaTrenes.add(tren2);
            listaTrenes.add(tren3);

            for (Tren tren : listaTrenes) {
                tren.mostrarInformacion();
            }

        }

        catch (TrenInvalidoException e) {
            System.out.println("Error al crear tren: " + e.getMessage());
   }
    }
}

