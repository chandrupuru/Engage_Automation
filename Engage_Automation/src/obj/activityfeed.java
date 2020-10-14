package obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.services;

public class activityfeed extends services {
	
	public static String feedhome= "//*[@id=\"sidebar\"]/ul/li[2]/a/i";
	//FEED HOME
	public static String news= "//*[@id=\"page-content\"]/div[1]/div/a[1]";
	public static String infographics= "//*[@id=\"page-content\"]/div[1]/div/a[2]";
	public static String curetedcontent="//*[@id=\"page-content\"]/div[1]/div/a[3]";
	public static String videos="//*[@id=\"page-content\"]/div[1]/div/a[4]";
	public static String feedlist="//*[@id=\"page-content\"]/div[1]/div/a[5]";
	//NEWS
	public static String longnews="//*[@id=\"page-content\"]/div[3]/div[1]/div/ul/li[1]/a";
	public static String shortnews="//*[@id=\"page-content\"]/div[3]/div[1]/div/ul/li[2]/a";
	//CURATED CONTENT
	public static String twitter="//*[@id=\"page-content\"]/div[3]/div[1]/div/ul/li[1]/a";
	public static String instagram= "//*[@id=\"page-content\"]/div[3]/div[1]/div/ul/li[2]/a";
	public static String Facebook = "//*[@id=\"page-content\"]/div[3]/div[1]/div/ul/li[3]/a";
	public static String othersite="//*[@id=\"page-content\"]/div[3]/div[1]/div/ul/li[5]/a";
	//FEED LIST
	public static String searchfield ="//*[@id=\"content-list_filter\"]/label/input";
	public static String editfeed="//*[@id=\"content-list\"]/tbody/tr[1]/td[8]/div/a[1]/i";	
	public static String deletefeed="//*[@id=\"content-list\"]/tbody/tr[1]/td[8]/div/a[2]/i";
	//LONG NEWS
	public static String longnewstitle="//*[@id=\"ln_title\"]";
	public static String longnewsimage="//*[@id=\"ln_image\"]";
	public static String longnewscontent="/html/body";
	public static String longnewspush="//*[@id=\"ln_form\"]/div[1]/div/div[2]/div[2]/p/label/span";
	public static String longnewscreate="//*[@id=\"ln_form\"]/div[3]/input";
	public static String longnewsconfirm ="//*[@id=\"btn-yes-click\"]";
	//SHORT NEWS
	public static String shortnewstitle="//*[@id=\"sn_title\"]";
	public static String shortnewscontent="//*[@id=\"sn_content\"]";
	public static String shortnewsimage="//*[@id=\"sn_image\"]";
	public static String shortnewspush="//*[@id=\"sn_form\"]/div[1]/div/div[2]/div[2]/p/label/span";
	public static String shortnewscreate="//*[@id=\"sn_form\"]/div[3]/input";
	public static String shortnewsconfirm ="//*[@id=\"btn-yes-click\"]";
	//INFOGRAPHICS
	public static String infotitle= "//*[@id=\"ig_title\"]";
	public static String infoimage= "//*[@id=\"ig_image\"]";
	public static String infopush="//*[@id=\"ig_form\"]/div[1]/div/div/div[3]/p/label/span";
	public static String infocreate= "//*[@id=\"ig_form\"]/div[3]/input";
	public static String infoconfirm= "//*[@id=\"btn-yes-click\"]";
	//TWITTER
	public static String twittertitle="//*[@id=\"tw_title\"]";
	public static String twitterURL="//*[@id=\"tw_post_id\"]";
	public static String twitterpush="//*[@id=\"twitter\"]/form/div[1]/div/div/div[3]/p/label/span";
	public static String twittercreate="//*[@id=\"twitter\"]/form/div[3]/input";
	public static String twitterconfirm="//*[@id=\"btn-yes-click\"]";
	//INSTAGRAM
	public static String instatitle="//*[@id=\"ing_title\"]";
	public static String instacode="//*[@id=\"ing_post_id\"]";
	public static String instapush="//*[@id=\"instagram\"]/form/div[1]/div/div/div[3]/p/label/span";
	public static String instacreate="//*[@id=\"instagram\"]/form/div[3]/input";
	public static String instaconfirm="//*[@id=\"btn-yes-click\"]";
	//FACEBOOK
	public static String fbtitle="//*[@id=\"fb_title\"]";
	public static String fbcode="//*[@id=\"fb_post_id\"]";
	public static String fbpush="//*[@id=\"facebook\"]/form/div[1]/div/div/div[3]/p/label/span";
	public static String fbcreate="//*[@id=\"fb_submit_button\"]";
	public static String fbconfirm="//*[@id=\"btn-yes-click\"]";
	//OTHER WEBSITES
	public static String othersiteURL="//*[@id=\"owc_post_url\"]";
	public static String othersitefetch="//*[@id=\"buttonFetch\"]";
	public static String othersitecreate="//*[@id=\"other\"]/form/div[3]/input";
	public static String othersitepush="//*[@id=\"fetchCuratedBlock\"]/div[2]/div[3]/p/label/span";
	public static String othersiteconfirm="//*[@id=\"btn-yes-click\"]";
	//YOUTUBE
	public static String youtubetitle="//*[@id=\"yt_title\"]";
	public static String youtubeURL="//*[@id=\"yt_post_id\"]";
	public static String youtubepush="//*[@id=\"youtube\"]/form/div[1]/div/div/div[3]/p/label/span";
	public static String youtubecreate="//*[@id=\"youtube\"]/form/div[3]/input";
	public static String youtubeconfirm="//*[@id=\"btn-yes-click\"]";
	
	
	
	public activityfeed(WebDriver driver) {
		super(driver);
	}
	
	public void creatlongnews(String title, String message,String image) throws InterruptedException {
		waitForElement(feedhome);
		click(feedhome);
		click(news);
		click(longnews);
		type(longnewstitle, title);
		driver.switchTo().frame(0);
        type(longnewscontent, message);
        driver.switchTo().parentFrame();
        type(longnewsimage, image);
        click(longnewspush);
        click(longnewscreate);
        click(longnewsconfirm);
        
			
	}
	
	public void createshortnews(String title, String message,String image)  {
		waitForElement(feedhome);
		click(feedhome);
		click(news);
		click(shortnews);
		type(shortnewstitle, title);
        type(shortnewscontent, message);
        type(shortnewsimage, image);
        click(shortnewspush);
        click(shortnewscreate);
        click(shortnewsconfirm);
        
	}
	
	public void createinfographics(String title,String image) {
		waitForElement(feedhome);
		click(feedhome);
		click(infographics);
		type(infotitle, title);
        type(infoimage, image);
        click(infopush);
        click(infocreate);
        click(infoconfirm);
		
	}
	public void createtwitter(String title,String URL) {
		waitForElement(feedhome);
		click(feedhome);
		click(curetedcontent);
		click(twitter);
		type(twittertitle, title);
        type(twitterURL, URL);
        click(twitterpush);
        click(twittercreate);
        click(twitterconfirm);
	}
	
	public void createinsta(String title,String code) {
		waitForElement(feedhome);
		click(feedhome);
		click(curetedcontent);
		click(instagram);
		type(instatitle, title);
        type(instacode, code);
        click(instapush);
        click(instacreate);
        click(instaconfirm);
	}
	public void createfb(String title,String code) {
		waitForElement(feedhome);
		click(feedhome);
		click(curetedcontent);
		click(Facebook);
		type(fbtitle, title);
        type(fbcode, code);
        click(fbpush);
        click(fbcreate);
        click(fbconfirm);
	}
	public void createotherwebsite(String URL) {
		waitForElement(feedhome);
		click(feedhome);
		click(curetedcontent);
		click(othersite);
        type(othersiteURL, URL);
        click(othersitefetch);
        waitForElement(othersitepush);
        click(othersitepush);
        click(othersitecreate);
        click(othersiteconfirm);
	}
	public void createyoutube(String title,String URL) {
		waitForElement(feedhome);
		click(feedhome);
		click(videos);
		type(youtubetitle, title);
        type(youtubeURL, URL);
        click(youtubepush);
        click(youtubecreate);
        click(youtubeconfirm);
       
	}
}

