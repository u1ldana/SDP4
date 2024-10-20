package task7;

public class LearningPlatformApp {

    public static void main(String[] args) {

        OnlineCourse course = new OnlineCourse("AMCS");


        course.addLecture(new ProxyVideoLecture("The Tower of Hanoi"));
        course.addLecture(new ProxyVideoLecture("Floor and Ceiling"));
        course.addLecture(new ProxyVideoLecture("GCD"));

        course.showCourseInfo();

        System.out.println("\nPlaying first lecture:");
        course.playLecture(0);


        System.out.println("\nPlaying second lecture:");
        course.playLecture(1);

        System.out.println("\nReplaying first lecture:");
        course.playLecture(0);
    }
}
