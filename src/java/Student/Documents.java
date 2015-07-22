/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.io.*;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
@Named(value = "documents")
@SessionScoped
public class Documents implements Serializable {

    /**
     * Creates a new instance of Documents
     */
    public Documents() {
    }
    public void download() throws IOException
    {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletResponse response = ( HttpServletResponse ) context.getExternalContext().getResponse();
        
        String filePath = null;
        int read = 0;
        byte[] bytes = new byte[1024];
        //String fileName = "footer.txt";  
        
        filePath = "C:/Users/user/Documents/NetBeansProjects/Student Management System/web/documents/footer.txt";
        
        File file = new File(filePath);
        
        response.setContentType("application/octet-stream");
        
        response.setHeader("Content-Disposition", "attachment;filename=footer.txt");
        response.setContentLength((int) file.length());
        
        FileInputStream fis = null;
        OutputStream os = null;
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        
        while((bytesRead = fis.read(buffer)) != -1)
        {
            os.write(buffer, 0, bytesRead);
        }
        
             os.flush();
             os.close();
             fis.close();
        
        FacesContext.getCurrentInstance().responseComplete();   
    }
}
