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
public class AdminLoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    Connection con = null;
    PreparedStatement pst = null;
    private static String SUCCESS = "success";

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
        
        AdminLoginBean alb = (AdminLoginBean) form;
        String pass = alb.getApass();
        
        if(pass.equals("admin123"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("admin", "Admin");
            request.setAttribute("msg", "Welcome");
            SUCCESS = "pass";
            try
            {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapers","root","mysql123");         
            Statement pst = con.createStatement();
            Statement pst1 = con.createStatement();
            
            ResultSet rs = pst.executeQuery("select count(*) from companyreg");
            ResultSet rs1 = pst1.executeQuery("select count(*) from universityreg");
            while(rs.next())
            {
                session.setAttribute("councomp", rs.getString(1));
            }
            while(rs1.next())
            {
                session.setAttribute("coununiv", rs1.getString(1));
            }
            }
            catch(Exception e)
            {
                request.setAttribute("fail", "Error in processing");
                SUCCESS = "fail";                
            }
            
        }
        else
        {
                request.setAttribute("fail", "Error in processing");
                SUCCESS = "fail";                            
        }
        
        return mapping.findForward(SUCCESS);
    }
}
