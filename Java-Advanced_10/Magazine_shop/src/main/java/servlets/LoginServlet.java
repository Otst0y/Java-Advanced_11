package servlets;

import com.google.gson.Gson;
import domain.User;
import dto.UserLogin;
import services.UserService;
import services.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserService userService = UserServiceImpl.getUserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = userService.getUserByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("userId", user.getId());
            session.setAttribute("role", user.getRole().toString());

            UserLogin userLogin = new UserLogin();
            userLogin.destinationUrl = "cabinet.jsp";
            userLogin.userEmail = user.getEmail();
            String json = new Gson().toJson(userLogin);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
        }
    }

}