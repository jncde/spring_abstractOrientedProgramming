import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class Sample {

  public static void main (String[] args) throws Exception {
    SAXBuilder sb = new SAXBuilder ();
    Document doc = sb.build (Sample.class.getClassLoader ().getResourceAsStream ("test.xml")); //构造文档对象
    Element root = doc.getRootElement (); //获取根元素
    List list = root.getChildren ("disk");//取名字为disk的所有元素
    for (int i = 0; i < list.size (); i++) {
      Element element = (Element) list.get (i);
      String name = element.getAttributeValue ("name");
      String capacity = element.getChildText ("capacity");//取disk子元素capacity的内容
      String directories = element.getChildText ("directories");
      String files = element.getChildText ("files");
      System.out.println ("磁盘信息:");
      System.out.println ("分区盘符:" + name);
      System.out.println ("分区容量:" + capacity);
      System.out.println ("目录数:" + directories);
      System.out.println ("文件数:" + files);
      System.out.println ("-----------------------------------");
    }
  }
}
