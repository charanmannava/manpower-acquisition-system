/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSourceFolder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author SURYA PRIY
 */
public class CompanyLoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static String SUCCESS = "success";
    Connection con=null;
    PreparedStatement pst = null;
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
              HttpServletRequest request, HttpServletResponse response)
              throws Exception {
        
        CompanyLoginBean clb = (CompanyLoginBean)form;
        String uid = clb.getCompid();
        String passe = clb.getPassw();
        if(passe.equals(uid))
        {
        HttpSession session = request.getSession();
        session.setAttribute("companyid",uid);
        request.setAttribute("msg", "Welcome");
        
         try
         {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapers","root","mysql123");         
            PreparedStatement pst = con.prepareStatement("select * from companyreg where compid=?");
            pst.setString(1, uid);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next())
            {
            session.setAttribute("compname",rs.getString(1));
            session.setAttribute("compide",rs.getString(2));
            session.setAttribute("comptype",rs.getString(3));
            session.setAttribute("compemail",rs.getString(4));
            session.setAttribute("compcont",rs.getString(5));
            SUCCESS = "pass";
            }
            else
            {
             request.setAttribute("msg","fail1");
              SUCCESS = "fail";                
            }
         }
         catch(Exception e)
         {
              request.setAttribute("msg","fail2");
              SUCCESS = "fail";
         }
        }
        else
        {
            request.setAttribute("msg","fail");
            SUCCESS = "fail";
        }
        return mapping.findForward(SUCCESS);
    }
}
