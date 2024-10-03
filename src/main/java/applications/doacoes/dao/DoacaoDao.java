package applications.doacoes.dao;

public class DoacaoDao {
    public String listaDoacoes(){
        String sql = "select * from controle_doacoes";
        return sql;
    }
}
