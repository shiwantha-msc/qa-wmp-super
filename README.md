# qa-wmp-super

#3 Pre requirements in local machine
	1. Install and configure Java JDK 8 or above
	2. Install and configure maven and set local repo
	3. Install InteliJ Idea (or simmialr tool)

## How to setup framework in you local machine
	- git clone https://github.com/shiwantha-msc/qa-wmp-super.git
	- got bin directory
	- run batch file 'Create_Idea_Projects' and choose option 1
	- run batch file 'Build_Projects' and choose option 1
	
QA team able to setup project specific test project and continue testing accordingly. all test project related reference module dependancies will fetch though local maven repository

## Framewrok Setup Remote (Artifact Manager)

QA team no need to setup framewrok code base in local and while build test project necessary dependancies on the fly though remote repository (nexus repo)

