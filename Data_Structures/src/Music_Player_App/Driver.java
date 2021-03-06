package Music_Player_App;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Driver {
	public static Scanner sc = new Scanner(System.in);
	static LinkedList<Song> playlist = new LinkedList<>();

	public static void main(String[] args) {
			Song s1 =new Song("Drag me down"," one d");
		Song s2 =new Song("Zingat","Sairat");
		Song s3 =new Song("Night Changes"," one d");
		playlist.add(s1);
		playlist.add(s2);
		playlist.add(s3);
		boolean quit = false;
		
		ListIterator<Song> songListIterator = playlist.listIterator() ;

		if(playlist.isEmpty()) {
			System.out.println("Empty playlist");
		}
		else {
            System.out.println("Playing " + songListIterator.next().getSongName());

		}
		menuOption();
		while (!quit) {

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {

			case 0:
				quit = true;
				break;

			case 1:
				if(songListIterator.hasNext()) {
				Song s= songListIterator.next();
				System.out.println("now playing "+s.getSongName()+" from "+s.songMovie);}
				else {
					System.out.println("End of list");
				}
				break;

			case 2:
				if(songListIterator.hasPrevious()) {
				Song s21= songListIterator.previous();
				System.out.println("now playing "+s21.getSongName()+" from "+s21.songMovie);}
				else {
					System.out.println("End of list");
				}
				break;

			

			default:
				menuOption();
			}
		}

	}
	public static void menuOption() {
		 	System.out.println("Press 0 to quit");
	        System.out.println("Press 1 to play next");
	        System.out.println("Press 2 to play prev");
	      
	}
	
	
	
}
