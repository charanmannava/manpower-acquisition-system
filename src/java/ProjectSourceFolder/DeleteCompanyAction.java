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
public class DeleteCompanyAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static String SUCCESS = "success";
    Connection con = null;
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
        
        DeleteCompanyBean dcb = (DeleteCompanyBean) form;
        String ide = dcb.getCompid();
        try
        {
           HttpSession session = request.getSession(false);
           if(session.getAttribute("admin")!=null)
          {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapers","root","mysql123");         
            PreparedStatement pst = con.prepareStatement("delete from companyreg where Compid=?");
            pst.setString(1, ide);
            int status = pst.executeUpdate();
            if(status>0)
            {
                SUCCESS = "pass";
                request.setAttribute("msg", "Company is deleted");
            }
            else
            {
                SUCCESS = "fail";
                request.setAttribute("fail", "Error in deletion");
            }
           }
            else
            {
               SUCCESS = "fail";
                request.setAttribute("fail", "You must first login as administrator");            
            }
        
            }
            catch(Exception e)
            {
                SUCCESS = "fail";
                request.setAttribute("fail", "Error in deletion");               
            }
         
        return mapping.findForward(SUCCESS);
    }
}
