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
@Named(value = "computerSci1")
@SessionScoped
public class ComputerSci1 implements Serializable {
    
    private int cs101Score;
    private String cs101Grade;
    private float cs101Gpa;
    private int cs102Score;
    private String cs102Grade;
    private float cs102Gpa;
    private int gst101Score;
    private String gst101Grade;
    private float gst101Gpa;
    private int gst102Score;
    private String gst102Grade;
    private float gst102Gpa;
    private int phy101Score;
    private String phy101Grade;
    private float phy101Gpa;
    private int chm101Score;
    private String chm101Grade;
    private float chm101Gpa;
    private int zoo101Score;
    private String zoo101Grade;
    private float zoo101Gpa;
    private int bot101Score;
    private String bot101Grade;
    private float bot101Gpa;
    private int math101Score;
    private String math101Grade;
    private float math101Gpa;
    private int math102Score;
    private String math102Grade;
    private float math102Gpa;
    private long regnumber; 
    
    /**
     * Creates a new instance of ComputerSci1
     */
    public ComputerSci1() {
    }

    /**
     * @return the cs101Score
     */
    public int getCs101Score() {
        return cs101Score;
    }

    /**
     * @param cs101Score the cs101Score to set
     */
    public void setCs101Score(int cs101Score) {
        this.cs101Score = cs101Score;
    }

    /**
     * @return the cs101Grade
     */
    public String getCs101Grade() {
        return cs101Grade;
    }

    /**
     * @param cs101Grade the cs101Grade to set
     */
    public void setCs101Grade(String cs101Grade) {
        this.cs101Grade = cs101Grade;
    }

    /**
     * @return the cs101Gpa
     */
    public float getCs101Gpa() {
        return cs101Gpa;
    }

    /**
     * @param cs101Gpa the cs101Gpa to set
     */
    public void setCs101Gpa(float cs101Gpa) {
        this.cs101Gpa = cs101Gpa;
    }

    /**
     * @return the cs102Score
     */
    public int getCs102Score() {
        return cs102Score;
    }

    /**
     * @param cs102Score the cs102Score to set
     */
    public void setCs102Score(int cs102Score) {
        this.cs102Score = cs102Score;
    }

    /**
     * @return the cs102Grade
     */
    public String getCs102Grade() {
        return cs102Grade;
    }

    /**
     * @param cs102Grade the cs102Grade to set
     */
    public void setCs102Grade(String cs102Grade) {
        this.cs102Grade = cs102Grade;
    }

    /**
     * @return the cs102Gpa
     */
    public float getCs102Gpa() {
        return cs102Gpa;
    }

    /**
     * @param cs102Gpa the cs102Gpa to set
     */
    public void setCs102Gpa(float cs102Gpa) {
        this.cs102Gpa = cs102Gpa;
    }

    /**
     * @return the gst101Score
     */
    public int getGst101Score() {
        return gst101Score;
    }

    /**
     * @param gst101Score the gst101Score to set
     */
    public void setGst101Score(int gst101Score) {
        this.gst101Score = gst101Score;
    }

    /**
     * @return the gst101Grade
     */
    public String getGst101Grade() {
        return gst101Grade;
    }

    /**
     * @param gst101Grade the gst101Grade to set
     */
    public void setGst101Grade(String gst101Grade) {
        this.gst101Grade = gst101Grade;
    }

    /**
     * @return the gst101Gpa
     */
    public float getGst101Gpa() {
        return gst101Gpa;
    }

    /**
     * @param gst101Gpa the gst101Gpa to set
     */
    public void setGst101Gpa(float gst101Gpa) {
        this.gst101Gpa = gst101Gpa;
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
     * @return the phy101Score
     */
    public int getPhy101Score() {
        return phy101Score;
    }

    /**
     * @param phy101Score the phy101Score to set
     */
    public void setPhy101Score(int phy101Score) {
        this.phy101Score = phy101Score;
    }

    /**
     * @return the phy101Grade
     */
    public String getPhy101Grade() {
        return phy101Grade;
    }

    /**
     * @param phy101Grade the phy101Grade to set
     */
    public void setPhy101Grade(String phy101Grade) {
        this.phy101Grade = phy101Grade;
    }

    /**
     * @return the phy101Gpa
     */
    public float getPhy101Gpa() {
        return phy101Gpa;
    }

    /**
     * @param phy101Gpa the phy101Gpa to set
     */
    public void setPhy101Gpa(float phy101Gpa) {
        this.phy101Gpa = phy101Gpa;
    }

    /**
     * @return the chm101Score
     */
    public int getChm101Score() {
        return chm101Score;
    }

    /**
     * @param chm101Score the chm101Score to set
     */
    public void setChm101Score(int chm101Score) {
        this.chm101Score = chm101Score;
    }

    /**
     * @return the chm101Grade
     */
    public String getChm101Grade() {
        return chm101Grade;
    }

    /**
     * @param chm101Grade the chm101Grade to set
     */
    public void setChm101Grade(String chm101Grade) {
        this.chm101Grade = chm101Grade;
    }

    /**
     * @return the chm101Gpa
     */
    public float getChm101Gpa() {
        return chm101Gpa;
    }

    /**
     * @param chm101Gpa the chm101Gpa to set
     */
    public void setChm101Gpa(float chm101Gpa) {
        this.chm101Gpa = chm101Gpa;
    }

    /**
     * @return the zoo101Score
     */
    public int getZoo101Score() {
        return zoo101Score;
    }

    /**
     * @param zoo101Score the zoo101Score to set
     */
    public void setZoo101Score(int zoo101Score) {
        this.zoo101Score = zoo101Score;
    }

    /**
     * @return the zoo101Grade
     */
    public String getZoo101Grade() {
        return zoo101Grade;
    }

    /**
     * @param zoo101Grade the zoo101Grade to set
     */
    public void setZoo101Grade(String zoo101Grade) {
        this.zoo101Grade = zoo101Grade;
    }

    /**
     * @return the zoo101Gpa
     */
    public float getZoo101Gpa() {
        return zoo101Gpa;
    }

    /**
     * @param zoo101Gpa the zoo101Gpa to set
     */
    public void setZoo101Gpa(float zoo101Gpa) {
        this.zoo101Gpa = zoo101Gpa;
    }

    /**
     * @return the bot101Score
     */
    public int getBot101Score() {
        return bot101Score;
    }

    /**
     * @param bot101Score the bot101Score to set
     */
    public void setBot101Score(int bot101Score) {
        this.bot101Score = bot101Score;
    }

    /**
     * @return the bot101Grade
     */
    public String getBot101Grade() {
        return bot101Grade;
    }

    /**
     * @param bot101Grade the bot101Grade to set
     */
    public void setBot101Grade(String bot101Grade) {
        this.bot101Grade = bot101Grade;
    }

    /**
     * @return the bot101Gpa
     */
    public float getBot101Gpa() {
        return bot101Gpa;
    }

    /**
     * @param bot101Gpa the bot101Gpa to set
     */
    public void setBot101Gpa(float bot101Gpa) {
        this.bot101Gpa = bot101Gpa;
    }

    /**
     * @return the math101Score
     */
    public int getMath101Score() {
        return math101Score;
    }

    /**
     * @param math101Score the math101Score to set
     */
    public void setMath101Score(int math101Score) {
        this.math101Score = math101Score;
    }

    /**
     * @return the math101Grade
     */
    public String getMath101Grade() {
        return math101Grade;
    }

    /**
     * @param math101Grade the math101Grade to set
     */
    public void setMath101Grade(String math101Grade) {
        this.math101Grade = math101Grade;
    }

    /**
     * @return the math101Gpa
     */
    public float getMath101Gpa() {
        return math101Gpa;
    }

    /**
     * @param math101Gpa the math101Gpa to set
     */
    public void setMath101Gpa(float math101Gpa) {
        this.math101Gpa = math101Gpa;
    }

    /**
     * @return the math102Score
     */
    public int getMath102Score() {
        return math102Score;
    }

    /**
     * @param math102Score the math102Score to set
     */
    public void setMath102Score(int math102Score) {
        this.math102Score = math102Score;
    }

    /**
     * @return the math102Grade
     */
    public String getMath102Grade() {
        return math102Grade;
    }

    /**
     * @param math102Grade the math102Grade to set
     */
    public void setMath102Grade(String math102Grade) {
        this.math102Grade = math102Grade;
    }

    /**
     * @return the math102Gpa
     */
    public float getMath102Gpa() {
        return math102Gpa;
    }

    /**
     * @param math102Gpa the math102Gpa to set
     */
    public void setMath102Gpa(float math102Gpa) {
        this.math102Gpa = math102Gpa;
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
                
                String sql = "INSERT INTO compscience100(regnumber, cs101Score, cs101Grade, cs101Gpa, cs102Score, cs102Grade, cs102Gpa, gst101Score, gst101Grade, gst101Gpa, gst102Score, gst102Grade, gst102Gpa, phy101Score, phy101Grade, phy101Gpa, chm101Score, chm101Grade, chm101Gpa, zoo101Score, zoo101Grade, zoo101Gpa, bot101Score, bot101Grade, bot101Gpa, math101Score, math101Grade, math101Gpa, math102Score, math102Grade, math102Gpa)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                ps = con.prepareStatement(sql);
                
                ps.setLong(1, regnumber);
                ps.setInt(2, cs101Score);
                ps.setString(3, cs101Grade);
                ps.setFloat(4, cs101Gpa);
                ps.setInt(5, cs102Score);
                ps.setString(6, cs102Grade);
                ps.setFloat(7, cs102Gpa);
                ps.setInt(8, gst101Score);
                ps.setString(9, gst101Grade);
                ps.setFloat(10, gst101Gpa);
                ps.setInt(11, gst102Score);
                ps.setString(12, gst102Grade);
                ps.setFloat(13, gst102Gpa);
                ps.setInt(14, phy101Score);
                ps.setString(15, phy101Grade);
                ps.setFloat(16, phy101Gpa);
                ps.setInt(17, chm101Score);
                ps.setString(18, chm101Grade);
                ps.setFloat(19, chm101Gpa);
                ps.setInt(20, zoo101Score);
                ps.setString(21, zoo101Grade);
                ps.setFloat(22, zoo101Gpa);
                ps.setInt(23, bot101Score);
                ps.setString(24, bot101Grade);
                ps.setFloat(25, bot101Gpa);
                ps.setInt(26, math101Score);
                ps.setString(27, math101Grade);
                ps.setFloat(28, math101Gpa);
                ps.setInt(29, math102Score);
                ps.setString(30, math102Grade);
                ps.setFloat(31, math102Gpa);
                
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
