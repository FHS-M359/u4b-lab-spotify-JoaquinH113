import java.util.*;
public class Playlist {
    private ArrayList<Song> songList;
    public Playlist(ArrayList<Song> list){
        songList=list;
        for(int i=0;i<songList.size()-1;i++){
            int minDuration = i;
            for(int j =i+1; j<songList.size();j++){
                if(songList.get(j).getDuration()<songList.get(minDuration).getDuration()){
                    minDuration=j;
                }
            }
            Song temp = songList.get(minDuration);
            songList.set(minDuration,songList.get(i));
            songList.set(i,temp);
        }
    }
    public String toString(){
        String format = "%-30s %-21s %-27s %-5s %11s";
        String result = String.format(format,"Title","Artist","Album","year","Genre")+"\n";
        result+="--------------------------------------------------------------------------------------------------\n";
        for(Song song:songList){
            result+= song.toString()+"\n";
        }
        return result;
    }
    public String sortAToZ(){
        ArrayList<Song> sortedList = new ArrayList<>();
        for(Song song:songList){
            sortedList.add(song);
        }
        //Sorts the Array A->Z
        for(int i =0;i<sortedList.size()-1;i++){
            int index = i;
            for(int j=i+1;j<sortedList.size();j++){
                if(sortedList.get(j).getArtist().compareToIgnoreCase(sortedList.get(index).getArtist())<0){
                    index=j;
                }
            }
            Song temp = sortedList.get(i);
            sortedList.set(i,sortedList.get(index));
            sortedList.set(index,temp);
        }
        //provides the format for the ArrayList to be printed in
        String format = "%-30s %-21s %-27s %-5s %11s";
        String result = String.format(format, "Title", "Artist", "Album", "year", "Genre") + "\n";
        result += "--------------------------------------------------------------\n";
        for (Song song : sortedList) {
            result += song.toString() + "\n";
        }
        return result;
    }
    public String sortZToA(){
        ArrayList<Song> sortedList = new ArrayList<>();
        for(Song song:songList){
            sortedList.add(song);
        }
        for(int i =0;i<sortedList.size()-1;i++){
            int index = i;
            for(int j=i+1;j<sortedList.size();j++){
                if(sortedList.get(j).getArtist().compareToIgnoreCase(sortedList.get(index).getArtist())>0){
                    index=j;
                }
            }
            Song temp = sortedList.get(i);
            sortedList.set(i,sortedList.get(index));
            sortedList.set(index,temp);
        }
        //provides the format for the ArrayList to be printed in
        String format = "%-30s %-21s %-27s %-5s %11s";
        String result = String.format(format, "Title", "Artist", "Album", "year", "Genre") + "\n";
        result += "--------------------------------------------------------------\n";
        for (Song song : sortedList) {
            result += song.toString() + "\n";
        }
        return result;
    }
    public String searchByGenre(String genre){
        ArrayList<Song> sortedList = new ArrayList<>();
        //sorts the ArrayList by the Genre input
        for(Song song:songList){
            if(song.getGenre().equals(genre)){
                sortedList.add(song);
            }
        }
        //provides the format for the ArrayList to be printed in
        //as well as checks to see if the ArrayList has any songs in the genre
        if(sortedList.size()>0) {
            String format = "%-30s %-21s %-27s %-5s %11s";
            String result = String.format(format, "Title", "Artist", "Album", "year", "Genre") + "\n";
            result += "--------------------------------------------------------------\n";
            for (Song song : sortedList) {
                result += song.toString() + "\n";
            }
            return result;
        }
        else{
            return "There are no Songs in the "+genre+" section";
        }
    }
    public String sortByReleaseYearNewToOld(){
        ArrayList<Song> sortedList = new ArrayList<>();
        for(Song song:songList){
            sortedList.add(song);
        }
        //sorts from the newest song to the oldest song
        for(int i = 0; i<sortedList.size()-1;i++){
            int newestYear = i;
            for(int j = i+1;j<sortedList.size();j++){
                if(sortedList.get(j).getYear()>sortedList.get(newestYear).getYear()){
                    newestYear=j;
                }
            }
            //swap
            Song temp = sortedList.get(i);
            sortedList.set(i,sortedList.get(newestYear));
            sortedList.set(newestYear,temp);
        }
        //provides the format for the ArrayList to be printed in
        String format = "%-30s %-21s %-27s %-5s %11s";
        String result = String.format(format, "Title", "Artist", "Album", "year", "Genre") + "\n";
        result += "--------------------------------------------------------------\n";
        for (Song song : sortedList) {
            result += song.toString() + "\n";
        }
        return result;
    }
    public String sortByReleaseYearOldToNew(){
        ArrayList<Song> sortedList = new ArrayList<>();
        for(Song song:songList){
            sortedList.add(song);
        }
        //sorts from the oldest song to the newest song
        for(int i = 0; i<sortedList.size()-1;i++){
            int oldestYear = i;
            for(int j = i+1;j<sortedList.size();j++){
                if(sortedList.get(j).getYear()<sortedList.get(oldestYear).getYear()){
                    oldestYear=j;
                }
            }
            //swap
            Song temp = sortedList.get(i);
            sortedList.set(i,sortedList.get(oldestYear));
            sortedList.set(oldestYear,temp);
        }
        //provides the format for the ArrayList to be printed in
        String format = "%-30s %-21s %-27s %-5s %11s";
        String result = String.format(format, "Title", "Artist", "Album", "year", "Genre") + "\n";
        result += "--------------------------------------------------------------\n";
        for (Song song : sortedList) {
            result += song.toString() + "\n";
        }
        return result;
    }

}
