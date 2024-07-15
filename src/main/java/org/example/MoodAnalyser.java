package org.example;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.trim().isEmpty()) {
                return "Neutral";
            }
            if (this.message.contains("Sad")) {
                return "Sad";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
        return "Happy";
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        String mood1 = moodAnalyser1.analyseMood();
        System.out.println("Test case 2.1 : " + mood1); // Expected: Sad

        MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Happy Mood");
        String mood2 = moodAnalyser2.analyseMood();
        System.out.println("Test case 2.1 : " + mood2); // Expected: Happy

        MoodAnalyser moodAnalyser3 = new MoodAnalyser(null);
        String mood3 = moodAnalyser3.analyseMood();
        System.out.println("Test case 2.1 : " + mood3); // Expected: Happy
    }

    }
