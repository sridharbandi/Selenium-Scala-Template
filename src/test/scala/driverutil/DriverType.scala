package driverutil

object DriverType extends Enumeration {
  type EnumType = Value
  val CHROME,
  FIREFOX,
  OPERA,
  EDGE,
  IE = Value

  def withNameOpt(s: String): Option[Value] = values.find(_.toString == s)
}
