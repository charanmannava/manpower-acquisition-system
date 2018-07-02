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
public class OpportunityBean extends org.apache.struts.action.ActionForm {
    
    private String indname;
    private String indid;
    private String indtype;
    private String tech;
    private String packa;
    private String req;
    private String contact;

    public String getIndname() {
        return indname;
    }

    public void setIndname(String indname) {
        this.indname = indname;
    }

    public String getIndid() {
        return indid;
    }

    public void setIndid(String indid) {
        this.indid = indid;
    }

    public String getIndtype() {
        return indtype;
    }

    public void setIndtype(String indtype) {
        this.indtype = indtype;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getPacka() {
        return packa;
    }

    public void setPacka(String packa) {
        this.packa = packa;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
