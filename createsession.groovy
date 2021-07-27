import com.nomagic.magicdraw.core.Application
import com.nomagic.magicdraw.core.GUILog
import com.nomagic.magicdraw.core.Project
import com.nomagic.magicdraw.openapi.uml.SessionManager
import com.nomagic.magicdraw.uml.Finder
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element
                                                        
try {
    SessionManager.getInstance().createSession("session")
}
finally
{
    SessionManager.getInstance().closeSession()
}