This folder is the root folder of the project

> Note:
  <br>
  1. Content in `config` and  `res` should be put into directory `WEB-INF`
  2. To change stylesheet, modify less styles and compile `less-style/index.less`, 
     then put the result to directory `style`.
  3. Initial data are embedded in source code, you can re-implement 
     `cn.edu.xjtu.se.jackq.libmgmt.listener.ApplicationServiceInitializer` to set 
     your own initial data.
  4. Database connection configurations are set in `/res/persistence-mysql.properties`

> By Thinker & Performer