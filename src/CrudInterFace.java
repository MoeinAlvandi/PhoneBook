import java.sql.ResultSet;
import java.sql.SQLException;

public interface CrudInterFace {
    public abstract Phone save(Phone phone) throws SQLException;
    public abstract Phone update(Phone phone);
    public abstract void delete(Phone phone);
    public abstract Phone select(int id);
    public abstract Phone select(String name);
    public abstract Phone GetByPhone(String phoneno);

    void GetAll();

}
