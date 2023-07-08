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
- 
