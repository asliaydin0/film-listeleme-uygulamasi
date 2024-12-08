
public class Film {
	private String filmAdi;
	private String filmTürü;
	private String yonetmen;
	private int yil;
	
	public Film (String filmAdi, String filmTürü, String yönetmen, int yil) {
		this.filmAdi = filmAdi;
		this.filmTürü = filmTürü;
		this.yonetmen = yönetmen;
		this.yil = yil;
	}
	
	@Override
	public String toString() {
	return "Film Adı: " + filmAdi + ", Film Türü: " + filmTürü +  ", Yönetmen: " + yonetmen + ", Yıl: " + yil;
	
   }

	public String getFilmAdi() {
		return filmAdi;
	}

	public String getfilmTürü() {
		return filmTürü;
	}
	
	public int getYil() {
        return yil;
    }

}
