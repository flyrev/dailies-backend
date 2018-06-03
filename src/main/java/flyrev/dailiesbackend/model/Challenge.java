package flyrev.dailiesbackend.model;

import lombok.Data;

@Data
public class Challenge {

    private final String name;
    private final int required;
    private final int xpAward;

    private int performed;

    public void increaseStep() {
        if (!completed()) {
            performed++;
        }
    }

    public boolean completed() {
        return performed >= required;
    }

}
