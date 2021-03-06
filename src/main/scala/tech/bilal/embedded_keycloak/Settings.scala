package tech.bilal.embedded_keycloak

import scala.language.implicitConversions

case class Settings(port: Int = 8081,
                    host: String = "0.0.0.0",
                    keycloakDirectory: String = "/tmp/embedded-keycloak/",
                    cleanPreviousData: Boolean = true,
                    alwaysDownload: Boolean = false,
                    version: String = "4.6.0")

object Settings {
  val default = Settings()
}
