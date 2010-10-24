class ExternalConfigGrailsPlugin {
    // the plugin version
    def version = "1.0"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.2.2 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
    ]

    def author = "Philip Stehlik"
    def authorEmail = "p@pstehlik.com"
    def title = "Configures grails app to use externalized configuration"
    def description = '''\\
Creates a Config.groovy that registers externalized configuration files for Config.groovy and DataSource.groovy.
For that reason the new externalized configuration looks in the user's .grails folder for configuration files
and reacts on application name specific environment variables for deployments on a server.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/external-config"

    def doWithWebDescriptor = { xml ->
    }

    def doWithSpring = {
    }

    def doWithDynamicMethods = { ctx ->
    }

    def doWithApplicationContext = { applicationContext ->
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }
}
