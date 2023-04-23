import java.util.ArrayList;


public class Playlist {

  
  public static void main(String[] args) {
    // create new playlist stored as an ArrayList  
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    
    // add songs to playlist 
    desertIslandPlaylist.add("Poison");
    desertIslandPlaylist.add("Pills & Bills");
    desertIslandPlaylist.add("Rags to Riches");
    desertIslandPlaylist.add("Shooting Star");
    desertIslandPlaylist.add("Soulfly");
    desertIslandPlaylist.add("Rich off Pain");
    desertIslandPlaylist.add("Heart on Ice");
    
    // print playlist 
    System.out.println(desertIslandPlaylist);
    
    // check and print # of songs 
    System.out.println(desertIslandPlaylist.size());
    
    // remove songs 
    desertIslandPlaylist.remove("Shooting Star");
    desertIslandPlaylist.remove("Heart on Ice");
    
    // check and print playlist size 
    System.out.println(desertIslandPlaylist.size());
    
    // get and print indices of songs to swap 
    System.out.println(desertIslandPlaylist.indexOf("Rags to Riches"));
    System.out.println(desertIslandPlaylist.indexOf("Rich off Pain"));
    
    // create variables to store songs 
    String song1 = "Rags to Riches";
    String song2 = "Rich off Pain";
    
    //  swap songs 
    desertIslandPlaylist.set(2, "Rich off Pain");
    desertIslandPlaylist.set(4, "Rags to Riches");
    
    // print playlist 
    System.out.println(desertIslandPlaylist);
  }
}
