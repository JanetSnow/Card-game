// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yaowenjin/Desktop/ITSDfinal/conf/routes
// @DATE:Mon Mar 13 16:59:11 GMT 2023


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
