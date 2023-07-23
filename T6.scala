
object basics extends App{

    

//A = 65 Z= 90
//a = 97 z= 122



    def encrypt(text: String, key: Int): String = {
     
    if (text.isEmpty) 
       return ""

    else {
        val c : Char = text.head
      
        val new_c : Char = 
        if (!(c.isLetter)){
             
            c
        }
        else {  
        if(c.toInt >= 'a'.toInt){
            
            ((c - 'a' + (key%26)) % 26 + 'a').toChar
            
        }
        else{
             
            ((c - 'A' + (key%26)) % 26 + 'A').toChar 
        }
        }
            
        return new_c + encrypt(text.tail, key)
    }

    }


     def decrypt(text: String, key: Int): String = {
     
    if (text.isEmpty) 
       return ""

    else {
        val c : Char = text.head
      
        val new_c : Char = 
        if (!(c.isLetter)){
             
            c
        }
        else {  
        if(c.toInt >= 'a'.toInt){
            
            ((c - 'a' - (key%26) + 26) % 26 + 'a').toChar
            
        }
        else{
             
            ((c - 'A' - (key%26) + 26) % 26 + 'A').toChar 
        }
        }
            
        return new_c + decrypt(text.tail, key)
    }

    }

    val shift = 1 ; 

    // println(encrypt("abcdefghijklmnopqrstuvwxyz" , shift));
    // println(encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ" , shift));
    // println(encrypt("a1z" , shift)); 

    // println(decrypt(encrypt("abcdefghijklmnopqrstuvwxyz" , shift),shift));
    // println(decrypt(encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ" , shift),shift));
    // println(decrypt(encrypt("a1z" , shift),shift)); 



    def cipher(text: String, key: Int, func: (String, Int) => String): String = {
    func(text, key)}

    val test : String = cipher("abcdefghijklmnopqrstuvwxyz" , 1 , encrypt); 
    println(test);
    println(cipher(test , 1 , decrypt)); 


}



