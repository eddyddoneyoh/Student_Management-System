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
import Student.DeleteStudent;

/**
 *
 * @author user
 */
@Named(value = "deleteStudentBean")
@SessionScoped
public class DeleteStudentBean implements Serializable {

    /**
     * Creates a new instance of DeleteStudentBean
     */
    public DeleteStudentBean() {
    }
    
List<DeleteStudent> list;
PreparedStatement ps = null;
Connection con = null;
ResultSet rs = null;


public List<DeleteStudent> getList()
{
    return list;
}

public List<DeleteStudent> getUserList()
{
    
list = new ArrayList<DeleteStudent>();
try
{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
    String sql = "select * from studentregistration";
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    while (rs.next())
    {
        DeleteStudent dls = new DeleteStudent();
        
                dls.setRegnumber(rs.getLong("regnumber"));
                dls.setFname(rs.getString("fname"));
                dls.setLname(rs.getString("lname"));
                dls.setSclass(rs.getLong("sclass"));
                dls.setDateofbirth(rs.getDate("dateofbirth"));
                dls.setAddress(rs.getString("address"));
                dls.setSex(rs.getString("sex"));
                list.add(dls);
                Map<Long, Boolean> checked = new HashMap<Long, Boolean>();
                List<DeleteStudent> checkedItems = new ArrayList<DeleteStudent>();
                for (DeleteStudent item : list)
                {
                    if (checked.get(item.getRegnumber())!= null)
                    {
                        checkedItems.add(item);
                        dls.delete(dls.getRegnumber());
                    }
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
