package hu.petrik.konyvtarasztali;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Statisztika {
    public List<Konyv> konyvLista = new ArrayList<>();


    public void readData() throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/konyvek",
                "root", ""
        );
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from books");
        while (rs.next()){
            Konyv konyv = new Konyv(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getInt("publish_year"),
                    rs.getInt("page_count")
            );
            konyvLista.add(konyv);

        }
    }
}
