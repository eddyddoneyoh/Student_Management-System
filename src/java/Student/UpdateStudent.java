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
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;
/**
 *
 * @author user
 */
@Named(value = "updateStudent")
@SessionScoped
public class UpdateStudent implements Serializable {

    /**
     * Creates a new instance of UpdateStudent
     */
    private String fname;
    private String lname;
    private long regnumber;
    private long sclass;
    private Date dateofbirth;
    private String sex;
    private String email;
    private long phone;
    private String password;
    private String street;
    private String state;
    private String city;
    private String country;
    
    public UpdateStudent() {
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
    
    public String update()
    {
        PreparedStatement ps = null;
        Connection con = null;
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        int i = 0;
        
        if (regnumber !=0)
        {
            try
            {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            String sql = "UPDATE studentsregistration SET regnumber = ?, fname = ?, lname = ?, sclass = ?, dateofbirth = ?, sex = ?, email = ?, phone = ?, password = ?, street = ?, state = ?, city = ?, country = ?";
            
                ps = con.prepareStatement(sql);

                ps.setLong(1, regnumber);
                ps.setString(2, fname);
                ps.setString(3, lname);
                ps.setLong(4, sclass);
                if(dateofbirth !=null)
                {
                    String date = fmt.format(dateofbirth);
                    Object obj = date;
                    if(obj == null)
                    {
                        ps.setDate(5, null);
                    }
                    else
                    {
                        java.sql.Date dt = java.sql.Date.valueOf(new String(date));
                        ps.setDate(5, dt);
                    }
                }
                ps.setString(6, sex);
                ps.setString(7, email);
                ps.setLong(8, phone);
                ps.setString(9, password);
                ps.setString(10, street);
                ps.setString(11, state);
                ps.setString(12, city);
                ps.setString(13, country);
                
                i = ps.executeUpdate();
                System.out.println("Update Data Added Successfully");
                User user = new User();
                if (i > 0)
                {
                        user.setEditable(false); 
                } 
                else
                {
                    user.setEditable(true);
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
            if(i > 0)
            {
                return "updateoutput";
            }
            else
            {
                return "updateinvalid";
            }
            
        }
        else
        {
            return "updateinvalid";
        }
    }
    public String editAction(User user)
    { 
        try
        {
            user.setEditable(true);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return null;
        
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public long getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
