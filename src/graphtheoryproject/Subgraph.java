/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheoryproject;

import java.util.ArrayList;

/**
 *
 * @author Amit
 */
public class Subgraph
{
    ArrayList< ArrayList<Edge> > generateSubgraphs(ArrayList<Edge> list)
    {
        int len=list.size();
        int length = (int) Math.pow(2,len);
        ArrayList<ArrayList<Edge> > graph=new ArrayList<ArrayList<Edge> >();
        
       
                
        for(int i=0;i<length;++i)
        {
            ArrayList<Edge> ans = new ArrayList<Edge>();
            for(int j=0;j<len;j++)
            {
                if(((1<<j) & i) > 0)
                    ans.add(list.get(j));
            }
            graph.add(ans);
            System.out.println("ans size="+ans.size());
        }
        return graph;
    }
}
