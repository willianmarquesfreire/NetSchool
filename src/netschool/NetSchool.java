package netschool;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sql.CreateTable;

/**
 *
 * @author fernando
 */
public class NetSchool {

    private static Connection connection;
    private static List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        createConnection();
//        createDatabase();
        insertUsuarios();
        selectUsuarios();
    }

    private static void insertUsuarios() {
        try {
            createUsuarios();
            for (Usuario u : usuarios) {
                String sql = "insert into usuario (id, login, senha) values (?, ?, ?)";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setLong(1, u.getId());
                ps.setString(2, u.getLogin());
                ps.setString(3, u.getSenha());
                ps.execute();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static List<Usuario> selectUsuarios() {
        List<Usuario> usuariosRecuperadosDoBanco = new ArrayList<>();
        try {
            String sql = "select id as id, login as login, senha as senha from usuario";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String login = rs.getString("login");
                String senha = rs.getString("senha");

                Usuario u = new Usuario(id, login, senha);
                usuariosRecuperadosDoBanco.add(u);
            }
            System.out.println("Usuários recuperados: " + usuariosRecuperadosDoBanco.size());
            return usuariosRecuperadosDoBanco;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static void createUsuarios() throws SQLException {
        int qtd = selectUsuarios().size();
        if (qtd <= 0) {
            for (int i = 0; i <= 100; i++) {
                Usuario usususu = new Usuario((long) i, "Willian" + i, "senha10" + i);
                usuarios.add(usususu);
            }
        }
        
        
        
    }

    private static void createDatabase() {
        try {
            CreateTable[] sqls = CreateTable.values();
            for (CreateTable ct : sqls) {
                PreparedStatement ps = connection.prepareStatement(ct.getSql());
                ps.execute();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void createConnection() {
        if (connection == null) {
            connection = Conexao.newInstance().getConn();
        }
    }
}
