
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
    Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/banco","root","admin");
}
