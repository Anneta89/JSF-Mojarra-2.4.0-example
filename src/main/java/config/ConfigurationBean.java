package config;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.faces.annotation.FacesConfig;

@ApplicationScoped
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Alternative
@Priority(500)
public class ConfigurationBean {
}