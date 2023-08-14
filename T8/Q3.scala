object basics extends App{

val toUpper: String => String = s => s.toUpperCase;

val toLower: String => String = s => s.toLowerCase;

val formatNames: String => (String => String) => String = name => formatter => formatter(name);
val Benny = "Benny";
val Niroshan = "Niroshan"; 
val Saman = "Saman";
val Kumara = "Kumara"; 
println(formatNames(Benny)(toUpper));
println(formatNames(Niroshan.take(2))(toUpper)+formatNames(Niroshan.drop(2))(toLower));
println(formatNames(Saman)(toLower));

println(formatNames(Kumara.take(1))(toUpper)+formatNames(Kumara.drop(1).take(4))(toLower)+formatNames(Kumara.drop(5))(toUpper));





}