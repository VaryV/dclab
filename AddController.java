/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author clump
 */
public class AddController extends AbstractController {
    
    public AddController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
            ModelAndView mv = new ModelAndView();
            
            if (request.getParameter("s") != null){
                String a = request.getParameter("a");
                String b = request.getParameter("b");
                model.Math math = new model.Math(Integer.parseInt(a), Integer.parseInt(b));
                mv.addObject("output", math.add());
            }
        return mv;
    }
    
}
