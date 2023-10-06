# Users, Administrators and Groups

## Users and Groups

### Users, Administrators, and Groups

- 2 Different Types of Users
  - Standard Users
  - Administrators
- Standard User: One who is given access to a machine but has restricted access to do thinks like install software or change certain settings
- Administrator (admin): A user that has complete control over a machine
- You can have multiple admins on one computer

### Windows: View User and Group Information

- `Computer Management` Tool:
  - `Task Scheduler` Lets you run programs and tasks to run at certain times
  - `event viewer` where the system stores it's system logs
  - `shared folders` shows what folders are shared amongst users on the computer
  - `Local Users and Groups` used for user and group management
  - `Performance` shows monitoring for resources of the machine like CPU and RAM
  - `Device Manager` manage network cards, sound cards, and other devices
  - `Disk Management`
  - `Services and Applications` choose to enable or disable services such as DNS
- Windows domain: A network of computers, user, files, etc that are dded to a cental database
- In local users and groups there are some default accounts, the admin account is disabled by default.
- When clicking an account 'General' Member of' and 'Profile' tabs are present
- User Account Control (UAC) a feature in Windows that prevents unauthorized changes to a system

### Windows: view User and Group Information using CLI

- `Get-LocalUser` on the CLI to view what users are on a local machine
- [Get-LocalUser example](<ScreenShots/Screenshot 2023-06-14 at 5.33.38 PM.png>)
- `Get-LocalGroup` to view local groups on the machine
- `Get-LocalGroupMember <group name>` will return the users in a particular group

### Linux: Users, Superuser and Beyond

- Root User: First user that gets automatically created when we install a linux OS, this is the account for all admin privileges
- Some files may only be accessed by root and would need to be used to view or modify files
- `sudo <Command>` to run a command as a super user
- `sudo su -` will change the user type to sudo so that any other commands used will not need the sudo prefixed next to the command, this is not recommended to keep on `exit` to get out of the sudo user
- Root user has all privileges to a computer, there is only one but people can have access to this account
- `cat/etc/group` - this will give you a list of groups, passwords are hashed not encrypted in the view of this file
- in this file group Id's are used instead of group names
- `cat/etc/password` file will give password information but not the actual password

### Windows Passwords

- `computer management ` go to the user themselves, select user must change password on initial login.
- `net` does many things can use `/?` to get help on command
- `net user someUser 'some_password'` to set password to some_password
- `net user victor /loginpassweordch` will force the victor user to change his password at next login

https://learn.microsoft.com/en-us/previous-versions/tn-archive/cc875839(v=technet.10)?redirectedfrom=MSDN

### Linux: Passwords

- When you set a password it's securely scrambled, the stored in a special privileged file called /etc/shadow
- `sudo passwd -e victor` this will force the user to have to change the password the next time they log in

### Windows: Adding and Removing Users

- `Computer Management ` go to Local users and groups-> Users and right click on users to add a user. Once there you can add username and password but make sure that you select to require user to change password on initial sighing
- `net user andrea * /add` this will create a new user
- `Get-LocalUser` this will give you a listing of all local users on the local machine
- `net user andrea pa5sWOrd /logonpasswordchg:yes` if you run this command the admin will not be able to know the current password for this user the second command (here) the admin will not know the password set. This will allow you to set an initial password for the user to enter then change
- `net user andrea/del` this will delete the account for the user andrea

### Linux: Adding and Removing Users

- `sudo useradd juan` to add user `sudo userdel juan`to remove user

### Mobile Users and Accounts

- there is no main account only a primary account
