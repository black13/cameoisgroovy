import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.GUILog;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.Finder;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;

try {
    SessionManager.getInstance().createSession("session")
    project = Application.getInstance().getProject();

    //models = Finder.byNameAllRecursively().find(project.getPrimaryModel(), Class, "name1");
    classes = Finder.byTypeRecursively().find(project.getPrimaryModel(),Class);
    //give the name of each element.
    for(Element classElem : classes) {
 
    }
}

finally
{
    SessionManager.getInstance().closeSession()
}