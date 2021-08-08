import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.GUILog;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.Finder;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;

// 
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
import com.nomagic.magicdraw.openapi.uml.PresentationElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.sysml.util.SysMLConstants;
import com.nomagic.requirements.util.SysMLRequirementConstants;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.shapes.DiagramPropertiesShape;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;


import com.nomagic.uml2.impl.ElementsFactory;
import com.nomagic.magicdraw.properties.BooleanProperty;
import com.nomagic.magicdraw.properties.PropertyID;

import com.nomagic.magicdraw.properties.PropertyManager;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.magicdraw.uml.symbols.shapes.ShapeElement;

try {
    SessionManager.getInstance().createSession("session")
    project = Application.getInstance().getProject();

    //models = Finder.byNameAllRecursively().find(project.getPrimaryModel(), Class, "name1");
    classes = Finder.byTypeRecursively().find(project.getPrimaryModel(),Class);
    //give the name of each element.
    for(Element classElem : classes) {
       Application.getInstance().getGUILog().log(classElem.getName());
    }
    
    Application.getInstance().getGUILog().log("":classes[0].getName());
    //getClassType().getSimpleName();
}

finally
{
    SessionManager.getInstance().closeSession()
}