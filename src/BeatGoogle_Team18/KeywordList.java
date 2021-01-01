package BeatGoogle_Team18;
import java.util.ArrayList;

public class KeywordList {
	public KeywordList() {
		ArrayList <Keyword> lst = new ArrayList<Keyword>();
		lst.add(new Keyword("影城", 5));
		lst.add(new Keyword("上映日期", 3));
		lst.add(new Keyword("訂票", 4));
		lst.add(new Keyword("主演", 1));
		lst.add(new Keyword("數位", 3));
		lst.add(new Keyword("2D", 3));
		lst.add(new Keyword("3D", 1));
	}
}
