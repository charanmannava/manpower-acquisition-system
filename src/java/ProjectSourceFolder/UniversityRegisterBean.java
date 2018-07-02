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
public class UniversityRegisterBean extends org.apache.struts.action.ActionForm {
    
  private String univname;
  private String univtype;
  private String univid;
  private String emailid;
  private String contact;
  private String student;
  private String packa;

    public String getUnivname() {
        return univname;
    }

    public void setUnivname(String univname) {
        this.univname = univname;
    }

    public String getUnivtype() {
        return univtype;
    }

    public void setUnivtype(String univtype) {
        this.univtype = univtype;
    }

    public String getUnivid() {
        return univid;
    }

    public void setUnivid(String univid) {
        this.univid = univid;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getPacka() {
        return packa;
    }

    public void setPacka(String packa) {
        this.packa = packa;
    }
  
}
