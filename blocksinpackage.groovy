import com.nomagic.magicdraw.core.Application
import com.nomagic.magicdraw.core.GUILog
import com.nomagic.magicdraw.core.Project
import com.nomagic.magicdraw.openapi.uml.SessionManager
import com.nomagic.magicdraw.uml.Finder
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.Finder;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.magicdraw.uml.ClassifierFinder;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;

try {
    SessionManager.getInstance().createSession("session")
    project = Application.getInstance().getProject();
                                                                               
    package1 = Finder.byQualifiedName().find(project, "package1");                                                                      
    //models = Finder.byNameAllRecursively().find(project.getPrimaryModel(), Class, "name1");
    classes = Finder.byTypeRecursively().find(package1,Class);
    //give the name of each element.
    for(Element classElem : classes) {
       Application.getInstance().getGUILog().log(classElem.getName());
    }
    
    //for(idx=0; idx<classes.size(); idx++) {
    
      //Application.getInstance().getGUILog().log(classes[i].getType())
    
    //}      
    //classes[1].getType() 
    Application.getInstance().getGUILog().log(classes[0].getName());//getClassType().getSimpleName();
}

finally
{
    SessionManager.getInstance().closeSession()
}