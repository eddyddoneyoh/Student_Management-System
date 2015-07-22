/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import Student.DisplayStudent;
/**
 *
 * @author user
 */
@Named(value = "displayBean")
@SessionScoped
public class DisplayBean implements Serializable {

    /**
     * Creates a new instance of DisplayBean
     */
    public DisplayBean() {
    }
    
    public List<DisplayStudent> getUserList()
    {
        List<DisplayStudent> list = new ArrayList<DisplayStudent>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            String sql = "select * from studentregistration";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                DisplayStudent dsp = new DisplayStudent();
                dsp.setRegnumber(rs.getLong("regnumber"));
                dsp.setFname(rs.getString("fname"));
                dsp.setLname(rs.getString("lname"));
                dsp.setSclass(rs.getLong("sclass"));
                dsp.setDateofbirth(rs.getDate("dateofbirth"));
                dsp.setAddress(rs.getString("address"));
                dsp.setSex(rs.getString("sex"));
                list.add(dsp);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                con.close();
                ps.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return list;
        
    }
}