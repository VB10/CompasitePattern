

package compositepatterndemo;
import  compositepatterndemo.Employee.*;


public class CompositePatternDemo {

  
    public static void main(String[] args) {
        
        //listeye kişileri ekleyip duruma listeliyoruz
        Employee CEO = new Employee("VB", "CEO", 30000); 
        Employee COP = new Employee("RND", "copcu", 10);
        Employee BAK = new Employee("ALİ", "Bakkal", 23);
        
        Employee Alininoglu = new Employee("hamdi", "bakkaljr", 1234);
        Employee Alininikincioglu= new Employee("hamdiye", "bakkaljr2", 1);
        
        //ceo nesnesinin altına eklediklerimiz
        CEO.add(COP);
        CEO.add(BAK);
        
        //bakkalın altındakiler
        BAK.add(Alininoglu);
        BAK.add(Alininikincioglu);
        
        System.out.println(CEO);
        
        //ic ice iki for ile en alta kadar çagırıyoruz listeyi
        for (Employee bakkal: CEO.getSubordinates()) {
            System.out.println(bakkal);
            for (Employee ogulturu  :   bakkal.getSubordinates()) {
                System.out.println(ogulturu);
            }
        }
        
        
    }
    
}
