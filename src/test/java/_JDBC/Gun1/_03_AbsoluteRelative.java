package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBCParent {

    @Test
    public void test1() throws SQLException {

        // next(): bulundugu noktadan bir sonraki row
        // previous() : bulundugu yerden bir önceki row
        // absolute(4) : baştan itibaren 4.ROW a gider, direkt verine ROW a gider
        // relative(4) : bulunduğu noktadan 4 sonraki ROW a gider.
        ResultSet rs=statement.executeQuery("select * from film");

        rs.absolute(10); // 10.satira git
        String title = rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(15); // birden baslayarak 15. satira gider
        title = rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(-15); // sondan 15. satira gider
        title = rs.getString("title");
        System.out.println("title = " + title); // WONKA SEA

        rs.relative(5); // en son bulundugun yerden 5 satir git
        title = rs.getString("title");
        System.out.println("title = " + title);

        rs.first(); // ilk satira gider
        title = rs.getString("title");
        System.out.println("title = " + title);

    }

}
