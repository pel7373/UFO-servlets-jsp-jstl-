package ufo;

import ufo.answers.UFOAnswer;
import static ufo.AppContent.*;

public class UFO02WhoAreYouService {
    public UFOAnswer call(boolean isAccepted) {
        UFOAnswer answer;
        if (isAccepted) {
            answer = new UFOAnswer(STEP_2_ACCEPTED, NEXT_2_PAGE);
        } else {
            answer = new UFOAnswer(STEP_2_NOT_ACCEPTED, LOSE_PAGE);
        }
        return answer;
    }
}
