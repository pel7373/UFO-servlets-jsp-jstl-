package ufo;

import ufo.answers.UFOAnswer;
import static ufo.AppContent.*;



public class AcceptUfoChallengeService {

    public UFOAnswer call(boolean isAccepted) {
        UFOAnswer answer;
        if (isAccepted) {
            answer = new UFOAnswer(STEP_1_ACCEPTED, NEXT_1_PAGE);
        } else {
            answer = new UFOAnswer(STEP_1_NOT_ACCEPTED, LOSE_PAGE);
        }
        return answer;
    }
}