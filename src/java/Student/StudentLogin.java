/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Date;

/**
 *
 * @author user
 */
@ManagedBean
@Named(value = "studentLogin")
@SessionScoped

public class StudentLogin implements Serializable {
    
    private String regnumber;
    private String password;
    private String dbregnumber;
    private String dbpassword;
    
    private String fname;
    private String lname;
    private String sregnumber;
    private long sclass;
    private java.util.Date dateofbirth;
    private String street;
    private String sex;
    private String city;
    private String state;
    private String country;
    private String spassword;
    private String email;
    private long phone;
    
    /**
     * Creates a new instance of StudentLogin
     */
    public StudentLogin() {
    }

    /**
     * @return the username
     */
    public String getRegnumber() {
        return regnumber;
    }

    /**
     * @param username the username to set
     */
    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
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
     * @return the dbregnumber
     */
    public String getDbregnumber() {
        return dbregnumber;
    }

    /**
     * @param dbusername the dbusername to set
     */
    public void setDbregnumber(String dbregnumber) {
        this.dbregnumber = dbregnumber;
    }

    /**
     * @return the dbpassword
     */
    public String getDbpassword() {
        return dbpassword;
    }

    /**
     * @param dbpassword the dbpassword to set
     */
    public void setDbpassword(String dbpassword) {
        this.dbpassword = dbpassword;
    }
    
    Connection con;
    Statement st;
    ResultSet rs;
    String str;
    
    Statement sta;
    ResultSet rst;
    PreparedStatement ps;
    
    public void connect(String uname)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","");
            
            st = con.createStatement();
            
            str = "SELECT * from studentlogin where regnumber like ('" +uname+"')";
            
            rs = st.executeQuery(str);
            
            while(rs.next()){
                
                //dbregnumber = rs.getString(1).toString();
                //dbpassword = rs.getString(2).toString();
                
                setDbregnumber(rs.getString("regnumber"));
                setDbpassword(rs.getString("password"));
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Exception occur :" + e);
        }
        //If error occur, remove this finally
      /*  finally
            {
                try
                {
                    con.close();
                    st.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            } */
    }
    
    public String checkValidUser()
    {
        connect(regnumber);
        
        if (regnumber.equals(dbregnumber))
        {
            if(password.equals(dbpassword))
            {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","");
                    
                    //sta = con.createStatement();
                    
                    str = "SELECT * from studentsregistration where regnumber = ?";
                    
                    ps = con.prepareStatement(str);
                    ps.setString(1, regnumber);
                    
                    rst = ps.executeQuery();
                    
                    //rst = sta.executeQuery(str);
                    rst.beforeFirst();
                    
                    while(rst.next())
                    {                             
                         setSregnumber(rst.getString("regnumber"));
                         setFname(rst.getString("fname"));
                         setLname(rst.getString("lname"));
                         setSclass(rst.getLong("sclass"));
                         setDateofbirth(rst.getDate("dateofbirth"));
                         setSex(rst.getString("sex"));
                         setCity(rst.getString("city"));
                         setCountry(rst.getString("country"));
                         setSpassword(rst.getString("password"));
                         setEmail(rst.getString("email"));
                         setPhone(rst.getLong("phone"));
                         setStreet(rst.getString("street"));
                         setState(rst.getString("state"));
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
                //sta.close();
                ps.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
                //return null;
                
                return "checking";
            } 
            else
            {
                return "invalidlogin";
            }
        }
        else
        {
            return "invalidlogin";
        }
        
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
     * @return the sregnumber
     */
    public String getSregnumber() {
        return sregnumber;
    }

    /**
     * @param sregnumber the sregnumber to set
     */
    public void setSregnumber(String sregnumber) {
        this.sregnumber = sregnumber;
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
    public java.util.Date getDateofbirth() {
        return dateofbirth;
    }

    /**
     * @param dateofbirth the dateofbirth to set
     */
    public void setDateofbirth(java.util.Date dateofbirth) {
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
     * @return the spassword
     */
    public String getSpassword() {
        return spassword;
    }

    /**
     * @param spassword the spassword to set
     */
    public void setSpassword(String spassword) {
        this.spassword = spassword;
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
