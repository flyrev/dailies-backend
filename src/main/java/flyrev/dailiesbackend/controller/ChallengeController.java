package flyrev.dailiesbackend.controller;

import flyrev.dailiesbackend.model.Challenge;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ChallengeController {

    @RequestMapping(path = "/challenges", method = GET)
    public Challenge challenge() {
        return new Challenge("Test the backend", 1, 100);
    }

}
