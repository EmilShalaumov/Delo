package com.raiff.delo.Controller;

import com.raiff.delo.DatabaseAdapter.UserRepository;
import com.raiff.delo.Model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;

@Controller
@RequestMapping("/auth")
public class LoginController {
    @Autowired
    private UserRepository userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody String login(@RequestParam(name = "email") String email,
                                      @RequestParam(name = "password") String password) throws ServletException {
        String jwtToken;

        if (email == null || password == null) {
            throw new ServletException("Please fill in username and password");
        }

        User user = userService.findByEmail(email);

        if (user == null) {
            throw new ServletException("User email not found.");
        }

        String pwd = user.getPassword();

        if (!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your name and password.");
        }

        jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();

        return jwtToken;
    }

}
