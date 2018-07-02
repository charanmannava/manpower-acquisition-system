/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSourceFolder;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author SURYA PRIY
 */
public class AdminLoginBean extends org.apache.struts.action.ActionForm {
    
    private String apass;

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass;
    }
    

}
