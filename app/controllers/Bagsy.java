package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Bagsy extends Controller {
	
	public static class Login { 

        public String email; 
        public String password; 

        public String validate() { 
            if (!(email.equalsIgnoreCase("cat@bagsy.com") && 
            		password.equalsIgnoreCase("ronthecat"))) { 
                return "Invalid user or password"; 
            } 
            return null; 
        } 

    } 
	
	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();
		if (loginForm.hasErrors()) {
			return badRequest(); 
		}
		
	    return ok(index.render("Your new cat is ready."));
	  }
}