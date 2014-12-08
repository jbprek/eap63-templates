package org.bagab.mdb.simple;

import org.eu.ingwar.tools.arquillian.extension.suite.annotations.ArquillianSuiteDeployment;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

/**
 * @author prekezes.
 */
@ArquillianSuiteDeployment
public class Deployments {
    @Deployment(name = "test-suite", order = 2)
    public static Archive<?> generateDefaultDeployment() {
        return ShrinkWrap.create(JavaArchive.class, "ejb-template.jar")
                .addPackage(Deployments.class.getPackage())
                .addPackage(GreeterEJB.class.getPackage());
    }

}
