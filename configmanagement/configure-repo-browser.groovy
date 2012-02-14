import jenkins.model.*

instance = jenkins.model.Jenkins.instance;

for(item in instance.items) 
{
	println( item.getScm().getBranch());
	if(item.getScm().getType().contains("mercurial"))
	{
		String installation = item.scm.getInstallation();
		String source = item.scm.getSource();
		String branch = item.scm.getBranch()
		String modules = item.scm.getModules();
		String subdir = item.scm.getSubdir();
		hudson.plugins.mercurial.browser.HgBrowser browser = new hudson.plugins.mercurial.browser.RhodeCode(source);
		boolean clean = item.scm.isClean();
		hudson.plugins.mercurial.MercurialSCM newscm = new hudson.plugins.mercurial.MercurialSCM(installation, source, branch, modules, subdir, browser, clean);
		println( instance.getItem(item.name).setScm(newscm));
          	println( item.getScm().getBrowser());
	}
}
