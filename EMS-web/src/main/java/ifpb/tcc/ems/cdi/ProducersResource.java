package ifpb.tcc.ems.cdi;

import ifpb.tcc.ems.interface1.IFUser;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    private static final String RESOURCE = "java:global/EMS-core/IFUserImpl!ifpb.tcc.ems.interface1.IFUser";
    
    @Produces
    @Dependent
    @Default
    private IFUser getContactService() {
        return  new ServiceLocator().lookup(RESOURCE, IFUser.class);
    }

}
