package com.wmp.qa.utils.util;

import com.wmp.qa.utils.exception.FrameworkException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * FrameworkProperties.java -  Framework related all data processing and collecting class
 *
 * @author Shiwantha Lakmal
 * @version 1.0-SNAPSHOT Last modified
 * @since
 */
public class FrameworkProperties {
    private static final Logger LOGGER = LoggerFactory.getLogger(FrameworkProperties.class);

    private File projectXmlFile;//environment.xml file
    private LinkedHashMap<String, String> lnkMapLoadProperties;//load all xml values to hash map
    private LinkedHashMap<String, String> lnkMapLoadElements;//load all json values to hash map
    private DocumentBuilderFactory dbFactory;
    private DocumentBuilder dBuilder;
    private Document document;

    private NodeList nodeLstElements;
    private NodeList nodeLstNodes;
    private Node environmentType;
    private Node nodeProp;

    static File objectRepositoryFile;
    private URL inputStream;//file path extractor



    /**
     * Process project environment.json file and store all attribute in collection
     * @param projectSettingsFile File location as a string
     * @return HashMap
     * @throws FrameworkException
     */
    public HashMap readProjEnvConfig(String projectSettingsFile) throws FrameworkException {
        projectXmlFile = new File(projectSettingsFile);
        lnkMapLoadProperties = new LinkedHashMap<String, String>();
        dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setIgnoringComments(true);
        dbFactory.setIgnoringElementContentWhitespace(true);
        dBuilder = null;

        try {
            dBuilder = dbFactory.newDocumentBuilder();
            document = dBuilder.parse(projectXmlFile);
            document.getDocumentElement().normalize();
            environmentType = document.getDocumentElement().getElementsByTagName("environmentType").item(0);
            nodeLstElements = document.getDocumentElement().getElementsByTagName("environment");
            nodeLstNodes = null;
            nodeProp = null;

            for (int x = 0; x < nodeLstElements.getLength(); ++x) {
                nodeProp = document.getDocumentElement().getElementsByTagName("environment").item(x);
                if (nodeProp.getAttributes().getNamedItem("name").getTextContent().equals(environmentType.getTextContent())) {
                    lnkMapLoadProperties.put("environmentType", environmentType.getTextContent());
                    nodeLstNodes = nodeProp.getChildNodes();
                    for (int i = 0; i < nodeLstNodes.getLength(); i++) {
                        if (nodeLstNodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                            if (nodeLstNodes.item(i).getChildNodes().getLength() > 1) {
                                System.out.println();
                                NodeList subNodes = nodeLstNodes.item(i).getChildNodes();
                                for (int j = 0; j < subNodes.getLength(); j++) {
                                    if (subNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                        lnkMapLoadProperties.put(subNodes.item(j).getNodeName(), subNodes.item(j).getTextContent());
                                        System.out.println(subNodes.item(j).getNodeName() + " = " + subNodes.item(j).getTextContent());
                                    }
                                }
                            } else {
                                lnkMapLoadProperties.put(nodeLstNodes.item(i).getNodeName(), nodeLstNodes.item(i).getTextContent());
                                System.out.println(nodeLstNodes.item(i).getNodeName() + " = " + nodeLstNodes.item(i).getTextContent());
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            throw new FrameworkException("exception at:" + getClass().getSimpleName() + "-" +
                    Thread.currentThread().getStackTrace()[1].getLineNumber() + " Message:" + e.getMessage());
        }
        return lnkMapLoadProperties;
    }

    /**
     * Process project application.json file and store all attribute in collection
     * @param projectSettingsFile File location as a string
     * @return HashMap
     * @throws FrameworkException
     */
    public HashMap readProjectAppConfig(String projectSettingsFile) throws FrameworkException {
        projectXmlFile = new File(projectSettingsFile);
        lnkMapLoadProperties = new LinkedHashMap<String, String>();
        dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setIgnoringComments(true);
        dbFactory.setIgnoringElementContentWhitespace(true);
        dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            document = dBuilder.parse(projectXmlFile);

            document.getDocumentElement().normalize();
            nodeLstElements = document.getDocumentElement().getElementsByTagName("environment");
            nodeLstNodes = null;
            nodeProp = null;
            for (int x = 0; x < nodeLstElements.getLength(); ++x) {
                nodeProp = document.getDocumentElement().getElementsByTagName("environment").item(x);
                if (nodeProp.getAttributes().getNamedItem("name").getTextContent().equals(environmentType)) {
                    nodeLstNodes = nodeProp.getChildNodes();
                    for (int i = 0; i < nodeLstNodes.getLength(); i++) {
                        if (nodeLstNodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                            if (nodeLstNodes.item(i).getChildNodes().getLength() > 1) {
                                System.out.println();
                                NodeList subNodes = nodeLstNodes.item(i).getChildNodes();
                                for (int j = 0; j < subNodes.getLength(); j++) {
                                    if (subNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                        lnkMapLoadProperties.put(subNodes.item(j).getNodeName(), subNodes.item(j).getTextContent());
                                        System.out.println(subNodes.item(j).getNodeName() + " = " + subNodes.item(j).getTextContent());
                                    }
                                }
                            } else {
                                lnkMapLoadProperties.put(nodeLstNodes.item(i).getNodeName(), nodeLstNodes.item(i).getTextContent());
                                System.out.println(nodeLstNodes.item(i).getNodeName() + " = " + nodeLstNodes.item(i).getTextContent());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new FrameworkException("exception at:" + getClass().getSimpleName() + "-" +
                    Thread.currentThread().getStackTrace()[1].getLineNumber() + " Message:" + e.getMessage());
        }
        return lnkMapLoadProperties;
    }

    public HashMap readElementsForTagFromFile(String strElementFile, String strClassName, String strTagName){
        inputStream = getClass().getClassLoader().getResource(strElementFile);
        objectRepositoryFile = new File(inputStream.getPath());
        return lnkMapLoadElements;
    }
}
