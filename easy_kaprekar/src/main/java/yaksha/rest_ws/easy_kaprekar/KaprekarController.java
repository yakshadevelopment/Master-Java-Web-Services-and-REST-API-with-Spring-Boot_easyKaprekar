package yaksha.rest_ws.easy_kaprekar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KaprekarController {
	@Autowired
	KaprekarService service;
	
	@GetMapping("/create/{start}/{end}")
	public String createKapreparSeries(@PathVariable int start,@PathVariable int end )
	{
		service.generateKaprekarSeries(start,end);
		return "Done";
		
	}
	
	@GetMapping(path="/showListJson", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Kaprekar> showListInJson()
	{
		return service.getList();
	}
	
	@GetMapping(path="/showListXml", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Kaprekar> showListInXML()
	{
		return service.getList();
	}
	
	
}
