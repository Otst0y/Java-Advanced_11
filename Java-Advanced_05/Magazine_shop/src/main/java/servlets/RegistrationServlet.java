package servlets;

import domain.User;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {
    /*
    private static final long serialVersionUID = 1L;
    private UserService userService = UserService.getUserService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Server at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        userService.saveUser(new User(name, lastName, email, password));
        request.setAttribute("userEmail", email);
        request.getRequestDispatcher("cabinet.jsp").forward(request, response);
    }
*/

}
