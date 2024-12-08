package java_odev_IV;

import java.util.ArrayList;

public class filmListesi {
	private ArrayList<Film> filmListesi = new ArrayList<>();
	
	
	
	
	public void filmEkle(Film film) {
		filmListesi.add(film);
	}
	
	
	public void filmListele() {
		for (Film film : filmListesi) {
			System.out.println(film);
		}
	}
	
	
	public Film filmAra(String filmAdi) {
		for (Film film : filmListesi) {
			if (film.getFilmAdi().equalsIgnoreCase(filmAdi)) {
				return film;
			}
		}
		return null;
	}
	
	
	public void filmSil(String filmAdi) {
		filmListesi.removeIf(film -> film.getFilmAdi().equalsIgnoreCase(filmAdi));
		
	}
	
	public void filmSiralama() {
		filmListesi.sort((f1, f2) -> f1.getfilmTürü().compareToIgnoreCase(f2.getfilmTürü()));
	}
	
	public double yilOrtalama() {
		return filmListesi.stream().mapToInt(Film::getYil).average().orElse(0);
		 
	}
 
}
