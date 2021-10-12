import java.util.*
import java.text.*
import java.time.ZoneId

fun main(args: Array<String>) {
    val d1 = Date(Long.MAX_VALUE)
    val d2 = Date(Long.MIN_VALUE)
    d2.time
    val sdf = SimpleDateFormat("d MMM yyy G")
    println(sdf.format(d1))
    println(sdf.format(d2))
    
    val start = Date()
    var sum = 0
    for(i in (0..1_000_000)){
        sum +=i
    }
    val end = Date()
    val interval = end.time - start.time
    println("$interval Millisekunden")
/*
    var c = Calendar.SECOND;
    c.t = Date()
    var month = c.get(Calendar.Month)
    val d = Date()
    println("%td.%tm.%tY".format(d,d,d))

    val ital = Locale("it", "IT")
    val df2a = SimpleDateFormat(M)
*/

}