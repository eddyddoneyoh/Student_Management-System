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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
/**
 *
 * @author user
 */
@Named(value = "updateStudentBean")
@SessionScoped
public class UpdateStudentBean implements Serializable {

    /**
     * Creates a new instance of UpdateStudentBean
     */
    
    public UpdateStudentBean() {
    }
    
List<User> list;
PreparedStatement ps = null;
Connection con = null;
ResultSet rs = null;

public List<User> getList() {
return list;
}

public List<User> getUserList()
{
    list = new ArrayList<User>();
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
    
    String sql = "select * from studentsregistration";
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    while (rs.next())
    {
        User usr = new User();
        usr.setDregnumber(rs.getLong("regnumber"));
        usr.setDfname(rs.getString("fname"));
        usr.setDlname(rs.getString("lname"));
        usr.setDsclass(rs.getLong("sclass"));
        usr.setDdateofbirth(rs.getDate("dateofbirth"));
        usr.setDsex(rs.getString("sex"));
        usr.setDemail(rs.getString("email"));
        usr.setDphone(rs.getLong("phone"));
        usr.setDpassword(rs.getString("password"));
        usr.setDstreet(rs.getString("street"));
        usr.setDstate(rs.getString("state"));
        usr.setDcity(rs.getString("city"));
        usr.setDcountry(rs.getString("country"));

        list.add(usr);
        Map<Long, Boolean> checked = new HashMap<Long, Boolean>();
        List<User> checkedItems = new ArrayList<User>();
        for (User item : list)
        {
            if(checked.get(item.getDregnumber())!=null)
                checkedItems.add(item);
            UpdateStudent upd = new UpdateStudent();
            upd.update();
        }
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
