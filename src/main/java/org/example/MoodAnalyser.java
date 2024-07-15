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
            if (this.message == null || this.message.trim().isEmpty()) {
                return "Neutral";
            }
            if (this.message.contains("Sad")) {
                return "Sad";
            }
            return "Happy";
        }

        public static void main(String[] args) {
            MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
            String mood1 = moodAnalyser1.analyseMood();
            System.out.println("Test case 1.1 : " + mood1);

            MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Happy Mood");
            String mood2 = moodAnalyser2.analyseMood();
            System.out.println("Test case 1.2 : " + mood2);
        }
    }

