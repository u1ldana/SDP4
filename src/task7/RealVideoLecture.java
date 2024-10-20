package task7;

public class RealVideoLecture implements VideoLecture {
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        loadVideoFromDisk();
    }

    // Simulate loading video from disk or a remote server
    private void loadVideoFromDisk() {
        System.out.println("Loading video: " + title);
        try {
            Thread.sleep(2000);  // Simulate loading time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Video Lecture: " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
