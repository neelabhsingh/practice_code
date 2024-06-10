package design_pattern.structuralpattern.adapter;
class XMLParser{
    public String parseXML(String xmlData){
        return "Parsed XML data";
    }
}
interface Parse{
    String parse(String data);
}
class XMLParseAdapter implements Parse{
    XMLParser xmlParser;
    public XMLParseAdapter(){
        xmlParser = new XMLParser();
    }
    @Override
    public String parse(String data) {
        return xmlParser.parseXML(data);
    }
}

public class AdapterDesignPatternDemo {
    public static void main(String[] args) {
        Parse parser = new XMLParseAdapter();
        String data = "<data>...</data>";
        String result = parser.parse(data);
        System.out.println(result);
    }
}
