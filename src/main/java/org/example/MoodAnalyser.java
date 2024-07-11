package org.example;

public class MoodAnalyser {
    public static String analyseMood(String message){
        if (message.contains("Sad")){
            return "Sad";
        }
        return "Happy";
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String message1 = "I am Sad";
        String mood1 = MoodAnalyser.analyseMood(message1);
        System.out.println("Test case 1.1 : "+mood1);

        String message2 = "I am Happy";
        String mood2 = MoodAnalyser.analyseMood(message2);
        System.out.println("Test case 1.2 : "+mood2);
    }
}
