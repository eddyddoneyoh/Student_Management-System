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

/**
 *
 * @author user
 */
@Named(value = "docu")
@SessionScoped
public class Docu implements Serializable {

    /**
     * Creates a new instance of Docu
     */
    public Docu() {
    }
     private static final long serialVersionUID = 1L;
     
     public void downloadFile() throws IOException
   {
      try
      {
          File file = new File("C:/Users/user/Documents/NetBeansProjects/Student Management System/web/documents/footer.txt");
      InputStream fis = new FileInputStream(file);
      byte[] buf = new byte[1024];
      int offset = 0;
      int numRead = 0;
      while ((offset < buf.length) && ((numRead = fis.read(buf, offset, buf.length -offset)) >= 0)) 
      {
        offset += numRead;
      }
      fis.close();
      HttpServletResponse response =
         (HttpServletResponse) FacesContext.getCurrentInstance()
        .getExternalContext().getResponse();

     response.setContentType("application/octet-stream");
     response.setHeader("Content-Disposition", "attachment;filename=footer.txt");
     response.getOutputStream().write(buf);
     response.getOutputStream().flush();
     response.getOutputStream().close();
     FacesContext.getCurrentInstance().responseComplete();
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
   }
}
