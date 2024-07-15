package org.example;



class MoodAnalysisException extends Exception {
    private MoodErrorType errorType;

    public MoodAnalysisException(MoodErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public MoodErrorType getErrorType() {
        return errorType;
    }
}
enum MoodErrorType {
    NULL, EMPTY
}
public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        if (this.message == null) {
            throw new MoodAnalysisException(MoodErrorType.NULL, "Mood is NULL");
        }
        if (this.message.trim().isEmpty()) {
            throw new MoodAnalysisException(MoodErrorType.EMPTY, "Mood is EMPTY");
        }
        if (this.message.contains("Sad")) {
            return "Sad";
        }
        return "Happy";
    }

    public static void main(String[] args) {
        try {
            MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
            String mood1 = moodAnalyser1.analyseMood();
            System.out.println("Test case 3 : " + mood1); // Expected: Sad

            MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Happy Mood");
            String mood2 = moodAnalyser2.analyseMood();
            System.out.println("Test case 3 : " + mood2); // Expected: Happy

            MoodAnalyser moodAnalyser3 = new MoodAnalyser(null);
            String mood3 = moodAnalyser3.analyseMood();
            System.out.println("Test case 3.1 : " + mood3); // This line should not be reached
        } catch (MoodAnalysisException e) {
            System.out.println("Test case 3.1 : " + e.getMessage() + " ErrorType: " + e.getErrorType()); // Expected: Mood is NULL
        }

        try {
            MoodAnalyser moodAnalyser4 = new MoodAnalyser("");
            String mood4 = moodAnalyser4.analyseMood();
            System.out.println("Test case 3.2 : " + mood4); // This line should not be reached
        } catch (MoodAnalysisException e) {
            System.out.println("Test case 3.2 : " + e.getMessage() + " ErrorType: " + e.getErrorType()); // Expected: Mood is EMPTY
        }
    }
}
