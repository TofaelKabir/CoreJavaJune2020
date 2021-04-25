package lec22_java_coding_challenge_for_interview;

public class RemoveJunk {
    public static void main(String[] args) {
        String s = "hello%&^&()";
        // 1 . regular Expression
        s= s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        String s1 = "*&^%$java";
        s1 = s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);
    }
}


/* Asked in EPAM interview question:
 Given homepage with a lot of links (menu items, etc.). Write test to check that there is no such link where link text starts or ends with white-space.

Example of good link: <a href="/contact-us">Contact Us</a>
Example of bad link: <a href="/help/" target="_blank">  Help</a>

public void correctOrNot(){
   List<WebElement> list = driver.findElements(By.tagName(a));
   for(WebElement element: list){
       String st = element.getText();
       if(st.startsWith(" ") || st.endsWith(" ")){
        System.out.println("Not Correct");
       }else{
        System.out.println("Correct");
       }
   }

}
 * */
