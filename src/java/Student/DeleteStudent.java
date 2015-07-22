/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author user
 */
@Named(value = "deleteStudent")
@SessionScoped
public class DeleteStudent implements Serializable {

    /**
     * Creates a new instance of DeleteStudent
     */
    private String fname;
    private String lname;
    private long regnumber;
    private long sclass;
    private Date dateofbirth;
    private String address;
    private String sex;
    
    
    public DeleteStudent() {
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the regnumber
     */
    public long getRegnumber() {
        return regnumber;
    }

    /**
     * @param regnumber the regnumber to set
     */
    public void setRegnumber(long regnumber) {
        this.regnumber = regnumber;
    }

    /**
     * @return the sclass
     */
    public long getSclass() {
        return sclass;
    }

    /**
     * @param sclass the sclass to set
     */
    public void setSclass(long sclass) {
        this.sclass = sclass;
    }

    /**
     * @return the dateofbirth
     */
    public Date getDateofbirth() {
        return dateofbirth;
    }

    /**
     * @param dateofbirth the dateofbirth to set
     */
    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void delete(long regnumber)
    {
        PreparedStatement ps = null;
        Connection con = null;
        if (regnumber !=0)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
                String sql = "DELETE FROM studentregistration WHERE regnumber="+regnumber;
                ps = con.prepareStatement(sql);
                int i = ps.executeUpdate();
                if(i > 0)
                {
                    System.out.println("Row Deleted Successfully");
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
        }
    }
    
}
