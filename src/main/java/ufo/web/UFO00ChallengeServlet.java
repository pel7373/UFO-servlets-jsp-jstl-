package ufo.web;

import ufo.UFO00AcceptChallengeService;
import ufo.answers.UFOAnswer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ufo00")
public class UFO00ChallengeServlet extends HttpServlet {

    private final UFO00AcceptChallengeService UFO00AcceptChallengeService = new UFO00AcceptChallengeService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UFOAnswer answer = UFO00AcceptChallengeService.call(Boolean.parseBoolean(req.getParameter("answer")));

        resp.setStatus(200);
        req.setAttribute("answer", answer.getMessage());
        req.getRequestDispatcher(answer.getPage()).forward(req, resp);
    }
}