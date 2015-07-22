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
import java.util.*;

/**
 *
 * @author user
 */
@Named(value = "resultBean")
@SessionScoped
public class ResultBean implements Serializable {

    /**
     * Creates a new instance of ResultBean
     */
    public ResultBean() {
    }
    Connection con;
    Statement st;
    ResultSet rs;
    String str;
    PreparedStatement ps;
    
    private String regnumber;
    private String department;
    private int level;
    
    private String geology;
    private String computerscience;
    private String law;
    
    /**
     * @return the regnumber
     */
    public String getRegnumber() {
        return regnumber;
    }

    /**
     * @param regnumber the regnumber to set
     */
    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }
    
      String result;  
    
    public String checkInput()
    {  
       if ( department.equalsIgnoreCase(geology ) && level == 200)
       {
           String strg = "SELECT * from geology200 where regnumber = ?";
           result = studentResult(strg);
            
       }
       else if(department.equalsIgnoreCase(computerscience) && level == 100)
       {
           String strc = "SELECT * from compscience100 where regnumber = ?";
           result = studentResult(strc);
       }
       else if(department.equalsIgnoreCase(law) && level == 100)
       {
           String strl = "SELECT * from law100 where regnumber = ?";
           result = studentResult(strl);
       }
       else{
           System.out.println("Registration number is not correct, department <" + department + ">, level <" + level + ">");
       }
       
       return result;
       
    }
    
    
    
    private List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
    
    private Map<String, Object> columns = new LinkedHashMap<String, Object>();
    
    public String studentResult(String querry)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","");
            ps = con.prepareStatement(querry);
            ps.setString(1, regnumber);
            
            rs = ps.executeQuery();
            
            
            ResultSetMetaData meta = rs.getMetaData();
            int columnCount = meta.getColumnCount();
            
            while (rs.next()) {          
            for (int i = 1; i <= columnCount; i++) {
                    columns.put(meta.getColumnLabel(i), rs.getObject(i));
              }
                rows.add(columns);
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
        if(rows.size() > 1)
        {
            return "resultpage";
        }
        else{
            return "invalid";
        }
        
    }

    /**
     * @return the rows
     */
    public List<Map<String, Object>> getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(List<Map<String, Object>> rows) {
        this.rows = rows;
    }

    /**
     * @return the columns
     */
    public Map<String, Object> getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(Map<String, Object> columns) {
        this.columns = columns;
    }
}
