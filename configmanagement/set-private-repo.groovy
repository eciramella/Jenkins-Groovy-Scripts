import jenkins.model.*

instance = jenkins.model.Jenkins.instance;

for(item in Jenkins.instance.items)
{ 
	if(item.getBuildClass().getCanonicalName().equals("hudson.maven.MavenModuleSetBuild"))
	{
          if(!item.usesPrivateRepository())
          {
            println(item.getName());
            println("Uses a private repository ->"+ item.usesPrivateRepository());
            println(item.setUsePrivateRepository(true));
          }
	}
 
}
