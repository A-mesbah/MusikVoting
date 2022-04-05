package Controller;

import model.Gast;
import model.Musikwunsch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Vote;

public class MusikwunschService {

    private Connection con;
    private PreparedStatement stmt;

    public MusikwunschService() throws SQLException {
        this.con = DatenbankConnection.getInstance().getConnection();
    }

    public Connection getCon() {
        return con;
    }

    public PreparedStatement getStmt() {
        return stmt;
    }

    public void addMusikWunsch(Musikwunsch musikwunsch) {
        try {
            String query2 = "INSERT INTO t_musikwunsche\n"
                    + "(Songtitle,band,genre)\n"
                    + "VALUES (?,?,?)";

            String query3 = "INSERT INTO  t_votes\n"
                    + "(PF_Name,PF_Song_id)\n"
                    + "VALUES (?,?)";

            stmt = con.prepareStatement(query2);
            stmt.setString(1, musikwunsch.getSongtitle());
            stmt.setString(2, musikwunsch.getBand());
            stmt.setString(3, musikwunsch.getGenre());
            int affectedRow = stmt.executeUpdate();
            System.out.println(affectedRow + " :affected rows in table t_musikwunsche");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmt.close();
           
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void addnewGust(Gast gast) throws SQLException {
        try {
            String query = "INSERT INTO t_gaste\n"
                    + "(Name)\n"
                    + "VALUES (?)";

            stmt = con.prepareStatement(query);
            stmt.setString(1, gast.getName());
            int affectedRow = stmt.executeUpdate();
            System.out.println(affectedRow + " :affected rows in table t_gaste");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmt.close();
           
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void addnewVote(Vote vote) {
        try {
            String query = "INSERT INTO  t_votes\n"
                    + "(PF_Name,PF_Song_id)\n"
                    + "VALUES (?,?)";

            stmt = con.prepareStatement(query);
            stmt.setString(1, vote.getUserName());
            stmt.setInt(2, vote.getId());

            int affectedRow = stmt.executeUpdate();
            System.out.println(affectedRow + " :affected rows in table t_votes");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmt.close();
             
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public ArrayList<Musikwunsch> getAllmusikwunsches() throws SQLException {

        ArrayList<Musikwunsch> musikwunschArrayList = new ArrayList<>();

        String query = "SELECT * FROM t_musikwunsche";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        Musikwunsch musikwunsch = null;
        while (rs.next()) {
            int songId = rs.getInt(1);
            String songTitle = rs.getString(2);
            String songBand = rs.getString(3);
            String songGenre = rs.getString(4);

            musikwunsch = new Musikwunsch(songId, songTitle, songBand, songGenre);
            musikwunschArrayList.add(musikwunsch);
        }

        return musikwunschArrayList;

    }

}
