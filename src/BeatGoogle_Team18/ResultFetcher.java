package BeatGoogle_Team18;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class ResultFetcher {
	private ArrayList<Keyword> list;
	private String url;
	private String content;
	
	public void addKeyword(Keyword keyword) {
		this.list.add(keyword);
	}
	public String getUrl() {
		String keyword = list.get(0).getName();
		for(int i=1 ; i<list.size() ; i++) {
			keyword = keyword + "+" +list.get(i).getName();
		}
		this.url="https://www.google.com/webhp?hl="+keyword+"4dUDCAg&uact=5";
		return url;
	}
	public String fetchContent() throws IOException{
			URL url = new URL(this.url);
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
			String retVal = "";
			String line = null;
			
			while ((line = br.readLine()) != null){
			    retVal = retVal + line + "\n";
			}
		
			return retVal;
	}
	public int findLCS(String x, String y){
		//1. fill this method
		int[][]arr = new int[x.length()][y.length()];
		for(int i=0 ; i<x.length() ; i++ ) {
			arr[i][0]=0;
		}
		for(int j=0 ; j<y.length() ; j++) {
			arr[0][j]=0;
		}
		for(int i=1 ; i<x.length() ; i++) {
			for( int j=1 ; j<y.length() ; j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1]+1;
				}
				else {
					arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
					if(arr[i-1][j] < arr[i][j-1]) {
						arr[i][j] = arr[i][j-1];
					}
					else arr[i][j] = arr[i-1][j];
				}
			}
		}
		return arr[x.length()-1][y.length()-1];
	}
	
}
