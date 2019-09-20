package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.topten.domain.Album;
import uk.ac.belfastmet.topten.domain.Song;


@Service
public class TopTenService {
	
	private ArrayList<Song> singlesTopTen;
	private ArrayList<Album> albumsTopTen;
	
	public ArrayList<Song> getsinglesTopTen() {
		
		this.singlesTopTen = new ArrayList<Song>();
		
		//add singles here!
		this.singlesTopTen.add(new Song("Take Me Back To London", "Ed Sheeran Ft. Stormzy", "edSheeran.png"));
		this.singlesTopTen.add(new Song("Taste (Make It Shake)", "Aitch", "aitch.png"));
		this.singlesTopTen.add(new Song("Higher Love", "Kygo & Whitney Houston", "kygo.png"));
		this.singlesTopTen.add(new Song("Ladbroke Grove", "AJ Tracey", "ajTracey.png"));
		this.singlesTopTen.add(new Song("Circles", "Post Malone", "postMalone.png"));
		this.singlesTopTen.add(new Song("Sorry", "Joel Corry", "joelCorry.png"));
		this.singlesTopTen.add(new Song("3 Nights", "Dominic Fike", "dominicFike.png"));
		this.singlesTopTen.add(new Song("Ransom", "Lil Tecca", "lilTecca.png"));
		this.singlesTopTen.add(new Song("Strike A Pose", "Young T & Bugsey Ft Aitch", "youngT.png"));
		this.singlesTopTen.add(new Song("Goodbyes", "Post Malone Ft Young Thug", "postMaloneFtYoungThug.png"));
		
		
		return this.singlesTopTen;
	}
	
	public ArrayList<Album> getalbumsTopTen() {
		
		this.albumsTopTen = new ArrayList<Album>();
		
		//add albums here!
		this.albumsTopTen.add(new Album("Hollywood's Bleeding", "Post Malone", "postMaloneA.png", "1"));
		this.albumsTopTen.add(new Album("No.6 Collaborations Project", "Ed Sheeran", "edSheeranA.png", "2"));
		this.albumsTopTen.add(new Album("Aitch20", "Aitch", "aitchA.png", "3"));
		this.albumsTopTen.add(new Album("Lover", "Taylor Swift", "taylorSwiftA.png", "4"));
		this.albumsTopTen.add(new Album("Divinely Uninspired To A Hellish Extent", "Lewis Capaldi", "lewisCapaldiA.png", "5"));
		this.albumsTopTen.add(new Album("Backbone", "Status Quo", "statusQuoA.png", "6"));
		this.albumsTopTen.add(new Album("Norman F***king Rockwell", "Lana Del Rey", "lanaDelReyA.gif", "7"));
		this.albumsTopTen.add(new Album("K-12", "Melanie Martinez", "melanieMartinezA.png", "8"));
		this.albumsTopTen.add(new Album("Snacks", "Jax Jones", "jaxJonesA.png", "9"));
		this.albumsTopTen.add(new Album("When We All Fall Asleep Where Do We Go", "Billie Eilish", "billieEilishA.png", "10"));
		
			
		
		return this.albumsTopTen;
}

}
