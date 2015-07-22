/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author user
 */
@Named(value = "adminsBean")
@ApplicationScoped
public class AdminsBean {
    
    private String page = "computerscience.xhtml";

    /**
     * Creates a new instance of AdminsBean
     */
    public AdminsBean() {
    }
    
     /**
     * @return the page
     */
    public String getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(String page) {
        this.page = page;
    }
}
