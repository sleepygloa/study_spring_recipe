package recipe5_2_9.com.pojo.shop;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.annotation.PostConstruct;

import org.springframework.core.io.Resource;

public class BannerLoader {
	
	private Resource banner;

	public void setBanner(Resource banner) {
		this.banner = banner;
	}

	@PostConstruct
	public void showBenner() throws IOException{
		Files.lines(Paths.get(banner.getURI()), Charset.forName("UTF-8")).forEachOrdered(System.out::println);
	}
	
}
