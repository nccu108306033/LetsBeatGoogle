package BeatGoogle_Team18;
import java.io.IOException;
import java.util.ArrayList;

public class WebPage {
	public String url;
	public String name;
	public double score;
	public WordCounter counter;
	
	public WebPage(String url,String name){
		this.url = url;
		this.name = name;
		this.counter = new WordCounter(url);	
	}
	
	public void setScore(ArrayList<Keyword> keywords) throws IOException{
		score = 0;
		for(Keyword k : keywords){		
			score += k.weight*counter.countKeyword(k.name);	//權重＊次數
		}
	}
	
}
