package netschool;

import java.sql.Connection;
import conexao.Conexao;

/**
 * @author Willian
 * @author Lucas
 */
public class NetSchool {
    
    public static void main(String[] args) {
        Connection conexao = Conexao.newInstance().getConn();
        if (conexao != null) {
            System.out.println("Aqui");
        }
    }
    
}
