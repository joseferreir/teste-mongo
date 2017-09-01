package ifpb.tcc.ems.cdi;

import ifpb.dac.stateless.IFCalculadora;
import ifpb.dac.stateless.IFUser;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    
    @Produces 
    @Resource(lookup = "java:global/EMS-core/CalculadoraImpl")
    private IFCalculadora calculadora;
    @Produces 
    @Resource(lookup = "java:global/EMS-core/IFUserImpl")
    private IFUser userService;

}
