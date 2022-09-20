import java.sql.*;

public class Principal {
    //URL do Banco de Dados
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/sistemaAlbuns";

    public static void main(String[] args) {
        Connection connection = null; //responsável por gerenciar nossa conexao com o banco
        Statement stm = null; //responsável pelas instruções de consulta no banco
        ResultSet rs = null; //responsável por gerenciar o resultado de uma consulta

        try
        {
            //estabeler uma conexao com o banco
            connection = DriverManager.getConnection(DATABASE_URL,"root","vip12345");
            //criar um statement para realizar a consulta no banco
            stm = connection.createStatement();
            //consulta o banco
            rs = stm.executeQuery("select * from albuns");
            //apresentar o resultado
            while(rs.next()){
                System.out.println(rs.getInt(1) +
                       " " + rs.getString(2) +
                        " " + rs.getString(3));
            }
            connection.close();
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
    }
}
