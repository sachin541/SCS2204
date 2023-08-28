object basics extends App {
  def calculateAverage(temperatures: List[Double]): Double = {
    
    val fahrenheitTemperatures = temperatures.map(c => (c * 9/5) + 32)
    
   
    val totalFahrenheit = fahrenheitTemperatures.reduce(_ + _)
    
    totalFahrenheit / temperatures.length
  }

  val input = List(0.0, 10.0, 20.0, 30.0)
  val output = calculateAverage(input)
  println(s"Average Fahrenheit temperature: $output") 
}