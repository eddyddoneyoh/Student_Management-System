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
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
//import Student.SingleStudentDisplay;

/**
 *
 * @author user
 */
@Named(value = "singleStudentDisplayBean")
@SessionScoped
public class SingleStudentDisplayBean implements Serializable {
    
    private String fname;
    private String lname;
    private long regnumber;
    private long sclass;
    private Date dateofbirth;
    private String street;
    private String sex;
    private String city;
    private String state;
    private String country;
    private String password;
    private String email;
    private long phone;

    /**
     * Creates a new instance of SingleStudentDisplayBean
     */
    private long sregnumber;
    
    public SingleStudentDisplayBean() {
    }
    
    public void studentInfo()
    {
        //List<SingleStudentDisplay> user = new ArrayList<SingleStudentDisplay>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            
            //SingleStudentDisplay display = new SingleStudentDisplay();
            String str = "select * from studentsregistration where regnumber = ?";
            ps = con.prepareStatement(str);
            ps.setLong(1, sregnumber);
            rs = ps.executeQuery();
            while(rs.next())
            {
                setRegnumber(rs.getLong("regnumber"));
                setFname(rs.getString("fname"));
                setLname(rs.getString("lname"));
                setSclass(rs.getLong("sclass"));
                setDateofbirth(rs.getDate("dateofbirth"));
                setSex(rs.getString("sex"));
                setCity(rs.getString("city"));
                setCountry(rs.getString("country"));
                setPassword(rs.getString("password"));
                setEmail(rs.getString("email"));
                setPhone(rs.getLong("phone"));
                setStreet(rs.getString("street"));
                setState(rs.getString("state"));
                //user.add(display);
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
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        //return user;
    }

    /**
     * @return the sregnumber
     */
    public long getSregnumber() {
        return sregnumber;
    }

    /**
     * @param sregnumber the sregnumber to set
     */
    public void setSregnumber(long sregnumber) {
        this.sregnumber = sregnumber;
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
}
