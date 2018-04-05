import java.io.*;

public class Demo{
    public static void main(String[] args){
        
        String str;
            str = "Hello";
            str += "World!!!";
            
            //Create a object of StringBuffer class
            StringBuffer strbuf = new StringBuffer();
            strbuf.append(str);
            System.out.println(strbuf);
        
            strbuf.delete(0,str.length());
            
            //append()
            strbuf.append("Hello");
            strbuf.append("World");    
            //print HelloWorld
            System.out.println(strbuf);
            
            //insert()
            strbuf.insert(5,"_Java ");  

            //print Hello_Java World
            System.out.println(strbuf);
            
            //reverse()
            strbuf.reverse();
            System.out.print("Reversed string : ");
            System.out.println(strbuf);    
            //print dlroW avaJ_olleH
        
            strbuf.reverse();
            System.out.println(strbuf);  
            //print Hello_Java World
            
            //setCharAt()
            strbuf.setCharAt(5,' ');
            System.out.println(strbuf);    
            //prit Hello Java World
            
            //charAt()
            System.out.print("Character at 6th position : ");
            System.out.println(strbuf.charAt(6));    
            //print J
            
            //substring()
            System.out.print("Substring from position 3 to 6 : ");
            System.out.println(strbuf.substring(3,7));  
            //print lo J
            
            //deleteCharAt()
            strbuf.deleteCharAt(3);
            System.out.println(strbuf);  
            //print Helo java World
            
            //capacity()
            System.out.print("Capacity of StringBuffer object : ");
            System.out.println(strbuf.capacity());    
            
            //delete() and length()
            strbuf.delete(6,strbuf.length());    
            System.out.println(strbuf);    
            //no anything
        
    }
}