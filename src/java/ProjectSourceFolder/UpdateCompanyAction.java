/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSourceFolder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author SURYA PRIY
 */
public class UpdateCompanyAction extends org.apache.struts.action.Action {

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
        
        UpdateCompanyBean crb = (UpdateCompanyBean)form;
        String name = crb.getCompname();
        String cid = crb.getCompid();
        String cty = crb.getComptype();
        String ema = crb.getEmailid();
        String tl =  crb.getContact();
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapers","root","mysql123");
            pst=con.prepareStatement("update companyreg set Name=?,Comptype=?,email=?,contact=? where Cid=?");
            pst.setString(1,name);
            pst.setString(2,cty);
            pst.setString(3,ema);
            pst.setString(4,tl);
            pst.setString(5,cid);
            int status = pst.executeUpdate();
            if(status>0)
            {
                request.setAttribute("msg","Updated Successfully");
                SUCCESS = "pass";
            }
            else
            {
                request.setAttribute("msg","Some problem in Updation");
                SUCCESS = "fail";                
            }
        }
        catch(Exception e)
        {
                request.setAttribute("msg","Some problem in Updation");
                SUCCESS = "fail";                            
        }
        return mapping.findForward(SUCCESS);
    }
}
