# Labs 

## Windows: Creating, Modifying, and Removing File and Folder Permissions in Windows

Introduction
In this lab, you'll learn the foundations of how managing user permissions works on a Windows machine. Using the new Powershell commands you learned, you'll fix up the permissions of some files and folders.

Head's up: You'll experience a delay as the labs initially load (particularly for Windows labs). So, please wait a couple of minutes for the labs to load. The grade is calculated when the lab is complete, so be sure to hit "End Lab" when you're done!

You'll have 60 minutes to complete this lab.

What you'll do

In this lab, you'll create and change folder permissions using the Windows Command Line Interface (CLI), known as Powershell. In this exercise, you'll:

access administrative privileges to use Powershell in Windows.
view file and folder permissions using the GUI and Powershell commands.
modify the permissions for both files and directories by granting and removing specific permissions using ICACLS in Powershell.
modify the permissions for groups using the GUI and Powershell.
Start the lab
You'll need to start the lab before you can access the materials. To do this, click the green "Start Lab" button at the top of the screen. If you use a screen reader, please see the instructions below, in the section "Virtual Machine instructions for screen reader users". Otherwise, proceed to the next steps to open the Windows VM.

Green "Start Lab" button

After you click the "Start Lab" button, you will see a panel appear below where the start lab button was that has an Open Windows VM button.

Screenshot of "Open Windows VM" button, which appears underneath the "Start Lab" button in the lab UI.

Click the Open Windows VM button and a new tab will open with a visual interface for Windows OS, where you will be performing further steps in the lab. You should have a visual interface for Windows that looks like this:

Screenshot of Windows VM desktop.


Virtual Machine instructions for screen reader users
keyboard_arrow_down
If you require the use of a screen reader to complete a lab activity, you can spin up a Windows Virtual Machine that is pre-loaded with NVDA. Follow the instructions below to access your Virtual Machine.

Connection Details

After you click the "Start Lab" button, you will see all the connection details generated below. Note that generating the connection details may take a few minutes. Use these connection details and follow the instructions in the "Accessing the virtual machine" section based on your operating system.

External IP Address: 34.28.20.68

Username: qwiklabs

Password: qwiklabs-bb-8b21610d-7082-49d2-ad0c-a4f59a83d415

Note: Working with Qwiklabs may be similar to the work you'd perform as an IT Support Specialist; you'll be interfacing with a cutting-edge technology that requires multiple steps to access, and perhaps healthy doses of patience and persistence(!). You'll also be using RDP to enter the labs -- a critical skill in IT Support that you’ll be able to practice through the labs.
Accessing the virtual machine
Please find one of the four relevant options below based on your device's operating system.

Option 1: Windows Users: Connecting to your VM via RDP
In this section, you will use Remote Desktop Connection to connect to your windows instance using its external IP address.

Open Remote Desktop Connection by selecting the Start button. In the search box, type Remote Desktop Connection, and then, in the list of results, click Remote Desktop Connection.
Enter the external IP address of the instance you want to connect to in the Computer field. Find the external IP address for your instance from the Connection Details included in the section above, titled “Virtual Machine instructions for screen reader users”. Select connect.
Change the username to qwiklabs. And use the password mentioned in the Connection Details. Select OK.
Select Yes to accept the certificate.
You should now have access to a virtual machine running Windows 10 OS!

If you encounter an error message, close the window and wait a minute or so. Sometimes the VM-creation process takes a few minutes, and you won't be able to access the VM until it's finished. This also applies to any errors that say your credentials (username and password) are incorrect.

Option 2: OS X users: Connecting to your VM via RDP
In this section, you will use Microsoft Remote Desktop 10 to connect to your windows instance using its external IP address. OSX users can download Microsoft Remote Desktop from the Mac App Store. If you are using Microsoft Remote Desktop 8, note that the interface will vary slightly than what’s listed below.

Open Microsoft Remote Desktop 10 application.
Select the + sign above, followed by Add PC.
Enter the external IP address of the instance you want to connect to in the PC name field. Find the external IP address for your instance from the Connection Details section in the instructions section above. Select the Add button.
You should now be able to access your desktop represented by the external IP address of your VM instance under PCs. Select your VM's external IP address.
The application will now prompt you for username to qwiklabs. And use the password mentioned in the Connection Details section of the instructions. Once you have entered the details select Continue.
For any prompt regarding ‘Certificate verification’, select continue.
You should now have access to a virtual machine running Windows 10 OS!

If you encounter an error message, close the window and wait a minute or so. Sometimes the VM-creation process takes a few minutes, and you won't be able to access the VM until it's finished. This also applies to any errors that say your credentials (username and password) are incorrect.

Option 3: Chrome OS users: Connecting to your VM via RDP
In this section, you will use Chrome RDP to connect to your windows instance using its external IP address.

Chrome OS users can download Chrome RDP from Chrome Web Store. Once you navigate to the download page, select the Add to Chrome button. Select Add app in case of any pop-ups. Then, select Launch app to start the application.

Open the Chrome RDP application.
Enter the external IP address of the instance you want to connect to in the Enter the computer name or address to connect to field. Find the external IP address for your instance from the Connection Details in the instructions above. Select connect.
Leave the domain field blank. Change the username to qwiklabs. And use the password mentioned in the Connection Details. Select OK.
Select Continue for any window related to certificate verification.
You should now have access to a virtual machine running Windows 10 OS!

If you encounter an error message, close RDP and wait a minute or so. Sometimes the VM-creation process takes a few minutes, and you won't be able to access the VM until it's finished. This also applies to any errors that say your credentials (username and password) are incorrect.

Option 4: Linux users: Connecting to your VM via RDP
In this section, you will use Remmina to connect to your windows instance using its external IP address. Open Remmina in your Linux machine. Linux users can install Remmina if it is not pre-installed.

Open Remmina.
Enter the external IP address of the instance you want to connect to. Find the external IP address for your instance from the Connection Details section. Select Connect. Make sure the connection protocol is set to RDP.
A window appears asking you accept the certificate, select Ok to continue.
Leave the domain field blank. Change the username to qwiklabs. And use the password mentioned in the Connection Details section for the Password field. Select Ok to continue.
You should now have access to a virtual machine running Windows 10 OS!

If you encounter an error message, close the window and wait a minute or so. Sometimes the VM-creation process takes a few minutes, and you won't be able to access the VM until it's finished. This also applies to any errors that say your credentials (username and password) are incorrect.

Using the Windows instance
Now you have access to the Windows instance, you're ready to start using it!

Once your virtual machine has launched, you can turn on the NVDA screen reader using the shortcut Control + Alt + N, after which, NVDA should begin reading immediately. If you have successfully set up NVDA and can hear the sound output on your personal machine, please return to the lab instructions to complete the lab.

Permissions Using Windows Powershell

Powershell is used through the rest of the lab, and you'll need administrative privileges. Open it now by searching for "Powershell" in the start menu, then right-clicking it and selecting "Run as Administrator".

Note: Run the Powershell by selecting Run as Administrator to avoid any unexpected results.
Example 1
In "C:\Users\Qwiklab\Documents\" you have a file named "important_document." Your goal in this example is to change the permissions so that the user "Kara" only has read access to the file.

First, use ICACLS to view the existing permissions for the file using this command:

ICACLS C:\Users\Qwiklab\Documents\important_document
Copied!
C:\Users\Qwiklab\Documents\important_document QWIKLABS-BB-5A8\Kara:(R,W)
                                              NT AUTHORITY\SYSTEM:(I)(F)
                                              BUILTIN\Administrators:(I)(F)
                                              BUILTIN\Users:(I)(RX)
                                              Everyone:(I)(RX)
Successfully processed 1 files; Failed processing 0 files
As you can see, Kara currently has read and write permissions (shown as "R" and "W"). We need her to only have read permissions, so we need to remove her write permission. An easy way to accomplish this is to remove all of Kara's permissions and then re-add her read permission. You can remove her entirely from the file's permissions and check to see that it worked with these commands:

ICACLS C:\Users\Qwiklab\Documents\important_document /remove "Kara"
Copied!
processed file: C:\Users\Qwiklab\Documents\important_document
Successfully processed 1 files; Failed processing 0 files
ICACLS C:\Users\Qwiklab\Documents\important_document
Copied!
C:\Users\Qwiklab\Documents\important_document NT AUTHORITY\SYSTEM:(I)(F)
                                              BUILTIN\Administrators:(I)(F)
                                              BUILTIN\Users:(I)(RX)
                                              Everyone:(I)(RX)
Successfully processed 1 files; Failed processing 0 files
As you can see, Kara is no longer listed in the file's permissions. To re-grant her only the read permission, use this command:

ICACLS C:\Users\Qwiklab\Documents\important_document /grant "Kara:(r)"
Copied!
processed file: C:\Users\Qwiklab\Documents\important_document
Successfully processed 1 files; Failed processing 0 files
Now the file's permissions should be set correctly, with Kara only having read permissions. You can double check this with the earlier command:

ICACLS C:\Users\Qwiklab\Documents\important_document
Copied!
C:\Users\Qwiklab\Documents\important_document QWIKLABS-BB-066\Kara:(R)
                                              NT AUTHORITY\SYSTEM:(I)(F)
                                              BUILTIN\Administrators:(I)(F)
                                              BUILTIN\Users:(I)(RX)
                                              Everyone:(I)(RX)
Successfully processed 1 files; Failed processing 0 files
Click Check my progress to verify the objective.

Example 1
Example 2
There's a folder called "Secret" in "C:\Users\Qwiklab\" where the user "Kara" has read access. Your goal in this example is to alter these permissions so that another user (named "Phoebe") has read permissions as well, and Kara has both read and write permissions. You can view the current permissions with this command, and see that Kara has read permissions and Phoebe is not included.

ICACLS C:\Users\Qwiklab\Secret\
Copied!
C:\Users\Qwiklab\Secret\ QWIKLABS-BB-066\Kara:(R)
                         NT AUTHORITY\SYSTEM:(I)(OI)(CI)(F)
                         BUILTIN\Administrators:(I)(OI)(CI)(F)
                         BUILTIN\Users:(I)(RX)
                         BUILTIN\Users:(I)(OI)(CI)(IO)(GR,GE)
                         Everyone:(I)(RX)
                         Everyone:(I)(OI)(CI)(IO)(GR,GE)
Successfully processed 1 files; Failed processing 0 files
First, give Phoebe read access. You can grant her these permissions with the command below, like before. Then, use the previous command again to verify that the change has been made:

ICACLS C:\Users\Qwiklab\Secret\ /grant "Phoebe:(r)"
Copied!
processed file: C:\Users\Qwiklab\Secret\
Successfully processed 1 files; Failed processing 0 files
ICACLS C:\Users\Qwiklab\Secret\
Copied!
C:\Users\Qwiklab\Secret\ QWIKLABS-BB-066\Phoebe:(R)
                         QWIKLABS-BB-066\Kara:(R)
                         NT AUTHORITY\SYSTEM:(I)(OI)(CI)(F)
                         BUILTIN\Administrators:(I)(OI)(CI)(F)
                         BUILTIN\Users:(I)(RX)
                         BUILTIN\Users:(I)(OI)(CI)(IO)(GR,GE)
                         Everyone:(I)(RX)
                         Everyone:(I)(OI)(CI)(IO)(GR,GE)
Successfully processed 1 files; Failed processing 0 files
The next step is to grant Kara write permissions. You don't need to remove her existing permissions first, like you did before; you only need to add "write" to her existing permissions with this command:

ICACLS C:\Users\Qwiklab\Secret\ /grant "Kara:(w)"
Copied!
processed file: C:\Users\Qwiklab\Secret\
Successfully processed 1 files; Failed processing 0 files
Now the file should have the required permissions. View them to verify this with the following command:

ICACLS C:\Users\Qwiklab\Secret\
Copied!
C:\Users\Qwiklab\Secret\ QWIKLABS-BB-066\Phoebe:(R)
                         QWIKLABS-BB-066\Kara:(R,W)
                         NT AUTHORITY\SYSTEM:(I)(OI)(CI)(F)
                         BUILTIN\Administrators:(I)(OI)(CI)(F)
                         BUILTIN\Users:(I)(RX)
                         BUILTIN\Users:(I)(OI)(CI)(IO)(GR,GE)
                         Everyone:(I)(RX)
                         Everyone:(I)(OI)(CI)(IO)(GR,GE)
Successfully processed 1 files; Failed processing 0 files
Click Check my progress to verify the objective.

Example 2
Example 3
There's another folder in "C:\Users\Qwiklab\" called "Music". The user group, named "Everyone", has both read and write permissions for this folder. User groups are sets of local users that allow you to change multiple users' permissions at once. For example, a computer that's used by lots of employees at a business may have a usergroup called "Employees" that new hires are added to when they onboard. This automatically gives them access to everything they need, without it having to be set manually. The "Everyone" group is created by default, and every new user is automatically added.

Your goal for this example is to change the permissions for this folder so that the "Everyone" group only has read permission (not write).

As usual, view the current permissions with this command:

ICACLS C:\Users\Qwiklab\Music\
Copied!
C:\Users\Qwiklab\Music\ Everyone:(R,W)
                        NT AUTHORITY\SYSTEM:(I)(OI)(CI)(F)
                        BUILTIN\Administrators:(I)(OI)(CI)(F)
                        BUILTIN\Users:(I)(RX)
                        BUILTIN\Users:(I)(OI)(CI)(IO)(GR,GE)
                        Everyone:(I)(RX)
                        Everyone:(I)(OI)(CI)(IO)(GR,GE)
Successfully processed 1 files; Failed processing 0 files
You can change permissions for groups in exactly the same way as you do for users. To remove the group's current permissions, and then re-grant them a read permission, use these commands:

ICACLS C:\Users\Qwiklab\Music\ /remove "Everyone"
Copied!
processed file: C:\Users\Qwiklab\Music\
Successfully processed 1 files; Failed processing 0 files
ICACLS C:\Users\Qwiklab\Music\ /grant "Everyone:(r)"
Copied!
processed file: C:\Users\Qwiklab\Music\
Successfully processed 1 files; Failed processing 0 files
The "Everyone" group should now have only read permissions, which you can check using the same command as before:

ICACLS C:\Users\Qwiklab\Music\
Copied!
C:\Users\Qwiklab\Music\ Everyone:(R)
                        NT AUTHORITY\SYSTEM:(I)(OI)(CI)(F)
                        BUILTIN\Administrators:(I)(OI)(CI)(F)
                        BUILTIN\Users:(I)(RX)
                        BUILTIN\Users:(I)(OI)(CI)(IO)(GR,GE)
                        Everyone:(I)(RX)
                        Everyone:(I)(OI)(CI)(IO)(GR,GE)
Successfully processed 1 files; Failed processing 0 files
Click Check my progress to verify the objective.

Example 3
Example 4
Back in the "documents" folder from before, there's a file called "not_so_important_document". In this example, you need to modify the permissions for that file so that the group called "Authenticated Users" has "Write" access. The "Authenticated Users" group contains users who have authenticated to the domain or a domain that is trusted by the computer. View the current permissions with this command, to see what the starting point for this file is:

ICACLS C:\Users\Qwiklab\Documents\not_so_important_document
Copied!
C:\Users\Qwiklab\Documents\not_so_important_document 
NT AUTHORITY\SYSTEM:(I)(F)
BUILTIN\Administrators:(I)(F)
BUILTIN\Users:(I)(RX)
Everyone:(I)(RX)
Successfully processed 1 files; Failed processing 0 files
This will show you that the "Authenticated Users" group is currently not listed. This means that the only step required is to grant them write access, which you can do with this command:

ICACLS C:\Users\Qwiklab\Documents\not_so_important_document /grant "Authenticated Users:(w)"
Copied!
processed file: C:\Users\Qwiklab\Documents\not_so_important_document
Successfully processed 1 files; Failed processing 0 files
That should successfully grant them write permissions. You can use the same command as earlier to verify that the commands were a success:

ICACLS C:\Users\Qwiklab\Documents\not_so_important_document
Copied!
C:\Users\Qwiklab\Documents\not_so_important_document 
NT AUTHORITY\Authenticated Users:(W)
NT AUTHORITY\SYSTEM:(I)(F)
BUILTIN\Administrators:(I)(F)
BUILTIN\Users:(I)(RX)
Everyone:(I)(RX)
Successfully processed 1 files; Failed processing 0 files
Click Check my progress to verify the objective.

Example 4
Example 5
In this final example, you'll change the permissions of another file in the "Documents" folder. The file named "public_document" needs to be made publically readable, so that anyone on the system is able to read it. As usual, view the file's commands first:

ICACLS C:\Users\Qwiklab\Documents\public_document
Copied!
C:\Users\Qwiklab\Documents\public_document NT AUTHORITY\SYSTEM:(I)(F)
                                           BUILTIN\Administrators:(I)(F)
                                           BUILTIN\Users:(I)(RX)
                                           Everyone:(I)(RX)
Successfully processed 1 files; Failed processing 0 files
The easiest way to make sure that all users on the system have read permissions is to add those permissions to the "Everyone" group. You could also add each user manually, but by giving the group the permissions instead, you save time; it removes the need to go back and edit permissions again if a new user is created in the future. Grant every user on the system the ability to read the file using this command:

ICACLS C:\Users\Qwiklab\Documents\public_document /grant "Everyone:(r)"
Copied!
processed file: C:\Users\Qwiklab\Documents\public_document
Successfully processed 1 files; Failed processing 0 files
Finally, view the permissions again to make sure it worked:

ICACLS C:\Users\Qwiklab\Documents\public_document
Copied!
C:\Users\Qwiklab\Documents\public_document Everyone:(R)
                                           NT AUTHORITY\SYSTEM:(I)(F)
                                           BUILTIN\Administrators:(I)(F)
                                           BUILTIN\Users:(I)(RX)
                                           Everyone:(I)(RX)
Successfully processed 1 files; Failed processing 0 files
Click Check my progress to verify the objective.

Example 5
Conclusion
Wohoo! You've successfully used Powershell to modify the permissions for both files and directories. You modified the permissions by granting and removing specific permissions using ICACLS. You've also become familiar with groups of users, and how to modify permissions for them as well. Really well done.


##Linux 

Introduction
In this lab, you'll learn the foundations of how managing user permissions work on a Linux machine. Using the new commands you learned in Bash, you'll fix up the permissions of some files and folders.

Head's up: You'll experience a delay as the labs initially load (particularly for Windows labs). So, please wait a couple of minutes for the labs to load. The grade is calculated when the lab is complete, so be sure to hit "End Lab" when you're done!

You'll have 60 minutes to complete this lab.

What you'll do
Familiarize yourself with the process of changing permissions within a file and folder in Linux
Change the ownership of a specific file and folder
Start the lab
You'll need to start the lab before you can access the materials. To do this, click the green “Start Lab” button at the top of the screen.

Green "Start Lab" button

After you click the “Start Lab” button, you will see a shell, where you will be performing further steps in the lab. You should have a shell that looks like this:

Screenshot of shell terminal CLI. CLI reads "student@864a6934570a: -$"

Checking permissions
Before you can even begin changing the permission of a file or folder, you need to first check the permissions of the specific file/folder. To display ownership and permissions for a file, you can use ls with the -l flag and the name of the file you're interested in with the command ls -l [FILENAME]

There's a file named "important_document" on your machine in the "/home/qwiklab/documents" directory. You can change to this directory from your current one using this command:

cd ../qwiklab/documents
Copied!
Check out its current permissions with this command, and take a look at the output below:

ls -l important_document
Copied!
-rw------- 1 student student 16 Aug  4 11:38 important_document
You can see that it's owned by the "root" user, and that the owner has read and write (but not execute) permissions while everyone else has none at all.

Changing file permissions
Now, change the permissions of "important_document" (from the previous step) so that the owner has execute permissions on top of their current permissions. To do this, you'll use the chmod command, with the argument 700. The two zeros keep everyone, but the owner, from having any permissions at all, and the seven grants all available permissions to the owner (including execute). Keep in mind that because the file is owned by "root" you'll need to use sudo:

sudo chmod 700 important_document
Copied!
You can check the permissions from the below command. You'll now see that the execution permission has been added:

ls -l important_document
Copied!
-rwx------ 1 student student 16 Aug  4 11:38 important_document
Click Check my progress to verify the objective.
Modify permissions on important_document

Changing folder permissions
Now you'll do a similar process, this time on a directory. First, move up one directory:

cd ..
Copied!
In this directory there's a folder called "secret_folder". View its current permissions using ls, this time with the -ld flag rather than -l because you're viewing a directory instead of a normal file:

ls -ld secret_folder/
Copied!
drw-r--r-- 2 root root 4096 Aug  4 11:38 secret_folder/
As you can see, the owner of the file (the root user) has read and write permissions, and everyone else can read only.

The goals for the lab, related to this file, are below:

The owner should have all permissions.
The group should have only write permission.
People other than the owner and the group should have no permissions.
Head's up: When using chmod on a directory, files within that directory are not affected. While this isn't relevant to this specific lab, it's important to remember.

Previously, we used a numerical argument to set the permissions for a file. If you want to avoid figuring out the number that matches the permission levels, you can use an alternate syntax. To satisfy the first condition, you only need to add the execute permission to the owner, since they already have read and write permissions. To add execute to the owner's permission, you can use the command below. (Note that "u" stands for "user" and "x" stands for "execute".)

sudo chmod u+x secret_folder/
Copied!
You can check the permissions again to see that the owner can now read, write, and execute:

ls -ld secret_folder/
Copied!
drwxr--r-- 2 root root 4096 Aug  4 11:38 secret_folder/
Now you can fix the group's permission. They currently have read permission and don't have write permission, which you can fix with two similar commands. These can be done in either order; "g" stands for "group" (like "u" from before), and "w" and "r" stand for "write" and "read" respectively:

sudo chmod g+w secret_folder/
Copied!
sudo chmod g-r secret_folder/
Copied!
You can check the permissions again to see that the group now has only write permissions, and the owner has the same permissions as before:

ls -ld secret_folder/
Copied!
drwx-w-r-- 2 root root 4096 Aug  4 11:38 secret_folder/
Finally, you can remove read permissions from everyone else using the command below ("o" stands for "other"):

sudo chmod o-r secret_folder/
Copied!
You can see that all the criteria for this file are now met using ls again:

ls -ld secret_folder/
Copied!
drwx-w---- 2 root root 4096 Aug  4 11:38 secret_folder/
Using chmod this way is easier to remember, but takes lots more commands. All the previous steps could also have been done using the numerical notation, like this:

sudo chmod 720 secret_folder/
Copied!
Click Check my progress to verify the objective.
Modify permissions on secret_folder

Changing owners
Now you'll change the owner of a file. In your current directory, there's a folder called "taco". Use ls to examine its permissions and see who the owner of the file is:

ls -ld taco/
Copied!
drwxr-xr-x 2 root root 4096 Aug  4 11:38 taco/
You can see from this that the root user currently owns this file. There's another user account on the machine called "cook". Go ahead and make "cook" the owner of the file, using the chown command like this:

sudo chown cook /home/qwiklab/taco
Copied!
Now you can use ls again to see that the owner of the file has been successfully changed:

ls -ld taco/
Copied!
drwxr-xr-x 2 cook root 4096 Aug  4 11:38 taco/
Click Check my progress to verify the objective.
Change owner of Taco

More practices
There are a few more files present on your machine that you can practice on. First, move into the "documents" folder:

cd documents/
Copied!
There's a file in this folder called "not_so_important_document". View its permissions to see its current state:

ls -l not_so_important_document
Copied!
-rw-r----- 1 student student 20 Aug  4 11:38 not_so_important_document
The owner can read and write, the group can read, and everybody else has no permissions at all. Now, use chmod to change the permissions so that these criteria are met:

The owner has all permissions.
The group has read and write permissions.
Everyone has read permissions.
To give the owner execution permissions, you can use the same command from earlier:

sudo chmod u+x not_so_important_document
Copied!
Remember to use ls to double-check that everything you do behaves how you expect:

ls -l not_so_important_document
Copied!
-rwxr----- 1 student student 20 Aug  4 11:38 not_so_important_document
The group already has read permissions, so all you need to do is add write permissions:

sudo chmod g+w not_so_important_document
Copied!
ls -l not_so_important_document
Copied!
-rwxrw---- 1 student student 20 Aug  4 11:38 not_so_important_document
Finally, you need to give everyone else read permissions. You can use the "o+r" argument to add read permissions to people other than the owner or group, but you can also use "a+r". This adds read permission to everyone (owner, group, and other). Because the owner and the group already have read permissions, this will only change the permissions for everyone else, but the end result is the same:

sudo chmod a+r not_so_important_document
Copied!
You should be able to view the permissions again and see that all criteria for this file have been met:

ls -l not_so_important_document
Copied!
-rwxrw-r-- 1 student student 20 Aug  4 11:38 not_so_important_document
Again, you can accomplish the same result using a numerical argument to set the permissions, rather than incrementally changing them. Here's the command that meets all three criteria at once:

sudo chmod 764 not_so_important_document
Copied!
Click Check my progress to verify the objective.
Change permissions of not_so_important_document

Adding multiple permissions at once
Finally, you'll learn how to use the non-numeric argument to add multiple permissions at once. There's one more file in the current directory, named "public_document". First, view its current permissions:

ls -l public_document
Copied!
-rw-r--r-- 1 student student 14 Aug  4 11:38 public_document
For this file, you want everyone (owner, group, and anyone else) to have all permissions. You can add read, write, and execute permissions to everyone at once using this command:

sudo chmod a+rwx public_document
Copied!
This should make the file as open as possible, where every user has every permission:

ls -l public_document
Copied!
-rwxrwxrwx 1 student student 14 Aug  4 11:38 public_document
Using the numeric argument form of chmod, this same result could be accomplished with this command:

sudo chmod 777 public_document
Copied!
Click Check my progress to verify the objective.
Change owner of public_document

Conclusion
Congrats! You've successfully used chmod on both directories and normal files, in multiple formats. You can directly set a file's permissions numerically, or add and remove specific permissions one at a time. You've also successfully used chown to change the owner of a file. Really great work!