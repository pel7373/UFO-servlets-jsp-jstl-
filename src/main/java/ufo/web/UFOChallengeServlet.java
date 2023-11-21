package ufo.web;

import ufo.AcceptUfoChallengeService;
import ufo.answers.UFOAnswer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hi")
public class UFOChallengeServlet extends HttpServlet {

    private final AcceptUfoChallengeService acceptUfoChallengeService = new AcceptUfoChallengeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UFOAnswer answer = acceptUfoChallengeService.call(Boolean.parseBoolean(req.getParameter("answer")));

        resp.setStatus(200);
        req.setAttribute("answer", answer.getMessage());
        req.getRequestDispatcher(answer.getPage()).forward(req, resp);
    }
}