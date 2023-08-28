object basics extends App {
  def countLetterOccurrences(words: List[String]): Int = {
    
    val wordLengths = words.map(word => word.length)

   
    val totalLength = wordLengths.reduce(_ + _)

    totalLength
  }

 
  val input = List("apple", "banana", "cherry", "date")
  val output = countLetterOccurrences(input)
  println(s"Total count of letter occurrences: $output")  
}