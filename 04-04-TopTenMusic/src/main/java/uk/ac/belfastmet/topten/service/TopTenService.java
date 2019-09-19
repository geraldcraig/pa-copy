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
		
		
		return this.singlesTopTen;
	}
	
	public ArrayList<Album> getalbumsTopTen() {
		
		this.albumsTopTen = new ArrayList<Album>();
		
		//add albums here!
		this.albumsTopTen.add(new Album("Hollywood's Bleeding", "Post Malone", "postMaloneA.png"));
		this.albumsTopTen.add(new Album("No.6 Collaborations Project", "Ed Sheeran", "edSheeranA.png"));
		this.albumsTopTen.add(new Album("Aitch20", "Aitch", "aitchA.png"));
		this.albumsTopTen.add(new Album("Lover", "Taylor Swift", "taylorSwiftA.png"));
		this.albumsTopTen.add(new Album("Divinely Uninspired To A Hellish Extent", "Lewis Capaldi", "lewisCapaldiA.png"));
		
			
		
		return this.albumsTopTen;
}

}
