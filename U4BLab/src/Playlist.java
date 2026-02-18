import java.util.*;
public class Playlist {
    private ArrayList<Song> songList;
    public Playlist(ArrayList<Song> list){
        songList=list;
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
        return"in Progress";
    }
    public String sortZToA(){
        ArrayList<Song> sortedList = new ArrayList<>();
        return"in Progress";
    }
    public String searchByGenre(String genre){
        ArrayList<Song> sortedList = new ArrayList<>();
        for(Song song:songList){
            if(song.getGenre().equals(genre)){
                sortedList.add(song);
            }
        }
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
        ArrayList<Song> sortedList = songList;
        for(int i = 0; i<sortedList.size()-1;i++){
            int newestYear = i;
            for(int j = i+1;j<sortedList.size();j++){
                if(sortedList.get(j).getYear()>sortedList.get(newestYear).getYear()){
                    newestYear=j;
                }
            }
            //swap
            Song temp = sortedList.get(newestYear);
            sortedList.
        }
        return sortedList.toString();
    }
    public String sortByReleaseYearOldToNew(){
        ArrayList<Song> sortedList = new ArrayList<>();
        return"in Progress";
    }

}
