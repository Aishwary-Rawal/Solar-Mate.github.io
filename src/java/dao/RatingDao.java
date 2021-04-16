package dao;
import java.util.*;
import java.sql.*;
import myconn.GetConnection;
import dto.Rating;

public class RatingDao {
    public int addRating(String company_name, String rate) throws SQLException {
        int i=0;
        int ra = Integer.parseInt(rate);
        Connection con = GetConnection.getConnect();
        String query = "select rating,no_of_ratings from rating where company_name=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, company_name);
        ResultSet rs = ps.executeQuery();
        int r = rs.getInt(1);
        int nor = (rs.getInt(2))+1;
        float sum=(ra+r*(nor-1));
        float rat=sum/nor;
        ps.close();
        con.close();
        Connection conn = GetConnection.getConnect();
        String query1 ="update rating set rating =?,no_of_ratings=? where company_name=?";
        PreparedStatement ps1 = conn.prepareStatement(query1);
        ps1.setFloat(1, rat);
        ps1.setInt(2, nor);
        ps1.setString(3, company_name);
        i= ps1.executeUpdate();
        ps1.close();
        conn.close();
        return i;
    }
}
