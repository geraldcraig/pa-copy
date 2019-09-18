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
		this.singlesTopTen.add(new Song("Take Me BackTo London", "Ed Sheeran", "ed.png"));
		
		
		return this.singlesTopTen;
	}
//	
//	public ArrayList<TopTen> getalbumsTopTen() {
//		
//		this.albumsTopTen = new ArrayList<TopTen>();
//		
//		//add albums here!
//		this.albumsTopTen.add(new TopTen("", "Albums", ".png"));
//		
//		
//		
//		return this.albumsTopTen;
//}

}
