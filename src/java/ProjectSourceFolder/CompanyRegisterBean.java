/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSourceFolder;


/**
 *
 * @author SURYA PRIY
 */
public class CompanyRegisterBean extends org.apache.struts.action.ActionForm 
{
  private String compname;
  private String comptype;
  private String compid;
  private String emailid;
  private String contact;

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }


    public String getComptype() {
        return comptype;
    }

    public void setComptype(String comptype) {
        this.comptype = comptype;
    }

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid;
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
  

}
