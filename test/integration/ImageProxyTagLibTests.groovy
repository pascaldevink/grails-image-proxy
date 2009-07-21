import org.codehaus.groovy.grails.commons.ConfigurationHolder

class ImageProxyTagLibTests extends GroovyTestCase {

    static transactional = false
    
    void testGetImage() {

        def imgProxy = new ImageProxyTagLib()
        imgProxy.setLocation()
        
        def attrs = [:]
        attrs.src = ""
        attrs.name = "test"
        attrs.type = "jpg"
        attrs.alt = "This is a test"
        attrs.id = "test"
        attrs.title = "This is a test"
        attrs.width = "100"
        attrs.height = "200"
        attrs.onclick = "alert('alerting on click')"
        attrs.onmousedown = "alert('alerting on mouse down')"
        attrs.onkeyup = "alert('alerting on key up')"

        def weblocation = "http://localhost:8080/images/imgProxy/"+attrs.name+"."+attrs.type
        def output = "<img src=\""+weblocation+"\" alt=\""+attrs.alt+"\" id=\""+attrs.id+"\" "+
                    "title=\""+attrs.title+"\" width=\""+attrs.width+"\" height=\""+attrs.height+"\" onclick=\""+attrs.onclick+"\" "+
                    "onmousedown=\""+attrs.onmousedown+"\" onkeyup=\""+attrs.onkeyup+"\""+" />"


        def getImage = imgProxy.getImage(attrs)

        assertEquals(output, getImage)
    }
}
