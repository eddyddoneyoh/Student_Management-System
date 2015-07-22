/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */
@Named(value = "user")
@SessionScoped
public class User implements Serializable {

    /**
     * Creates a new instance of User
     */
    private String dfname;
    private String dlname;
    private long dregnumber;
    private long dsclass;
    private Date ddateofbirth;
    private String dsex;
    private String demail;
    private long dphone;
    private String dpassword;
    private String dstreet;
    private String dstate;
    private String dcity;
    private String dcountry;
    private boolean editable;
    
    public User() {
    }

    /**
     * @return the dfname
     */
    public String getDfname() {
        return dfname;
    }

    /**
     * @param dfname the dfname to set
     */
    public void setDfname(String dfname) {
        this.dfname = dfname;
    }

    /**
     * @return the dlname
     */
    public String getDlname() {
        return dlname;
    }

    /**
     * @param dlname the dlname to set
     */
    public void setDlname(String dlname) {
        this.dlname = dlname;
    }

    /**
     * @return the dregnumber
     */
    public long getDregnumber() {
        return dregnumber;
    }

    /**
     * @param dregnumber the dregnumber to set
     */
    public void setDregnumber(long dregnumber) {
        this.dregnumber = dregnumber;
    }

    /**
     * @return the dsclass
     */
    public long getDsclass() {
        return dsclass;
    }

    /**
     * @param dsclass the dsclass to set
     */
    public void setDsclass(long dsclass) {
        this.dsclass = dsclass;
    }

    /**
     * @return the ddateofbirth
     */
    public Date getDdateofbirth() {
        return ddateofbirth;
    }

    /**
     * @param ddateofbirth the ddateofbirth to set
     */
    public void setDdateofbirth(Date ddateofbirth) {
        this.ddateofbirth = ddateofbirth;
    }
    /**
     * @return the dsex
     */
    public String getDsex() {
        return dsex;
    }

    /**
     * @param dsex the dsex to set
     */
    public void setDsex(String dsex) {
        this.dsex = dsex;
    }

    /**
     * @return the editable
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     * @param editable the editable to set
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    /**
     * @return the demail
     */
    public String getDemail() {
        return demail;
    }

    /**
     * @param demail the demail to set
     */
    public void setDemail(String demail) {
        this.demail = demail;
    }

    /**
     * @return the dphone
     */
    public long getDphone() {
        return dphone;
    }

    /**
     * @param dphone the dphone to set
     */
    public void setDphone(long dphone) {
        this.dphone = dphone;
    }

    /**
     * @return the dpassword
     */
    public String getDpassword() {
        return dpassword;
    }

    /**
     * @param dpassword the dpassword to set
     */
    public void setDpassword(String dpassword) {
        this.dpassword = dpassword;
    }

    /**
     * @return the dstreet
     */
    public String getDstreet() {
        return dstreet;
    }

    /**
     * @param dstreet the dstreet to set
     */
    public void setDstreet(String dstreet) {
        this.dstreet = dstreet;
    }

    /**
     * @return the dstate
     */
    public String getDstate() {
        return dstate;
    }

    /**
     * @param dstate the dstate to set
     */
    public void setDstate(String dstate) {
        this.dstate = dstate;
    }

    /**
     * @return the dcity
     */
    public String getDcity() {
        return dcity;
    }

    /**
     * @param dcity the dcity to set
     */
    public void setDcity(String dcity) {
        this.dcity = dcity;
    }

    /**
     * @return the dcountry
     */
    public String getDcountry() {
        return dcountry;
    }

    /**
     * @param dcountry the dcountry to set
     */
    public void setDcountry(String dcountry) {
        this.dcountry = dcountry;
    }
}
