package task10;

public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song A", "Artist 1", "Jazz"));
        playlist.addSong(new Song("Song B", "Artist 2", "Rock"));
        playlist.addSong(new Song("Song C", "Artist 3", "Pop"));
        playlist.addSong(new Song("Song D", "Artist 4", "Jazz"));
        playlist.addSong(new Song("Song E", "Artist 5", "Rock"));


        System.out.println("Sequential Order:");
        Iterator sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }


        System.out.println("\nShuffle Order:");
        Iterator shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }


        System.out.println("\nFilter by Genre (Pop):");
        Iterator popIterator = playlist.getGenreFilterIterator("Pop");
        while (popIterator.hasNext()) {
            System.out.println(popIterator.next());
        }
    }
}
