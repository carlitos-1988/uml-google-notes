# Operating Systems and You

## Permissions

### Windows: File Permissions

- In Windows, files and directory permissions are assigned using Access Control Lists or ACLs. Specially, where gonna work with Discretionary Access Control Lists or DACLs
- Windows files and folders can also have System Access Control Lists or SACLs assigned to them
- SACLs example of getting told to create a file with an event log of when someone accesses a file or folder
- After selecting additional properties for whatever file and then looking at the security tab the Group or usernames section will tell you who has access to the file
- `Read` Lets you see that a file exist, and allows you to read it's comments, It also lets you read the files and directories in a directory.
- `Read & Execute` Lets you read files, and if the file is an executable you can run the file
- `List folder contents` An alias for Read & Execute on a directory
- `Write` lets you make changes to a file
- `Modify` The Modify permission is an umbrella permission that includes read, execute, and write
- `Full Control` A user or group with full control can do anything they want to the file

- Supplemental reading <https://learn.microsoft.com/en-us/windows/win32/secauthz/access-control-lists?redirectedfrom=MSDN> (This one is important have ran into in in the past)

### Linux: File Permissions

- `Read` Allows someone to read the content of a file or folder
- `Write` Allows someone to write information to a file or folder
- `Execute` Allows someone to execute a program
- `-rwxrw-r--` example after running `ls -l ~/my_file` in this output the `-` means that it is a file a `-d` would mean that it is a directory
- in the above the first 3 set of numbers relates to the permissions of the owner i.e. `rwx`
- the `rw-` relates to the permissions for the group the file belongs to
- the `r--` relates to the permissions of all other users
- `r` means writable `w` means writeable `x` means executable if `-` means disabled

### Windows: Modifying Permissions

- go to any file or directory and select permissions from here you can edit permissions to the set file
- if using PowerShell: `icacls 'C:\Vacation Pictures\' /grant 'Everyone:(OI)(CI)(R)`
- if using CLI: `"C:\Vacation Pictures" /grant Everyone(OI)(CI)(R)`

### Linux: Modifying Permissions

- to begin you first need to know the user that will have to be changed

  - The owner, which is denoted by a `u`
  - the group the file belongs to, which is denoted by a `g`
  - Other users, which is denoted by an `o`

- `chmod` `u+x` my-cool-file this will add executable privileges to the my-cool file
- `chmod u-x my-cool-file` this will remove executable files to `u`
- `chmod u+rx my-cool-file` to add privileges both read and write

The numerical equivalent of rwx is:

- 4 for read or r
- 2 for write or w
- 1 for execute of x

- to set permissions do the following 
- `chmod 754 my_cool_file` this will allow you to change permissions 754 for user,group,other each of them using addition from the top. 


### Windows: Special Permissions 

- Simple Permissions Sets of special, or specific permissions 
- If you click on advance permissions you will be able to see specific special permissions, This is to be used when the simple pattern does not fit a use case. 
- `creator owner` special user group for individual files 


### Supplemental Reading for Special Permissions in Windows

- <https://learn.microsoft.com/en-us/previous-versions/windows/it-pro/windows-server-2008-R2-and-2008/cc732880(v=ws.11)?redirectedfrom=MSDN>

### Linux: SetUID, SetGID, Sticky Bit 

- `passwd` to change local logged in password, and follow prompts  
- to setUID to a files access list you can `sudo chmod u+s my_cool_file`
- setGID for user permissions `sudo chmod g+s my_cool_file` 
- Sticky Bit is done with `sudo chmod t+rwx-rx-rx` this will allow you to write to a location and update but not delete from the folder or file only the root or the owner can do this 