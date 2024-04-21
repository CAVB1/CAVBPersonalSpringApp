package com.cavb.CAVBPersonalApp.Controller;

import com.cavb.CAVBPersonalApp.DAO.UserDAOImplementation;
import com.cavb.CAVBPersonalApp.ML.Result;
import com.cavb.CAVBPersonalApp.ML.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDAOImplementation userDAOImplementation;

   @GetMapping
   public String GetAll(Model model){
       Result result = userDAOImplementation.GetAllJPA();
       if (result.Correct){
           model.addAttribute("users", (List<User>)result.Object);
       }
       return "UserGetAll";
   }
   @GetMapping("/form/{iduser}")
   public String Form(Model model, @PathVariable int idusuario){
       if (idusuario != 0){

       }
       return "Form";
   }

   @PostMapping("/form")
    public ModelAndView Add(@ModelAttribute User user){
       Result result;
       if(user.getIdUser() == 0){
           result = userDAOImplementation.AddJPA(user);
       }

       return new ModelAndView("GetAll");
   }

}
