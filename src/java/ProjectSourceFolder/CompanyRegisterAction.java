/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSourceFolder;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class CompanyRegisterAction extends org.apache.struts.action.Action {

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
              throws Exception 
    {
        
        CompanyRegisterBean crb = (CompanyRegisterBean)form;
        String name =      crb.getCompname();
        String cid = crb.getCompid();
        String cty = crb.getComptype();
        String ema = crb.getEmailid();
        String tl =  crb.getContact();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapers","root","mysql123");
            pst=con.prepareStatement("insert into companyreg values(?,?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,cid);
            pst.setString(3,cty);
            pst.setString(4,ema);
            pst.setString(5,tl);
            int status = pst.executeUpdate();
            if(status>0)
            {
                request.setAttribute("msg","Data successfully added!!");
                SUCCESS = "pass";
            }
            else
            {
                request.setAttribute("fail","Some problem in adding data or company account is already present!!");
                SUCCESS = "fail";
             }
        }
        catch(Exception e)
        {
            request.setAttribute("fail","Data Cannot be added!!");
                  SUCCESS = "fail";
        }
        return mapping.findForward(SUCCESS);
    
}
    
}
