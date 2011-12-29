import hudson.FilePath;

for (slave in hudson.model.Hudson.instance.slaves)
{ 
  println('Name: ' + slave.name); 
  println('getRemoteFS: ' + slave.getRemoteFS()); 
  println('getRootPath: ' + slave.getRootPath()); 
  FilePath fp = slave.createPath(slave.getRootPath().toString() + File.separator + "workspace"); 
  fp.deleteRecursive(); 
}