package com.careerdevs.EmployeeSystem;

import java.util.List;
import java.util.Random;

public class HeroNames {
    private List<String> first = List.of(
            "Admiral",
            "Baron Von",
            "Captain",
            "Doctor",
            "Executor",
            "The Fortres of ",
            "General",
            "The Hermit of",
            "Inquisitor",
            "The Jester of",
            "The Keeper of",
            "Lord",
            "Mister",
            "The Noble of",
            "The Official of",
            "The Queen of",
            "The Reckoner of",
            "Señor",
            "The Tempest of",
            "Uncle",
            "The Vicar of",
            "The Wizzard of",
            "Xavier",
            "The Year of",
            "The Zephyr of"
    );

    private List<String> last = List.of(
            "Anxiety",
            "Boredom",
            "Couch",
            "Drunk",
            "Emptiness",
            "Friendliness",
            "Grumble",
            "Hypochondria",
            "Isolation",
            "Jerkin' it",
            "Karma",
            "Loneliness",
            "Melancholy",
            "Naptizo",
            "Overindulgence",
            "Procrastination",
            "Quarantine",
            "Rest",
            "Sleep",
            "Tears",
            "Unhappy",
            "Vodka",
            "Woe",
            "X-Tremely Sad",
            "Yearning",
            "Zoom"
    );

    public String generateFirst() {
        Random random = new Random();
        return first.get(random.nextInt(first.size()));
    }

    public String generateLast() {
        Random random = new Random();
        return last.get(random.nextInt(last.size()));
    }
}
