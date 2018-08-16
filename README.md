# Manpower-Acquisition-Planning-System

This project is designed and developed for any educational universities or colleges for making recruitment process. The system is designed by keeping in mind
both parties like colleges/universities and MNC companies. This system allows placement officers(Applicants) to register his/her details along with colleges/universities
details & to post the student's resumes based on the opportunities in the companies. And also job providers can post their requirements in the system. This makes the recruitment
system fast and easy as the existing system is a manual one. In this project there are different modules for each type of the user i.e. Company, University or any single user. The
company can enter their requirements and technologies they prefer. Similarly University can also specify the number of students which are eligible for the post by giving the 
information so that Company can easily checkout their resumes. I Have used separate jsp pages for each of the entries like for registration and login of each entities . And with each 
jsp page I have linked form bean class and java action class . I have also maintained session for each type of user which may provide security so that invalid user can't access the 
account . As I have made my project on struts, I have used tiles so that I can update the menus of the pages, by the help of tiles. As I have made one layout or different parts
of page like header, footer top menu and body. So, I can update the layout of different pages. There is a jdbc connectivity with MySql for maintaining the databases. There is a 
separate module for showing the result of recruitment process and Interviews which make it easier for the company and University to schedule their time. Thus, as a whole it will
renovate the lengthier present system with much effective and efficient mechanism of recruitment process.


### Basic Flow 
jsp ->  

      struts.config -> 
      
	            formBean -> 
                    
					         formBeanAction -> 
                        
								         tiles 

### Flow 
jsp page having definition of path name for its action. 
In the struts.config file we have the definition of all its bean classes and action classes. The action classes have the path from the jsp defined and with the success and failure there is a individual jsp attached with it. There is also a mapping of action class with the bean class in this file. 

### FormBeans
All the bean class extended the ActionForm classes from struts and then I have made different methods in this file for retrieving different information from the form package of struts framework which is used in the action class of corresponding bean class.   

### Action Classes
Each action class has inherited the action package from the struts framework. Here we have execute() method of actionForward which is basically used here to do the mapping work defined in stuts.config file so that we can do the dispatchAction for their different request and response.
Then there is database connection in the action classes to update the information in the databases. For this, I have used MySql JDBC driver. 

### Database Connectivity
(DriverManager.getConnection) for getting connection
(createStatement) for sql statement
(executeQuery()) for executing the sql query

### Tiles
In the tiles firstly, there is a definition of the all the menus including header, footer, topmenu, body. After that all the subsequent pages inherit that tiles form and do the changes in their menus like for a new jsp page we just change the body menu and rest all the menus header, footer remains same. In this way we don't have to explicitly define menu for each of the pages.  
