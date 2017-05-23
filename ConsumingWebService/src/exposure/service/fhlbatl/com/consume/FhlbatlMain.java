package exposure.service.fhlbatl.com.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import NET.webserviceX.www.StockQuote;

public class FhlbatlMain {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.webservicex.com/stockquote.asmx?WSDL");
		QName qname = new QName("http://www.webserviceX.NET/",
				"StockQuote");

		Service service = Service.create(url, qname);

		StockQuote hello = service.getPort(StockQuote.class);

		System.out.println(hello.toString());
	}
}
