package netschool.conexao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import conexao.Conexao;
import java.sql.Connection;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author wmfsystem
 */
public class ConexaoTest {

    private static Connection conn;

    public ConexaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        conn = Conexao.newInstance().getConn();
    }

    @Test
    public void hello() {
        Assert.assertNotNull(conn);
    }
}
