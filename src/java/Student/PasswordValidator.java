/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author user
 */
@Named(value = "passwordValidator")
@Dependent
public class PasswordValidator implements Validator{

    /**
     * Creates a new instance of PasswordValidator
     */
    public PasswordValidator() {
    }

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
      String password = (String) value;
      
      UIInput confirmComponent = (UIInput) component.getAttributes().get("confirm");
      String confirm = (String) confirmComponent.getSubmittedValue();
      
      if (password == null || password.isEmpty() || confirm == null || confirm.isEmpty()) {
            return;
        }
      
      if (!password.equals(confirm)) {
            confirmComponent.setValid(false);
            throw new ValidatorException(new FacesMessage("Both password fields do not match, please enter same password for both fields."));
        }
          
    }
}
