package hu.petrik.konyvtarasztali;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	    if (true){
            Statisztika stat = new Statisztika();
            System.out.println(stat);
            try {
                stat.readData();
            } catch (SQLException e){
                System.out.println("Hiba az adatbázis kapcsolatban");
            }
            System.out.println(stat.konyvLista);
            //TODO: konzolos feladatok indítása
        } else {
            //TODO: grafikus alkalmazás indítása
        }
    }
}
