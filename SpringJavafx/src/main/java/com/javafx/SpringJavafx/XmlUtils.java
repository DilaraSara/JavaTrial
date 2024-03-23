/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafx.SpringJavafx;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.StringReader;
import org.springframework.stereotype.Component;

/**
 *
 * @author dilarasara
 */
@Component
public class XmlUtils {
    public static OnlineKPI parseXmlData(String xmlData) throws JAXBException {
        // XML verilerini <ArrayOfOnlineKPI> etiketinden itibaren alın
        int startIndex = xmlData.indexOf("<ArrayOfOnlineKPI xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
        if (startIndex == -1) {
            throw new IllegalArgumentException("XML verisi geçerli bir başlık içermiyor.");
        }
        String trimmedXmlData = xmlData.substring(startIndex);

        JAXBContext jaxbContext = JAXBContext.newInstance(OnlineKPI.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        // Ayrılan XML verilerini dönüştürün
        return (OnlineKPI) unmarshaller.unmarshal(new StringReader(trimmedXmlData));
    }
    
   
}
