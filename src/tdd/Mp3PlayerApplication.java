package tdd;

public class Mp3PlayerApplication {
    private String songs;
    private String playlists;
    private String folders;
    private String albums;
    private String artists;

    public String getSongs() {
        songs = """
                Songs
                
                1. Halleluyah by Dunsin Oyekan.mp3
                2. Glory to the Lamb by CLM Choir.mp3
                3. Adua ke by Min. Theophilus Sunday.mp3
                
                0. Back
                
                Select the song you want to listen to: """;
        return songs;
    }

    public String getPlaylists() {
        playlists = """
                Playlists
                
                1. My Favourite
                2. Recently Added
                3. Recently Played
                4. My Top Tracks
                
                Select from the above options: """;
        return playlists;
    }

    public String getFolders() {
        folders = """
                Folders
                
                1. My music
                2. Download
                3. Whatsapp audio
                4. Xender
                
                Select from the above options: """;
        return folders;
    }

    public String getAlbums() {
        albums = """
                """;
        return albums;
    }

    public String getArtists() {
        artists = """
                Artists
                
                1. Dunsin Oyekan
                2. CLM choir
                3. Theophilus Sunday
                
                Select from the above options: """;
        return artists;
    }
}
