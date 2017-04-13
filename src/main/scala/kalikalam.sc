val activities = Map("t01" -> "primary needs","t03" -> "primary needs","t11" -> "primary needs",
  "t1801" -> "primary needs","t1803" -> "primary needs",
  "t05" -> "work","t1805" -> "work")

val strings = List("t180612","t180319","t050505","t051600","t180509","t011111","t0303")

def classify (string: String):String  =
    activities.getOrElse(string.take(5),activities.getOrElse(string.take(3),"other"))

strings.groupBy(classify)
