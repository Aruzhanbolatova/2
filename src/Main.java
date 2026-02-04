import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Connection c = DatabaseConnection.getConnection();
        if (c == null) return;

        try {
            // WRITE (INSERT)
            String insertSql = "INSERT INTO pet (name, type, age, status, shelter_id) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertPs = c.prepareStatement(insertSql);
            insertPs.setString(1, "TestPet");
            insertPs.setString(2, "Cat");
            insertPs.setInt(3, 2);
            insertPs.setString(4, "available");
            insertPs.setInt(5, 1);
            insertPs.executeUpdate();
            insertPs.close();

            // READ (SELECT)
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT pet_id, name, type, age, status FROM pet ORDER BY pet_id");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("pet_id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("type") + " " +
                                rs.getInt("age") + " " +
                                rs.getString("status")
                );
            }

            rs.close();
            st.close();

            // UPDATE
            String updateSql = "UPDATE pet SET status = ? WHERE name = ?";
            PreparedStatement updatePs = c.prepareStatement(updateSql);
            updatePs.setString(1, "adopted");
            updatePs.setString(2, "TestPet");
            updatePs.executeUpdate();
            updatePs.close();

            // DELETE
            String deleteSql = "DELETE FROM pet WHERE name = ?";
            PreparedStatement deletePs = c.prepareStatement(deleteSql);
            deletePs.setString(1, "TestPet");
            deletePs.executeUpdate();
            deletePs.close();

            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}