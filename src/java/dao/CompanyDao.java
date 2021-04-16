package dao;
import java.util.*;
import java.sql.*;
import myconn.GetConnection;
import dto.Company;
import java.util.UUID;
public class CompanyDao {
    public int addCompany(Company obj) throws SQLException
    {
        int i=0;
        String id = UUID.randomUUID().toString();
        id = id.replaceAll("-", "");
        Connection con = GetConnection.getConnect();
        String query = "insert into company(id,name ,email,password,contact,address) values (?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, id );
        ps.setString(2, obj.getName());
        ps.setString(3, obj.getEmail());
        ps.setString(4, obj.getPassword());
        ps.setString(5, obj.getContact());
        ps.setString(6, obj.getAddress());
        

        i = ps.executeUpdate();
        ps.close();
        con.close();
        return i;
    }
    
   public int companyLogin(String email,String password) throws SQLException
    {
        int i=0;
        Connection con = GetConnection.getConnect();
        String query = "select * from company where email=? and password=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, password);
        
        
        ResultSet rs = ps.executeQuery();
        if(rs.next())
            i=1;
        ps.close();
        con.close();
        return i;
    }
   public int deleteCompany(String email) throws SQLException
    {
        int i=0;
        Connection con = GetConnection.getConnect();
        String query = "delete  from company where email=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, email);
       
        
        
        i  = ps.executeUpdate();
        
        ps.close();
        con.close();
        return i;
    }
}
