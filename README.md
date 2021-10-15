# WallyLandApp


Steps to start:

1. Go to group repository 
2. Click fork in the top right and fork into your account 
3. Create folder on your local device
4. cd into that folder via terminal 
5. Click green code button in your repository, and copy url (from ssh tab)
6. In your terminal after you cd'd into the correct folder do a "git clone add_your_link_here"

Steps to start if already cloned (to get changes from the group branch)
1. Make sure you're cd'd in the correct directory 
2. git remote add upstream git@github.com:IST412Group/WallyLandApp.git
3. git fetch upstream


When you're ready to push changes

1. Save all your work 
2. In the terminal make sure you're in the directory that has the src file listed (you can ls to make sure)
3. "git commit -am "commit message for the changes you made."
4. "git push" 
5. If you have an ssh key, enter it here "1234" for Felix (most of you don't have this)
6. If the above command doesn't work specificy the name of your branch after the push statement, for example "git push origin main"
7. If you get stuck, "git status" might help

When you're ready to merge with the main branch 

1. Go to YOUR repository 
2. Click create pull request 
3. If there are merge conflicts resolve them locally, and then repeate the steps above 
4. If not, keep clicking create pull request, and the merge branch, and all the green buttons until it's done merging.
5. Go to the group repository and verify that your changes were merged. 
