package ufo;

import ufo.answers.UFOAnswer;
import static ufo.AppContent.*;

public class UFO00AcceptChallengeService {

    public UFOAnswer call(boolean isAccepted) {
        UFOAnswer answer;
        if (isAccepted) {
            answer = new UFOAnswer(STEP_0_ACCEPTED, NEXT_0_PAGE);
        } else {
            answer = new UFOAnswer(STEP_0_NOT_ACCEPTED, LOSE_PAGE);
        }
        return answer;
    }

}