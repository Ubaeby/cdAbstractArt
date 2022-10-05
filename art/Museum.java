package art;

import java.util.ArrayList;
import java.util.Collections;


public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Art> museum = new ArrayList<Art>();
		Painting painting1 = new Painting("A Midnight Breeze", "Rosalynn Choi", "Have you ever had a dream that you, um you, that...", "oil");
		museum.add(painting1);
		Painting p2 = new Painting("Bearriffic", "Johnny martin", "The bears, they are everywhere, oh god", "water color");
		museum.add(p2);
		Painting p3 = new Painting("Nightmare", "Jazminn", "nightmare nightmare nightmare nightmare!!!!!", "crayon");
		museum.add(p3);
		
		Sculpture s1 = new Sculpture("OoogaBoogaOooga", "Eustace", "Stupid dog, you made me look bad", "marble");
		museum.add(s1);
		Sculpture s2 = new Sculpture("Divine Goddess", "Rosie", "the femininity of god", "crystal");
		museum.add(s2);
			
		
		Collections.shuffle(museum);
		
		for (Art m : museum) {
			m.viewArt();
		}

	}

}