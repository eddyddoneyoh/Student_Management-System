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

/**
 *
 * @author user
 */
@Named(value = "geology2")
@SessionScoped
public class Geology2 implements Serializable {
    
    private long regnumber; 
    private int geo201Score;
    private String geo201Grade;
    private float geo201Gpa;
    private int geo202Score;
    private String geo202Grade;
    private float geo202Gpa;
    private int math201Score;
    private String math201Grade;
    private float math201Gpa;
    private int gst102Score;
    private String gst102Grade;
    private float gst102Gpa;
    private int phy201Score;
    private String phy201Grade;
    private float phy201Gpa;
    private int chm201Score;
    private String chm201Grade;
    private float chm201Gpa;

    /**
     * Creates a new instance of Geology2
     */
    public Geology2() {
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
     * @return the geo201Score
     */
    public int getGeo201Score() {
        return geo201Score;
    }

    /**
     * @param geo201Score the geo201Score to set
     */
    public void setGeo201Score(int geo201Score) {
        this.geo201Score = geo201Score;
    }

    /**
     * @return the geo201Grade
     */
    public String getGeo201Grade() {
        return geo201Grade;
    }

    /**
     * @param geo201Grade the geo201Grade to set
     */
    public void setGeo201Grade(String geo201Grade) {
        this.geo201Grade = geo201Grade;
    }

    /**
     * @return the geo201Gpa
     */
    public float getGeo201Gpa() {
        return geo201Gpa;
    }

    /**
     * @param geo201Gpa the geo201Gpa to set
     */
    public void setGeo201Gpa(float geo201Gpa) {
        this.geo201Gpa = geo201Gpa;
    }

    /**
     * @return the geo202Score
     */
    public int getGeo202Score() {
        return geo202Score;
    }

    /**
     * @param geo202Score the geo202Score to set
     */
    public void setGeo202Score(int geo202Score) {
        this.geo202Score = geo202Score;
    }

    /**
     * @return the geo202Grade
     */
    public String getGeo202Grade() {
        return geo202Grade;
    }

    /**
     * @param geo202Grade the geo202Grade to set
     */
    public void setGeo202Grade(String geo202Grade) {
        this.geo202Grade = geo202Grade;
    }

    /**
     * @return the geo02Gpa
     */
    public float getGeo202Gpa() {
        return geo202Gpa;
    }

    /**
     * @param geo202Gpa the geo02Gpa to set
     */
    public void setGeo202Gpa(float geo202Gpa) {
        this.geo202Gpa = geo202Gpa;
    }

    /**
     * @return the math201Score
     */
    public int getMath201Score() {
        return math201Score;
    }

    /**
     * @param math201Score the math201Score to set
     */
    public void setMath201Score(int math201Score) {
        this.math201Score = math201Score;
    }

    /**
     * @return the math201Grade
     */
    public String getMath201Grade() {
        return math201Grade;
    }

    /**
     * @param math201Grade the math201Grade to set
     */
    public void setMath201Grade(String math201Grade) {
        this.math201Grade = math201Grade;
    }

    /**
     * @return the math201Gpa
     */
    public float getMath201Gpa() {
        return math201Gpa;
    }

    /**
     * @param math201Gpa the math201Gpa to set
     */
    public void setMath201Gpa(float math201Gpa) {
        this.math201Gpa = math201Gpa;
    }

    /**
     * @return the gst102Score
     */
    public int getGst102Score() {
        return gst102Score;
    }

    /**
     * @param gst102Score the gst102Score to set
     */
    public void setGst102Score(int gst102Score) {
        this.gst102Score = gst102Score;
    }

    /**
     * @return the gst102Grade
     */
    public String getGst102Grade() {
        return gst102Grade;
    }

    /**
     * @param gst102Grade the gst102Grade to set
     */
    public void setGst102Grade(String gst102Grade) {
        this.gst102Grade = gst102Grade;
    }

    /**
     * @return the gst102Gpa
     */
    public float getGst102Gpa() {
        return gst102Gpa;
    }

    /**
     * @param gst102Gpa the gst102Gpa to set
     */
    public void setGst102Gpa(float gst102Gpa) {
        this.gst102Gpa = gst102Gpa;
    }

    /**
     * @return the phy201Score
     */
    public int getPhy201Score() {
        return phy201Score;
    }

    /**
     * @param phy201Score the phy201Score to set
     */
    public void setPhy201Score(int phy201Score) {
        this.phy201Score = phy201Score;
    }

    /**
     * @return the phy201Grade
     */
    public String getPhy201Grade() {
        return phy201Grade;
    }

    /**
     * @param phy201Grade the phy201Grade to set
     */
    public void setPhy201Grade(String phy201Grade) {
        this.phy201Grade = phy201Grade;
    }

    /**
     * @return the phy201Gpa
     */
    public float getPhy201Gpa() {
        return phy201Gpa;
    }

    /**
     * @param phy201Gpa the phy201Gpa to set
     */
    public void setPhy201Gpa(float phy201Gpa) {
        this.phy201Gpa = phy201Gpa;
    }

    /**
     * @return the chm201Score
     */
    public int getChm201Score() {
        return chm201Score;
    }

    /**
     * @param chm201Score the chm201Score to set
     */
    public void setChm201Score(int chm201Score) {
        this.chm201Score = chm201Score;
    }

    /**
     * @return the chm201Grade
     */
    public String getChm201Grade() {
        return chm201Grade;
    }

    /**
     * @param chm201Grade the chm201Grade to set
     */
    public void setChm201Grade(String chm201Grade) {
        this.chm201Grade = chm201Grade;
    }

    /**
     * @return the chm201Gpa
     */
    public float getChm201Gpa() {
        return chm201Gpa;
    }

    /**
     * @param chm201Gpa the chm201Gpa to set
     */
    public void setChm201Gpa(float chm201Gpa) {
        this.chm201Gpa = chm201Gpa;
    }
        public String insert()
    {
        int i = 0;
        
        if (regnumber !=0)
        {
            PreparedStatement ps = null;
            Connection con = null; 
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
                
                String sql = "INSERT INTO geology200(regnumber, geo201Score, geo201Grade, geo201Gpa, geo202Score, geo202Grade, geo202Gpa, math201Score, math201Grade, math201Gpa, gst102Score, gst102Grade, gst102Gpa, phy201Score, phy201Grade, phy201Gpa, chm201Score, chm201Grade, chm201Gpa)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                ps = con.prepareStatement(sql);
                
                ps.setLong(1, regnumber);
                ps.setInt(2, geo201Score);
                ps.setString(3, geo201Grade);
                ps.setFloat(4, geo201Gpa);
                ps.setInt(5, geo202Score);
                ps.setString(6, geo202Grade);
                ps.setFloat(7, geo202Gpa);
                ps.setInt(8, math201Score);
                ps.setString(9, math201Grade);
                ps.setFloat(10, math201Gpa);
                ps.setInt(11, gst102Score);
                ps.setString(12, gst102Grade);
                ps.setFloat(13, gst102Gpa);
                ps.setInt(14, phy201Score);
                ps.setString(15, phy201Grade);
                ps.setFloat(16, phy201Gpa);
                ps.setInt(17, chm201Score);
                ps.setString(18, chm201Grade);
                ps.setFloat(19, chm201Gpa);
                
                
                i = ps.executeUpdate();
                
                System.out.println("Student Exams Records Added Successfully");
            }
            catch(Exception e)
            {
                System.out.println(e);
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
                return "output";
            }
            else
            {
                return "invalid";
            }
    }
        else{
            return "invalid";
        }    
}
}
