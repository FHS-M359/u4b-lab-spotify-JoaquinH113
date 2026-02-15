import java.util.*;
import java.io.*;
public class SpotifyTester {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner songFile = new Scanner(new File("spotify_unique_years_artists.txt"));
        Scanner input = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();
        while(songFile.hasNextLine()){
            String data = songFile.nextLine();
            String[] splitData = data.split(",");
            String title = splitData[0];
            String artist = splitData[1];
            String Album = splitData[2];
            int duration = Integer.parseInt(splitData[3]);
            int years = Integer.parseInt(splitData[4]);
            String genre = splitData[5];
            songs.add(new Song(title,artist,Album,years,genre,duration));
        }
        Playlist playlist = new Playlist(songs);
        songFile.close();
        int choice=0;
        while(choice!=7) {
            String menu = "==== Spotify Menu ====\n";
            menu+="1 - Sort by artist (A->Z)\n" +"2 - Sort by artist (Z->A)";
            menu+="\n3 - Sort by year (oldest -> newest)\n"+"4 - Sort by year (newest -> oldest)\n";
            menu+="5 - Search by genre\n6 - Display all songs\n7 - Quit";
            System.out.println(menu);
            System.out.println("Please enter choice (1-7):");
            try {
                choice = input.nextInt();
                if(choice==1){
                    System.out.println(playlist.sortAToZ());
                }
                else if(choice==2){
                    System.out.println(playlist.sortZToA());
                }
                else if(choice==3){
                    System.out.println(playlist.sortByReleaseYearOldToNew());
                }
                else if(choice==4){
                    System.out.println(playlist.sortByReleaseYearNewToOld());
                }
                else if(choice==5){
                    input.nextLine();
                    System.out.println("Please Input Genre:");
                    String genre = input.nextLine();
                    System.out.println(playlist.searchByGenre(genre));
                }
                else if(choice==6){
                    System.out.println(playlist.toString());
                }
                else if(choice<1||choice>7){
                    System.out.println("Please input a number in the range from 1-7:");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please input a number 1-7:");
                input.next();
            }

        }
    }
}
