package chapterFive.assignment;

import tdd.Mp3PlayerApplication;

import java.util.Scanner;

public class Mp3MusicPlayer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mp3PlayerApplication musicPlayer = new Mp3PlayerApplication();
        boolean initial = true;

        while (initial) {
            System.out.print("""
                    1. Songs
                    2. Playlist
                    3. Folders
                    4. Albums
                    5. Artists
                                    
                    0. Exit
                                            
                    select from the above options: """);
            int initialDisplay = input.nextInt();
            while (initialDisplay < 0 || initialDisplay > 5) {
                System.out.print("""
                        Wrong input!
                        Please try again.
                                                
                        1. Songs
                        2. Playlist
                        3. Folders
                        4. Albums
                        5. Artists
                                            
                        0. Exit
                                                
                        Select from the above options: """);
                initialDisplay = input.nextInt();
            }
            switch (initialDisplay) {
                case 1 -> {
                    System.out.print(musicPlayer.getSongs());
                    int songs = input.nextInt();

                    switch (songs) {
                        case 1 -> {
                            System.out.print("""
                                               Halleluyah
                                              Dunsin Oyekan
                                              Now Playing...
                                              
                                    1.|<        2. ||         3. >|
                                                                    
                                    Select: """);
                            int halleluyah = input.nextInt();
                            switch (halleluyah){
                                case 2 -> {
                                    System.out.print("""
                                               Halleluyah
                                              Dunsin Oyekan
                                                 Paused
                                              
                                    1.|<        2. |>         3. >|
                                                                    
                                    Select: """);
                                    halleluyah = input.nextInt();
                                }
                            }
                        }
                        case 2 -> {
                            System.out.print("""
                                           Glory to the Lamb
                                              CLM choir
                                             Now Playing...
                                              
                                    1.|<        2. ||         3. >|
                                                                    
                                    Select: """);
                        }
                        case 3 -> {
                            System.out.print("""
                                                Adua ke
                                           Theophilus Sunday
                                              Now Playing...
                                              
                                    1.|<        2. ||         3. >|
                                                                    
                                    Select: """);
                        }
                        case 0 -> {
                            initial = true;
                        }
                    }
                }
                case 2 -> {
                    System.out.print(musicPlayer.getPlaylists());
                    int playlists = input.nextInt();
                }
                case 3 -> {
                    System.out.print(musicPlayer.getFolders());
                    int folders = input.nextInt();
                }
                case 4 -> {
                    System.out.println(musicPlayer.getAlbums());
                    int albums = input.nextInt();
                }
                case 5 -> {
                    System.out.print(musicPlayer.getArtists());
                    int artists = input.nextInt();
                }
                case 0 -> {
                    initial = false;
                }
            }
        }
    }
}
