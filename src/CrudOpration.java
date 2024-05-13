import java.sql.*;

public class CrudOpration implements CrudInterFace {
    private Connection con;

    public CrudOpration() {
        this.con = DatabaseConnection.getConnection();
        ;
    }

    @Override
    public Phone save(Phone phone) throws SQLException {
        String sql = "insert into phonebooktb(id,name, phone) values (?, ? , ? )";
//        String sql = "insert into Phone(id,name, phoneno) values ( "
//                + phone.getId() + ',' + phone.getName() + ',' + phone.getPhoneno() + " )";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, phone.getId());
        statement.setString(2, phone.getName());
        statement.setString(3, phone.getPhoneNo());

        int rowInserted = statement.executeUpdate();
        if (rowInserted > 0) {
            System.out.println(" Insert to PhoneNo OK .. ");
        } else {
            System.out.println("Errorr");
        }
        return null;
    }

    @Override
    public Phone update(Phone phone) {
        return null;
    }

    @Override
    public void delete(Phone phone) {

    }

    @Override
    public Phone select(int id) {
        try {
            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery
                    ("select * from phonebooktb where id=" + id);
            Phone result = new Phone();
            while (resultSet.next()) {
                result.setId(resultSet.getInt(1));
                result.setName(resultSet.getString(2));
                result.setPhoneNo(resultSet.getString(3));
            }
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }

    }

    @Override
    public Phone select(String name) {
        try {
            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery
                    ("select * from phonebooktb where name=" + name);
            Phone result = new Phone();
            while (resultSet.next()) {
                result.setId(resultSet.getInt(1));
                result.setName(resultSet.getString(2));
                result.setPhoneNo(resultSet.getString(3));
            }
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @Override
    public Phone GetByPhone(String phoneno) {
        try {
            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery
                    ("select * from phonebooktb where phone='" + phoneno+"'");
            Phone result = new Phone();
            while (resultSet.next()) {
                result.setId(resultSet.getInt(1));
                result.setName(resultSet.getString(2));
                result.setPhoneNo(resultSet.getString(3));
            }
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @Override
    public void GetAll() {
        try {
            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery
                    ("select * from phonebooktb");
            ResultSetMetaData rsMetaData = resultSet.getMetaData();
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
                System.out.printf("%-12s\t", rsMetaData.getColumnName(i));
            System.out.println();
            while (resultSet.next()) {
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
                    System.out.printf("%-12s\t", resultSet.getObject(i));
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
