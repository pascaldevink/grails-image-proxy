class ImageProxyGrailsPlugin {
    def version = 0.2
    def dependsOn = [:]

    // TODO Fill in these fields
    def author = "Pascal de Vink"
    def authorEmail = "pascal.de.vink@gmail.com"
    def title = "Image proxy for downloading images from other places"
    def description = "Let the application download images from a remote server " +
                      "(ie, behing a firewall) and present them to the user."

    // URL to the plugin's documentation
    def documentation = "http://grails.org/ImageProxy+Plugin"

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
