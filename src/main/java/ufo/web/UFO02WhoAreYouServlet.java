package ufo.web;

import ufo.answers.UFOAnswer;
import ufo.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ufo02")
public class UFO02WhoAreYouServlet  extends HttpServlet {
    private final UFO02WhoAreYouService UFO02WhoAreYouService = new UFO02WhoAreYouService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UFOAnswer answer = UFO02WhoAreYouService.call(Boolean.parseBoolean(req.getParameter("answer")));

        resp.setStatus(200);
        req.setAttribute("answer", answer.getMessage());
        req.getRequestDispatcher(answer.getPage()).forward(req, resp);
    }
}
