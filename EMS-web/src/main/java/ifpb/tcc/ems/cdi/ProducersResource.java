package ifpb.tcc.ems.cdi;

import ifpb.tcc.ems.interface1.IFUser;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    @Produces 
    @Resource(lookup = "java:global/EMS-core/IFUserImpl!ifpb.tcc.ems.interface1.IFUser")
    private IFUser userService;

}
