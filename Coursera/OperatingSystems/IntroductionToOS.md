# Operating Systems and Becoming a Power User

## Introduction to Operating Systems and Becoming a Power User

### Course Intro

- Some conceptual learning but also practical learning

### Lesson Overview and Practice Tips

- The command line interpreter in Linux is called a shell and the language that we'll use to interact with this shell is called Bash
- 2 Themes for this lesson
  - Navigating from one directory to another
  - Getting file information
  - Removing files and directories
- File and Text Manipulation
  - Searching through directories
  - Find a specific file
  - copying and pasting
  - Chaining commands

### List Directories in a GUI

- The command line interpreter in Linux is called a shell and the language that is used to interact with this shell is called Bash
- File systems are used in a hierarchial manner where there is a root to everything and folders and files will continue to build out the tree
- Root Directory: The parent for all other directories in the file system
- The root directory of C: would be written as C:\ and the root directory of X: would be written as X:\
- Subdirectories are separated by backslashes `\`unlike Linux which uses forward slashes `/`
- The main directory on a windows system is the drive that the file system is stored on
- On Windows: to view hidden files on the current directory go to view tab and select hidden files
  - To view information on a file just right click and select properties

### Windows: List Directories in CLI

- Command Prompt: cmd.exe
- PowerShell: powershell.exe
- `ls` - list directory
- The C: drive root folder is what we call a parent directory and the contents inside are considered the child directories
- `get-Help` `command` `-Full` this will get a full description of the command trying to access help for
- `ls -Force` to show hidden files when using ls command
- `get help ls -full` will give you all of the available commands that are available in the command line

### Linux List Directories

- the root directory in linux is shown with a `/` instead of the C: call in windows
- `ls /` to list all of the files inside the root directory
  - In Root Directory there may be the following:
    - `bin`: stores essential binaries for programs, similar to program files directory
    - `etc`: Stores system configuration settings
    - `home`: Personal directory for users i.e. user documents, pictures and alike
    - `proc`: Information for currently running processes
    - `usr`: meant for user installed software
    - `var`: used for system logs or any file that changes on the OS
- Similar to windows commands and parameters a flag is a way to specify additional options for a command
- `ls -- help` flag: used for finding more information on what parameter and how to use a particular command
- `man` `command to look up` : this will give you the manual for the command you want to look at
- `ls -l` gives long list information in a directory
- ![ls -l Command ex](ScreenShots/Screenshot%202023-06-09%20at%202.41.20%20AM.png)
  - The first section is reserved for file permissions
  - The second column is for the number or links the file has
  - The third is for the file owner
  - Fourth is for group the file belongs to
  - Fifth file size
  - Sixth time stamp
  - Eight will be the directory location

### GUI Directories

- Absolute Path: One that starts from the main directory
- Relative Path: The path from your current directory

### Windows: Changing Directories in the CLI

- `pwd` will tell you what directory you are currently in
- `cd <path to location>` will change the directory to the file path you provide
- Tab completion is also available in Windows and will fill in the command

### Linux: Changing Directories in Bash

- `pwd` and `cd` work the same way as they do in Windows
- Tab complete in bash will show options instead of cycling through the options

### Windows: Make Directories

- `mkdir <directory_Name>` to create a new directory
- To use literal spaces in the command input using quotes will allow you to use the spaces

### Linux: Make Directories

- `mkdir <directory Name >` This will make a new directory
- You can use `\` and `" "` to be able to use spaces when using spaces with mkdir

### Windows: Command History

- `history` to see what commands have been used on the machine. These are saved to local memory
- up or down keys will let you use the commands instead of seeing them
- ctr-R will let you search through the history of commands
- `clear` will clear the output on the screen does not delete anything it juts clears the screen

### Linux: Command History

- `history` : to view history
- ctr- R to search the history

### Windows: Copying Files and Directories

- In windows the hotkey for copy is Ctrl-C and the hotkey for paste is Ctrl-V
- In powerShell the copy key is `cp`
- `cp <file.tx> <location to copy to>`
- Wildcard: A charater that's used to help select files based on certain pattern
- `cp <*.jpg> <path to copy to>` This will move over all of the files with .jpg wile extension over to the desired location
- when using location to use `~` followed by the destination name then press `tab` this will auto complete to the location you added manually
- If you `cp` a directory the contents of that directory will not be copied only the name
- In order to copy the contents of the directory you will need to use `-Recurse` as a parameter to `cp`
- `-Verbose` will allow for the command to be able to display messages on the CLI

### Linux: Copying Files and Directories

- `cp my_very_cool_file.txt ~/Desktop` will copy over the file to the desktop
- `cp *.png ~/Desktop` from another directory this will copy over the png files over to the desktop
- Same copy rules apply on bash from powershell
- `-r` is what needs to be added as a flag when trying to use recursive copy
- `cp -r 'Cat Pictures' ~/Desktop` to recursively copy over cat pictures directory and contents to the desktop

### Windows: Moving and Renaming Files, Directories

- `mv` to rename a file
- `mv .\blue_document.txt(old name) yellow_document.txt(new name)` this will change the name of the document
- `mv .\yellow_document.txt (old dir) C:\Users\me\Documents (new dir)` this will move the directory location when given a path as the second argument to the `mv` command
- wild cards can also be used with the mv command

### Linux: Moving and Renaming Files, Directories

- `mv` same command to change name and rename files in linux
- wildcards can also be used with the mv command

### Windows: Removing Files and Directories

- In powershell the command to remove or delete files is `rm` or `remove`
- In powershell there is no use of the recycle bin so once deleted it is gone for good
- `rm ~\text1.txt` this will remove/delete the file permanently
- when using the `rm` command there may be situations where the user is not able to remove some files where permissions are not given to that particular usage
- `-Force` is one way to remove a file that one may not have permissions to
- `-Recurse` will allow you to delete directories without having to get a notification to delete a file confirmation

### Linux: Removing Files and Directories

- `rm` to remove files
- Similar to windows you will get a message if you try to delete something that should not be deleted
- to get over this you will likely have to use the -r flag to ensure that you want to delete that directory

## File and text Manipulation

### Windows: Display File Contents

- To change the default application a file opens to you can go to properties --> Open with --> Change --> Select the application
- `cat` to open and view files in windows \
- `more` will fill the CLI and hold off on showing the rest of the file
- `Enter Key` will advance the file by one line
- `Space Key` Advances the file by one page, page will depend on the size of the terminal window
- `q Key` will allow you to quit out of more and go back to the shell
- `-Head <number of lines >` will allow you to preview the file
- `-Tail <number of lines>` will show you the last lines of the file

### Linux: Display file Contents

- `cat` to view files, similar to windows command
- `less` this is similar to the more command on windows but it has more capabilities
- `up down keys` `g` to move to the beginning of a file
- `G` will take you to the end of a file
- `/word_search` will allow you to search for a word or phrase
- `q` allows you to quit the `less` intepreter
- `head` by default will show the first 10 lines of a file
- `tail` will show you last 10 lines of a file

### Windows: Modifying Text Files

- For this class Notepad++ will be used for editing files
- to run notepad++ use `start notepad++ <name of file>`

### Linux: Modifying Text Files

- Nano text editor on many Linux distributions there are many out there but this one will be covered in the course
- `nano <file name >` tp start nano
- `^` will mean to use control plus whatever key that is needed to perform that action
- Nano is quick use text editor for linux

### Windows Powershell

- `Get-Help` used to see more info about commands
- `Get-Alias` + `Command` will give you additional information on what the command is doing
- `Get-Children` same command
- 3 Different commands that can be ran in PowerShell
  - 1. using the alias
  - 2. `cmd.exe` commands are commands from the old MS DOS Windows, can still be ran dues to backwards compatibility
    - `Get-Help` is used for Powershell commands like `Get-Helo ls`, and `/?` is used for other commands like dir such as `dir /`

### Windows: Searching within Files

- `Ctrl-F` to look for words inside a document

- To search if a word exists in multiple files:
  - open start menu and search 'indexing' --> Click 'Indexing Options' to change settings for the user folder Select the folder then advanced --> select file types tab --> select 'index properties and file contents' --> Click ok, close out of the indexing options
  - Once done the OS will begin to index the file structure just told to index, this will depend on the size of the file system
- You can also use Notepad++ to run searches:
  - From Notepad++ press CTRL+SHIFT+F to open the find in files dialog
  - The dialog will give you a gui that will ask you what to search for
- `sls` will let you look for a string or pattern inside the CLI, this will use regex
  - `Select-String <word> <file>` will tell you if the word was found and the line number the file was found in
  - `Select-String <word> <*.txt>` will search for the word in all .txt files using the asterisks in the file type will allow for this to happen

### Windows: Searching Within Directories

- `Filter` will help you find within a directory
- `ls 'C:\Program Files\' -Recurse -Filter *.exe` this will look for all exe files inside program files recursively
- The `-Filter` parameter will filter the results for file names that match a pattern

### Linux: Searching within Files

- `grep` used to match words within files
- `grep <word> farm_animals.txt` will look for a particular word if the \* would search in multiple files that match the file type

### Windows: Input, Output, and the Pipeline

- `echo` is an alias for Write-Output
- Input/output steams, There are three of them
  - stdin: provide input to the input stream here
  - stdout: input data flows out of the process
  - stderr:
  - `>` redirection operator
  - `>>` to append to a file
  - `|` to send the input of one command to the input of another command
    - `cat words.txt | Select-String st` this will return a list of words that contain the word st
    - `cat words.txt | Select-String st > st_words.txt` this will grab the output of the file and add it to the st_words file
  - `rm secure_file 2> errors.txt` then `cat errors.txt` you will be able to see error messages instead of a print out of the error
    - 1: stdout - the output
    - 2: stderr- the error
    - When adding the number to to the error after the > this will only return the error and not the message
  - `$null` variable for nothing --> if the error messages are redirected to $null will return the error messages to nothing

### Linux: Input, Output and Pipeline

- Similar to windows there are 3 different IO streams
  - stdin
  - stdout
  - stderr
- `>` redirection operator still occurs here
- `>>` used when trying to append instead of creating or deleting a new file
- `2>` is the standard operator for linux
- `ls /dir/fake_dir 2> error_output.txt` this will log all of the errors to the output of the file
- `cat error_output.txt` will show the errors that were encountered
- `<` in Lunyx machine this will redirect the standard input
- `/dev/null` file to use as null value
- `|` `ls -la /etc | grep bluetooth` this will take the output of the ls -la and send it to the grep command

### Windows and Linux Advanced Navigation

- Regular expressions: used to help you do advanced pattern-based selection
-
