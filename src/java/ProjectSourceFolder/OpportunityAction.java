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
public class OpportunityAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
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
        OpportunityBean irb = (OpportunityBean) form;
        String name = irb.getIndname();
        String cid = irb.getIndid();
        String tech = irb.getTech();
        String cty = irb.getIndtype();
        String ema = irb.getReq();
        String tl =  irb.getContact();
        String pac = irb.getPacka();
        Connection con = null;
        PreparedStatement pst = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapers","root","mysql123");
            pst=con.prepareStatement("insert into opportunities values(?,?,?,?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,cid);
            pst.setString(4,tech);
            pst.setString(3,cty);
            pst.setString(5,tl);
            pst.setString(6,pac);
            pst.setString(7, ema);
            int status = pst.executeUpdate();
            if(status>0)
            {
                request.setAttribute("msg","Data successfully added!!");
                SUCCESS = "pass";
            }
            else
            {
                request.setAttribute("fail","Some problem in adding data or Opportunity is already present!!");
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
